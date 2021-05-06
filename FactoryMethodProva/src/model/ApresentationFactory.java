package model;

public class ApresentationFactory {

	public ApresentationFactory() {};
	
	public Name getName(String name) {
		String[] nomeSep = name.split(" ");
		String firstName = nomeSep[0];
		String surname = nomeSep[nomeSep.length - 1];
		if (firstName.charAt(firstName.length() - 1) == ',') {
			String[] primeiro = firstName.split(",");
			return new CommaName(surname, primeiro[0]);
		} else {
			if (nomeSep.length == 2) {
				return new DoubleName(firstName, surname);
			} else if (nomeSep.length > 2) {
				return new FullName(firstName, surname);
			}
		}
		return null;
		
	}
}
