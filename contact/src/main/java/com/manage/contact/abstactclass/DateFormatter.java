package com.manage.contact.abstactclass;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static void main(String[] args) {
//        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("UTC"));
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
//        System.out.println(zdt.format(formatter));
        System.out.println(Instant.now());
        String text = Instant.now().toString();
        System.out.println(text);
        Instant lt
                = Instant.now();
        System.out.println(lt);

    }
}
