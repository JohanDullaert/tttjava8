package stap02;

import java.time.LocalDate;

public class Ingredi�nten {

	public static void main(String[] args) {
		
		LocalDate vandaag = LocalDate.now();
		System.out.println(vandaag.getYear());
		System.out.println(vandaag.isLeapYear());
		System.out.println(vandaag.lengthOfMonth());
	
	}

}
