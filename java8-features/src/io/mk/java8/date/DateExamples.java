package io.mk.java8.date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateExamples {

	static DateTimeFormatter dtfDateTime = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");

	private static void testDate() {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(dtfDateTime.format(localDateTime));

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(dtfDateTime.format(zonedDateTime));
		System.out.println(zonedDateTime.getOffset());

		ZonedDateTime zonedDateTime2 = ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		System.out.println(zonedDateTime2);
	}

	private static void testLocalDate() {
		Instant now = Instant.now();

		LocalDateTime localDateTime = LocalDateTime.ofInstant(now, ZoneId.systemDefault());
		System.out.println(dtfDateTime.format(localDateTime));

		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, ZoneId.systemDefault());
		System.out.println(dtfDateTime.format(zonedDateTime));
	}

	public static void main(String[] args) {
		testDate();
		testLocalDate();
	}

}
