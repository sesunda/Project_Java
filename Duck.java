package Animal_Package;

public class Duck extends Bird {
	public String sound() {
		return "Quack Quack";
	}
	
	public String swim() {
		return "Ducks swim!!!";
	}
	
	@Override
	public String fly() {
		return "I am Duck Flying";
	}
	
	@Override
	public String walk() {
		// TODO Auto-generated method stub
		super.walk();
		return super.walk() + " , I am Duck";
	}
}