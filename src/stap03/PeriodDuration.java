package stap03;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodDuration {

	public static void main(String[] args) {
		
		LocalDate geboren = LocalDate.of(1974, 4, 2);
		LocalDate vandaag = LocalDate.now();
		System.out.println(vandaag.isAfter(geboren));
		Period periode = Period.between(geboren, vandaag);
		System.out.println(periode.getYears());
		System.out.println(periode.getMonths());
		System.out.println(periode.getDays());
		
		LocalTime begonnen = LocalTime.of(9, 30);
		LocalTime nu = LocalTime.now();
		Duration duurtijd = Duration.between(begonnen, nu);
		System.out.println(duurtijd.toHours());
		System.out.println(duurtijd.toMinutes());
		
	}

}
