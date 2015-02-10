package stap09;

public class Bevat4Letters implements Voorwaarde {

	@Override
	public boolean test(String woord) {		
		return woord.length() == 4;
	}

}
