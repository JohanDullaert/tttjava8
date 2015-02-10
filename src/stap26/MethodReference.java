package stap26;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		
		List<String> groenten = Arrays.asList("sla", "wortel", "kool", "sla");
		groenten.stream()
				.forEach(groente -> System.out.println(groente));		
		
		groenten.stream()
				.forEach(System.out::println);

	}

}
