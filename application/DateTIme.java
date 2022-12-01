package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTIme {

    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.parse("2022-11-05T01:30:26");
        Instant d03 = Instant.parse("2022-11-05T01:30:26Z");

        // Formatters
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        // Levará em consideração o default do usuário
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm ").withZone(ZoneId.systemDefault());

        // Utilizando o método ISO_
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d01 = "+ d01);
        System.out.println("d02 = "+ d02);
        System.out.println("d03 = "+ d03);

        // Utilizando o método format
        System.out.println("----------------");

        System.out.println("d01 = "+ d01.format(fmt1));
        System.out.println("d02 = "+ d02.format(fmt2));
        System.out.println("d03 = "+ fmt3.format(d03));

        System.out.println("----------------");
        System.out.println("d02 = "+ d02.format(fmt5));
        System.out.println("d03 = "+ fmt6.format(d03));
    }
}
