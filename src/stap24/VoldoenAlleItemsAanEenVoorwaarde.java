package stap24;

import java.util.Arrays;
import java.util.List;

public class VoldoenAlleItemsAanEenVoorwaarde {

	public static void main(String[] args) {
		
		List<String> groenten = Arrays.asList("sla", "wortel", "kool", "sla");
		System.out.println("zijn alle groenten 4 letters lang = " + 
						groenten.stream()
								.allMatch(groente -> groente.length() == 4)
				);

	}

}
