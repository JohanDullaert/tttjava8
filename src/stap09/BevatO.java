package stap09;

public class BevatO implements Voorwaarde {

	@Override
	public boolean test(String woord) {		
		return woord.contains("o");
	}

}
