package br.gov.mt.mtloginjavabackend.security.utils;

import br.gov.mt.mtloginjavabackend.security.user.MtUser;
import br.gov.mt.mtloginjavabackend.security.user.MtUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserHelper {

    private final MtUserService userService;

    public String getCpfFromPrincipal() {
        return getMtUserFromPrincipal()
                .getCpf()
                .replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }

    public MtUser getMtUserFromPrincipal() {
        Jwt principal1 = (Jwt) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();
        String email = principal1.getClaim("email");
        Optional<MtUser> mtUserOpt = userService.findByEmail(email);
        return mtUserOpt.orElse(null);
    }

    public String getMtUserEmail() {
        Jwt principal1 = (Jwt) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();
        return principal1.getClaim("email");
    }
}
