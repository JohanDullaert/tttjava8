package stap18;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBronnen {

	public static void main(String[] args) {

		// met streams kan je de oorspronkelijke bron niet aanpassen

		// List = bron van data
		List<Integer> heiligeGetallen = Arrays.asList(3, 7, 49);
		Stream<Integer> getalStroom = heiligeGetallen.stream();
		getalStroom.forEach(getal -> System.out.println(getal));

		// Array = bron van data
		String[] voornamen = { "Adam", "Eva" };
		Stream<String> voornaamStroom = Arrays.stream(voornamen);
		voornaamStroom.forEach(voornaam -> System.out.println(voornaam));

		// String = bron van data
		"waar blijft Jean".chars().forEach(
				letter -> System.out.println((char) letter));

		// regels uit een tekstbestand = bron van data
		try {
			Files.lines(Paths.get("D:TTT03022015.txt")).forEach(
					regel -> System.out.println(regel));
			;
		} catch (IOException e) {
			e.printStackTrace();
		}

		// getallenreeks = bron van data
		IntStream enkeleGetallen = IntStream.rangeClosed(1, 5);
		enkeleGetallen.forEach(getal -> System.out.println(getal));

		// eindeloze stroom van even getallen
		Stream.iterate(0, vorigGetal -> vorigGetal + 2)
				.limit(10) // niet meer eindeloos nu
				.forEach(getal -> System.out.println(getal));

		Stream.iterate(LocalDateTime.now(),
				vorigeDatum -> vorigeDatum.plusDays(7)).limit(30)
				.forEach(datum -> System.out.println(datum));

		// lijst van bestanden in een directory = bron van data
		try {
			Path path = Paths.get("D:");
			DirectoryStream<Path> lijst = Files.newDirectoryStream(path);
			lijst.forEach(bestandOfSubDir -> System.out.println(bestandOfSubDir));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
