package Unit_Test;

import org.junit.Assert;
import org.junit.Test;

import Animal_Package.Bird;
import Animal_Package.Chicken;
import Animal_Package.Duck;
import Animal_Package.ParrotswithDogs;
import Animal_Package.Rooster;
import Animal_Package.RoosterNotInherited;

public class Animal_Objects_Test {
	
	@Test
	public void CreateBird() {
		
		String birdwalk = "I am a Bird, walking";
		String birdfly = "I am a Bird, flying";
		String birdsing = "I am a Bird, singing";
		
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		Assert.assertEquals(bird.walk(),birdwalk);
		Assert.assertEquals(bird.fly(),birdfly);
		Assert.assertEquals(bird.sing(),birdsing);
	}
	
	public void CreateChicken() {
		String chickensound = "Buck Buck";
		String chickenfly = "My Wings are clipped!!!";
		
		Chicken chicken = new Chicken();
		
		chicken.fly();
		
		Assert.assertEquals(chicken.sound(),chickensound);
		Assert.assertEquals(chicken.fly(),chickenfly);
		
	}
	
	public void CreateDuck() {
		String duckfly = "I am Duck Flying";
		String ducksound = "Quack Quack";
		String duckswim = "Ducks swim!!!";
		String duckwalk = "I am a Bird, walking , I am Duck";
		
		Duck duck = new Duck();
		
		Assert.assertEquals(duck.fly(),duckfly);
		Assert.assertEquals(duck.sound(),ducksound);
		Assert.assertEquals(duck.swim(),duckswim);
		Assert.assertEquals(duck.walk(),duckwalk);
	}

	public void CreateRooster(){
		String roostersound = "Cock-a-doodle-doo";
		
		Rooster rooster = new Rooster();
		Assert.assertEquals(rooster.sound(),roostersound);
	}
	
	//This RoosterNotInherited from Chicken
	public void CreateRoosterNotInherited() {
		String roostersoundChicken = "Buck Buck";
		String roostersOwnSound = "I am mine own Cock-a-doo....";
		
		RoosterNotInherited roosterNotInherited = new RoosterNotInherited();
		
		Assert.assertEquals(roosterNotInherited.useRoosterSoundsChicken(),roostersoundChicken);
		Assert.assertEquals(roosterNotInherited.RoostersOwnSound(),roostersOwnSound);
	}
	
	public void CreateParrots() {
		String parrotwithDogsSound = "Woof,Woof...";
		
		ParrotswithDogs parrotwithDogs = new ParrotswithDogs();
		Assert.assertEquals(parrotwithDogs.parrotsound(),parrotwithDogsSound);
	}
}
