package Seção11;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Data {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println("d01: " + d01);
        System.out.println("d02: " + d02);
        System.out.println("d03: " + d03);
        System.out.println("d04: " + d04);
        System.out.println("d05: " + d05);
        System.out.println("d06: " + d06);
        System.out.println("d07: " + d07);
        System.out.println("d08: " + d08);
        System.out.println("d09: " + d09);
        System.out.println("d10: " + d10);
        System.out.println("d11: " + d11);

        System.out.println("--------------------------------");

        System.out.println("d04: " + d04.format(fmt1));
        System.out.println("d05: " + d05.format(fmt1));
        System.out.println("d05: " + d05.format(fmt2));
        System.out.println("d06: " + fmt3.format(d06));
        System.out.println("d06: " + fmt5.format(d06));

        System.out.println("--------------------------------");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("do4 dia = " + d04.getDayOfMonth());
        System.out.println("do4 mes = " + d04.getMonthValue());
        System.out.println("do4 ano = " + d04.getYear());

        System.out.println("do5 hora = " + d05.getHour());
        System.out.println("do5 minuto = " + d05.getMinute());

        System.out.println("--------------------------------------");

        LocalDate pastWeek = d04.minusDays(7);
        LocalDate nextWeek = d04.plusDays(7);
        LocalDate nextSevenYear = d04.plusYears(7);
        LocalDateTime pastWeekTime = d05.minusDays(7);
        LocalDateTime nextWeekTime = d05.plusDays(7);
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("Past week = " + pastWeek);
        System.out.println("Next week = " + nextWeek);
        System.out.println("Plus years = " + nextSevenYear);
        System.out.println("Past week time = " + pastWeekTime);
        System.out.println("Next week time = " + nextWeekTime);
        System.out.println("Past week instant = " + pastWeekInstant);
        System.out.println("Next week instant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeek.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
    }
}