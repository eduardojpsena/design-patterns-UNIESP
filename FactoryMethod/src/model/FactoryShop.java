package model;

public class FactoryShop {
	
	public FactoryShop() {};
	
	public Gender getGender(String name, String type) {
		if(type.equals("m")) {
			return new Male(name, type);
		}else if (type.equals("f")) {
			return new Female(name, type);
		} else if (type.equals("i")){
			return new Gender(name, type);
		}else {
			return null;
		}	
	}
}
