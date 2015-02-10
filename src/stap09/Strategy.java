package stap09;

import java.util.Arrays;
import java.util.List;

public class Strategy {

	// met design pattern Strategy	
	
	public static void woordenMet(List<String> woorden, Voorwaarde voorwaarde){
		for (String woord : woorden) {
			if (voorwaarde.test(woord)){
				System.out.println(woord);				
			}
		}
	}
	
	public static void main (String ... args){
		List<String> woorden = Arrays.asList("sla", "wortel", "kool", "biet");
		woordenMet(woorden, new BevatO());
		woordenMet(woorden, new Bevat4Letters());		
	}
}
