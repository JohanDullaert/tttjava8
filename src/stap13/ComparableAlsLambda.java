package stap13;

import java.util.Set;
import java.util.TreeSet;

public class ComparableAlsLambda {

	public static void main(String[] args) {
		Set<String> daltons = new TreeSet<>();
		daltons.add("Joe");
		daltons.add("Jack");
		daltons.add("William");
		daltons.add("Averell");
		System.out.println(daltons);
		
		Set<String> daltonsComparableAlsLambda = new TreeSet<>(
				(naam1, naam2) -> -naam1.compareTo(naam2) //naam1.length() - naam2.length()
				);
		daltonsComparableAlsLambda.add("Joe");
		daltonsComparableAlsLambda.add("Jack");
		daltonsComparableAlsLambda.add("William");
		daltonsComparableAlsLambda.add("Averell");
		System.out.println(daltonsComparableAlsLambda);
		

	}

}
