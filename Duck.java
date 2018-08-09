
public class Duck extends Bird {
	void sound() {
		System.out.println("Quack Quack");
	}
	
	void swim() {
		System.out.println("Ducks swim!!!");
	}
	
	@Override
	void fly() {
		System.out.println("I am Duck Flying");
	}
	
	@Override
	void walk() {
		// TODO Auto-generated method stub
		super.walk();
		System.out.println(" and I am Duck");
	}
}