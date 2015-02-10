package stap14;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LambdaInvariabele {
	
	public static void main(String[] args) {
		System.out.println("1. sorteren van Z-A, 2. sorteren volgens lengte");
		Scanner scanner = new Scanner(System.in);
		int keuze = scanner.nextInt();
		Comparator<String> lambda;
		if (keuze == 1){
			lambda = (naam1, naam2) ->  -naam1.compareTo(naam2);
		} else {
			lambda = (naam1, naam2) -> naam1.length() - naam2.length();
		}
		
		Set<String> daltons = new TreeSet<>(
				lambda
				);
		daltons.add("Joe");
		daltons.add("Jack");
		daltons.add("William");
		daltons.add("Averell");
		System.out.println(daltons);		

	}

}
