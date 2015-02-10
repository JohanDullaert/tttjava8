package stap29;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;

public class MultiThreading {

	private static final int AANTAL = 100_000_000;

	public static void main(String[] args) {
		Random random = new Random();
		double getallen[] = new double[AANTAL];
		for (int i = 0; i != getallen.length; i++) {
			getallen[i] = random.nextDouble();
		}

		long start = System.nanoTime();
		OptionalDouble grootste = Arrays.stream(getallen)
				.parallel()
				.reduce(
				(vorigeGrootste, huidigGetal) -> Double.max(vorigeGrootste,
						huidigGetal));
		grootste.ifPresent(getal -> System.out.println(getal));
		System.out.println(System.nanoTime() - start);
		/*
		 * single threaded:
		 * 1000 => 			 35952434
		 * 1_000_000 => 	 43743320
		 * 100_000_000 => 	290116004
		 * 
		 * multi threaded:
		 * 1000 => 			 82437134
		 * 1_000_000 =>		103321692	
		 * 100_000_000 =>	154914911
		 */
	}

}
