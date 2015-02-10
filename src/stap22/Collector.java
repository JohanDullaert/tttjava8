package stap22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collector {

	public static void main(String[] args) {
		
		List<String> groenten = Arrays.asList("sla", "wortel", "kool", "sjalot");
		List<String> sGroenten = zoekDeGroentenDieBeginnenMetEenS(groenten);
		
		System.out.println(sGroenten);
				
	}
	
	private static List<String> zoekDeGroentenDieBeginnenMetEenS(List<String> groenten){
		return groenten.stream()
						.filter(groente -> groente.startsWith("s"))
						.collect(Collectors.toList());
	}

}
