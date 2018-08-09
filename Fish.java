
abstract class Fish extends Animal{

	@Override
	void walk() {
		System.out.println("I cannot walk");		
	}
	
	abstract void swim();
}
