package application;

import java.time.*;

public class OperacoesDataHora {

    public static void main(String[] args){

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        // dia, mes e ano
        System.out.println("d01 dia = " + d01.getDayOfMonth() );
        System.out.println("d01 mes = " + d01.getMonthValue());
        System.out.println("d01 mes = " + d01.getYear());

        // horas e minutos
        System.out.println("d02 hora = " + d02.getHour());
        System.out.println("d02 minutos = " + d02.getMinute());



    }

}
