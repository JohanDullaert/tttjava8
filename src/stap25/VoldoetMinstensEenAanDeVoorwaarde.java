package stap25;

import java.util.Arrays;
import java.util.List;

public class VoldoetMinstensEenAanDeVoorwaarde {

	public static void main(String[] args) {

		List<String> groenten = Arrays.asList("sla", "wortel", "kool", "sla");
		System.out.println("is er een groente 4 letters lang = " + 
						groenten.stream()
								.anyMatch(groente -> groente.length() == 4)
				);

	}

}
