package stap21;

import java.util.Arrays;
import java.util.List;

public class Transformeren {

	public static void main(String[] args) {
		
		List<String> groenten = Arrays.asList("sla", "wortel", "kool", "biet");
		groenten.stream()
				.map(groente ->  groente.length())
				.forEach(lengte -> System.out.println(lengte));
		
		groenten.stream()
				.map(groente -> new StringBuilder(groente).reverse().toString())
				.forEach(etneorg -> System.out.println(etneorg));
		
		System.out.println(groenten.stream()
									.mapToInt(groente ->  groente.length())
									.sum()
				);
		

	}

}
