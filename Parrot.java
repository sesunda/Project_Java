package Animal_Package;

abstract class Parrot extends Bird{
	abstract String parrotsound();
}

//Parrot lives near Dogs - Static


//Parrot lives near cats
class ParrotwithCats extends Parrot{
	public String parrotsound() {
		return "Meow,Meow...";
	}
}

//Dynamic
class ParrotwithRooster extends Rooster{}