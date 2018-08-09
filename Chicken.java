package Animal_Package;

public class Chicken extends Bird{
	
	public String sound() {
		return "Buck Buck";
	}
	
	@Override
	public String fly() {
		return "My Wings are clipped!!!";
	}
}