package stap01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateLocalTime {

	public static void main(String[] args) {
		
		// LocalDate heeft geen constructors wel factory methods
		LocalDate vandaag = LocalDate.now();
		System.out.println(vandaag);
		LocalDate beginEuro = LocalDate.of(2002, Month.JANUARY, 1);
		System.out.println(beginEuro);
		LocalDate napoleon = LocalDate.of(1769, 8, 1);
		System.out.println(napoleon);
		
		LocalTime nu = LocalTime.now();
		System.out.println(nu);
		LocalTime begin = LocalTime.of(9, 30);
		System.out.println(begin);
		
		LocalDateTime vandaagEnNu = LocalDateTime.now();
		System.out.println(vandaagEnNu);

	}

}
