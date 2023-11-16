package Java_11.OnlyInterface;

public class KyotoCleaningService implements CleaningService {
	String ownerName;
	String address;
	String phone;
	
	//シャツを洗う
	public Shirt washShirt(Shirt s) {
		return s;
	}
	
	//タオルを洗う
	public Towl washTowl(Towl t) {
		return t;
	}
	
	//コートを洗う
	public Coat washCoat(Coat c) {
		return c;
	}
}
