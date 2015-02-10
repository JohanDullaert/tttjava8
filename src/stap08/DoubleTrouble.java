package stap08;

import java.util.Arrays;
import java.util.List;

public class DoubleTrouble {

	// classic junior Java:
	
	public static void woordenMetDeLetterO(List<String> woorden) {
		for (String woord : woorden) {
			if (woord.contains("o")){
				System.out.println(woord);				
			}
		}

	}
	
	public static void woordenMet4Letters(List<String> woorden){
		for (String woord : woorden) {
			if (woord.length() == 4){
				System.out.println(woord);				
			}
		}
	}
	
	public static void main (String ... args){
		List<String> woorden = Arrays.asList("sla", "wortel", "kool", "biet");
		woordenMetDeLetterO(woorden);
		woordenMet4Letters(woorden);
	}

}
