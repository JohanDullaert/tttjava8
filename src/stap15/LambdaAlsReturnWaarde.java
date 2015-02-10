package stap15;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LambdaAlsReturnWaarde {
	
	public static Comparator<String> deKeuzeVanMama(){
		System.out.println("1. sorteren van Z-A, 2. sorteren volgens lengte");
		Scanner scanner = new Scanner(System.in);
		int keuze = scanner.nextInt();
		
		if (keuze == 1){
			return (naam1, naam2) ->  -naam1.compareTo(naam2);
		} else {
			return (naam1, naam2) -> naam1.length() - naam2.length();
		}		
	}
	
	public static void main(String[] args) {		
		Set<String> daltons = new TreeSet<>(
				deKeuzeVanMama()
				);
		daltons.add("Joe");
		daltons.add("Jack");
		daltons.add("William");
		daltons.add("Averell");
		System.out.println(daltons);
	}

}
