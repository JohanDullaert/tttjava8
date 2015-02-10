package stap20;

import java.util.Arrays;
import java.util.List;

public class Sorteren {

	public static void main(String[] args) {
		
		List<String> groenten = Arrays.asList("sla", "wortel", "kool", "biet");
		groenten.stream()
				.filter(groente -> groente.length() == 4)
				.sorted()
				.forEach(groente -> System.out.println(groente));
		
		groenten.stream()
				.sorted((groente1, groente2) -> groente1.length() - groente2.length())
				.forEach(groente -> System.out.println(groente));

	}

}
