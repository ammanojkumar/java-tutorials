package io.mk.java8.date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {

	public static void main(String[] args) {
		Duration duration = Duration.of(1, ChronoUnit.HOURS);
		System.out.println(duration.getSeconds());

		Duration duration2 = Duration.ofDays(5);
		System.out.println(duration2.toHours());

		LocalDateTime ldt1 = LocalDateTime.of(2021, 2, 13, 0, 0);
		LocalDateTime ldt2 = LocalDateTime.of(2021, 2, 13, 12, 45);
		System.out.println(ldt2.isBefore(ldt2));
		System.out.println(Duration.between(ldt1, ldt2).getSeconds());
	}
}
