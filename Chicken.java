
public class Chicken extends Bird{
	void sound() {
		System.out.println("Quack Quack");
	}
	
	@Override
	void fly() {
		System.out.println("Cannot...My Wings are clipped!!!");
	}
}
