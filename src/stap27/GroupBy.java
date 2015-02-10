package stap27;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {

	public static void main(String[] args) {
		List<String> fruit = Arrays.asList("appel", "peer", "druif", "banaan");
		Map<Integer, List<String>> groepen = fruit.stream()
			.collect(Collectors.groupingBy(
								fruitje ->  fruitje.length()));
		System.out.println(groepen);
		groepen.entrySet()
				.stream()
				.forEach(entry -> {
					System.out.println(entry.getKey());
					entry.getValue()
							.stream()
							.forEach(fruitje -> System.out.println(fruitje));
							
				});		
	}
}
