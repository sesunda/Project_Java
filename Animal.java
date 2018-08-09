
public abstract class Animal {
	abstract void walk();
}


class Solution {
	public static void main(String[] args) {
		
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		Duck duck = new Duck();
		duck.sound();
		duck.swim();
		
		Chicken chicken = new Chicken();
		chicken.sound();
		chicken.fly();
		
		//Rooster Inherited from Chicken
		Rooster rooster = new Rooster();
		rooster.sound();
						
		//RoosterNotInherited from Chicken
		RoosterNotInherited roosterNotInherited = new RoosterNotInherited();
		roosterNotInherited.useRoosterSoundsChicken();
		
		//Static
		ParrotwithDogs parrotwithDogs = new ParrotwithDogs();
		parrotwithDogs.parrotsound();
		
		ParrotwithCats parrotwithCats = new ParrotwithCats();
		parrotwithCats.parrotsound();
		
		//Dynamic
		ParrotwithRooster parrotwithRooster = new ParrotwithRooster();
		parrotwithRooster.sound();
	}
}
