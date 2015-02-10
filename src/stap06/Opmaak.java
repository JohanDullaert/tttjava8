package stap06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Opmaak {

	public static void main(String[] args) {
		
		LocalDate vandaag = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(formatter.format(vandaag));

	}

}
