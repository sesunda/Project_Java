abstract class Parrot extends Bird{
	abstract void parrotsound();
}

//Parrot lives near Dogs - Static
class ParrotwithDogs extends Parrot{
	void parrotsound() {
		System.out.println("Woof,Woof...");
	}
}

//Parrot lives near cats
class ParrotwithCats extends Parrot{
	void parrotsound() {
		System.out.println("Meow,Meow...");
	}
}

//Dynamic
class ParrotwithRooster extends Rooster{}