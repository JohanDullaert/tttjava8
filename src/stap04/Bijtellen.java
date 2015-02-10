package stap04;

import java.time.LocalDate;
import java.time.LocalTime;

public class Bijtellen {

	public static void main(String[] args) {
		
		LocalDate vandaag = LocalDate.now();
		LocalDate uitersteBetaalDatum = vandaag.plusDays(30);
		System.out.println(uitersteBetaalDatum);
		
		LocalTime begonnenKoken = LocalTime.now();
		LocalTime rijstIsKlaar = begonnenKoken.plusMinutes(10);
		System.out.println(rijstIsKlaar);

	}

}
