package br.gov.mt.mtloginjavabackend.security.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyUtils {
    //FORMATANDO A DATA PARA O FORMATO BRASILEIRO
    public static String formatarDataParaBrFormat(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    //FORMATANDO A DATA PARA O FORMATO BRASILEIRO
    public static LocalDate patternToLocalDate(String dateString) {
        return LocalDateTime
                .parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S"))
                .toLocalDate();
    }

    public static String decodeBase64(String base64) {
        return new String(java.util.Base64
                .getDecoder()
                .decode(base64));
    }
}
