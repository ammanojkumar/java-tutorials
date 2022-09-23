package io.mk.java8.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateExamples {

	static DateTimeFormatter dtfDateTime = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
	static DateTimeFormatter dtfDateTimeZ = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss Z");

	private static void testLocalDateTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime:		" + localDateTime);
		System.out.println("SDF localDateTime:	" + dtfDateTime.format(localDateTime));

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("zonedDateTime:		" + zonedDateTime);
		System.out.println("SDF zonedDateTime:	" + dtfDateTimeZ.format(zonedDateTime));
		System.out.println(zonedDateTime.getOffset());

		ZonedDateTime zonedDateTime2 = ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		System.out.println("Zone: " + zonedDateTime2);
	}

	private static void testLocalDate() {
		LocalDate date = LocalDate.now();
		System.out.println("\nToday		: " + date);
		System.out.println("Yesterday	: " + date.minusDays(1));
		System.out.println("Next Month	: " + date.plusMonths(2));

		LocalDateTime localDateTime = date.atTime(4, 30, 00);
		System.out.println("localDateTime	: " + localDateTime);

		LocalDate date2 = LocalDate.of(2017, 1, 13);
		System.out.println("Is leap year	: " + date2.isLeapYear());

		LocalDate parseDate = LocalDate.parse("2022-12-31");
		System.out.println("parseDate	: " + parseDate);
	}

	private static void testLocaTime() {
		LocalTime time = LocalTime.of(23, 59);
		System.out.println("\nTime		: " + time);
		System.out.println("Time + Hour	: " + time.plusHours(1));
		ZoneId zone1 = ZoneId.of("+05:30");
		System.out.println(zone1);
		long secBetw = ChronoUnit.SECONDS.between(LocalTime.now(), LocalTime.now().plusHours(2));
		System.out.println("secBetw		: "+ secBetw);
	}

	public static void main(String[] args) {
		testLocalDateTime();
		testLocalDate();
		testLocaTime();
	}

}
