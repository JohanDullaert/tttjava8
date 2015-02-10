package stap05;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class AndereSprongen {

	public static void main(String[] args) {

		LocalDate vandaag = LocalDate.now();
		LocalDate eersteDagVanMaand = vandaag.with(TemporalAdjusters
				.firstDayOfMonth());
		System.out.println(eersteDagVanMaand);
		LocalDate eersteZaterdagVanMaand = vandaag.with(TemporalAdjusters
				.firstInMonth(DayOfWeek.SATURDAY));
		System.out.println(eersteZaterdagVanMaand);
		LocalDate volgendeZondag = vandaag.with(TemporalAdjusters
				.next(DayOfWeek.SUNDAY));
		System.out.println(volgendeZondag);
		
	}

}
