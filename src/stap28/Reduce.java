package stap28;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

	public static void main(String[] args) {
		 // voor statistische informatie
		List<Integer> heiligeGetallen = Arrays.asList(3, 7, 49);
		System.out.println(heiligeGetallen.stream()
						.mapToInt(getal -> getal)
						.sum());
		
		List<BigDecimal> specialeGetallen = Arrays.asList(BigDecimal.valueOf(3.14), 
				 										BigDecimal.valueOf(2.71), 
				 										BigDecimal.valueOf(1.618));
		BigDecimal totaal = specialeGetallen.stream()
						.reduce(BigDecimal.ZERO, (vorigTotaal, huidgeGetal) -> vorigTotaal.add(huidgeGetal));
		
		/*
		 * lambda wodt 3 keer opgeroepen
		 * 1. (0, 3.14)	-> 3.14
		 * 2. (3.14, 2.71) -> 5.85
		 * 3. (5.85, 1.618) -> 7.468
		 */
		
		System.out.println(totaal);
		
//		BigDecimal kleinste = specialeGetallen.stream()
//												.reduce(BigDecimal.valueOf(Double.MAX_VALUE), 
//														(vorigeKleinste, huidigGetal) -> 
//												(vorigeKleinste.compareTo(huidigGetal) < 0) ? 
//														vorigeKleinste : huidigGetal);
		BigDecimal kleinste = specialeGetallen.stream()
				.reduce(BigDecimal.valueOf(Double.MAX_VALUE), 
						(vorigeKleinste, huidigGetal) -> 
							vorigeKleinste.min(huidigGetal));
		System.out.println(kleinste);
		
		Optional<BigDecimal> grootste = specialeGetallen.stream()
				.reduce((vorigeGrootste, huidigGetal) -> 
				vorigeGrootste.max(huidigGetal));
		grootste.ifPresent(getal ->System.out.println(getal));
	
	/*
	 * 1. vorigeGrootste = 3.14
	 * 2. (3.14, 2.71) -> 3.14
	 * 3. (3.14, 1.618) -> 3.14
	 */
		
	}
}
