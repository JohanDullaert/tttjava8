package stap17;

import java.util.Optional;

public class DeBlunderVanTony {

	public static void main(String[] args) {
		
		Leraar leraar1 = new Leraar("Kaas");
		Leraar leraar2 = new Leraar("Devos", "tante Maria");
		
		Optional<String> bijnaam2 = leraar2.getBijnaam();
		if (bijnaam2.isPresent()){
			System.out.println(bijnaam2.get());
		}
		
		Optional<String> bijnaam1 = leraar1.getBijnaam();
		if (bijnaam1.isPresent()){
			System.out.println(bijnaam1.get());
		}
		
		bijnaam1.ifPresent(deBijnaam -> System.out.println(deBijnaam));
		
		bijnaam2.ifPresent(deBijnaam -> System.out.println(deBijnaam));
		
	}
}

/*
 * class LeraarDAO {
 * public Optional<Leraar> read (long id){}
 * }
 */
