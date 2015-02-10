package stap19;

import java.util.Arrays;
import java.util.List;

public class Filteren {

	public static void main(String[] args) {
		
		List<String> groenten = Arrays.asList("sla", "wortel", "kool", "biet");
		groenten.stream()
				.filter(groente ->  groente.contains("o"))
				.filter(groente -> groente.length() == 4)
				.forEach(groente -> System.out.println(groente));
	}

}
