package stap10;

import java.util.Arrays;
import java.util.List;

import stap09.Voorwaarde;

public class LambdaToTheRescue {

	public static void woordenMet(List<String> woorden, Voorwaarde voorwaarde){
		for (String woord : woorden) {
			if (voorwaarde.test(woord)){
				System.out.println(woord);				
			}
		}
	}
	
	public static void main (String ... args){
		List<String> woorden = Arrays.asList("sla", "wortel", "kool", "biet");
		woordenMet(woorden, (String woord) -> woord.contains("o"));
		woordenMet(woorden, (String woord) -> woord.length() == 4);		
	}
}
