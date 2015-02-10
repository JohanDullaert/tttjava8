package stap11;

public interface Voorwaarde {
	
	boolean test(String woord);

}

// lambda implementeert een interface met één abstracte method

// lambda syntax:
// het ziet dat het type (een String) in de methode van de interface
/* parameterNaam -> returnWaarde
 * 
 * woord -> woord.contains("o")
 * 
 * woord -> woord.length() == 4
 * 
 * dit zijn dus implementaties van deze interface
 * 
 */
