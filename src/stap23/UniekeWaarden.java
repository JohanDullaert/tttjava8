package stap23;

import java.util.Arrays;
import java.util.List;

public class UniekeWaarden {

	public static void main(String[] args) {
		
		List<String> groenten = Arrays.asList("sla", "wortel", "kool", "sla");
		groenten.stream()
				.distinct()
				.sorted()
				.forEach(groente -> System.out.println(groente));

	}

}
