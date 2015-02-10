package stap10;

public interface Voorwaarde {
	
	boolean test(String woord);

}

// lambda implementeert een interface met één abstracte method

// lambda syntax:
/* (ParameterType parameterNaam) -> returnWaarde
 * 
 * (String woord) -> woord.contains("o")
 * 
 * (String woord) -> woord.length() == 4
 * 
 * dit zijn dus implementaties van deze interface
 * 
 */
