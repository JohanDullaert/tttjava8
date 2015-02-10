package stap17;

import java.util.Optional;

public class Leraar {
	
	private String naam;
	// Optional is niet serializable. Het is de bedoeling dit als return type te gebruiken en NIET als variabele.
	private String bijnaam;
	
	public Leraar(String naam) {
		this.naam = naam;
	}

	public Leraar(String naam, String bijnaam) {
		this.naam = naam;
		this.bijnaam = bijnaam;
	}

	public String getNaam() {
		return naam;
	}

	public Optional<String> getBijnaam() {
		return Optional.ofNullable(bijnaam);
	}	

}
