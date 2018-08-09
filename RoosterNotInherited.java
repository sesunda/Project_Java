
public class RoosterNotInherited {
	
private Chicken chicken;
	
      RoosterNotInherited(){
		chicken = new Chicken();
	}
	
	void useRoosterSoundsChicken() {
		chicken.sound();
	} 
	
	void RoostersOwnSound() {
		System.out.println("I am mine own Cock-a-doo....");
	}
}
