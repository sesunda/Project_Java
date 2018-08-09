package Animal_Package;

public class RoosterNotInherited {
	
private Chicken chicken;
	
      public RoosterNotInherited(){
		chicken = new Chicken();
	}
	
	public String useRoosterSoundsChicken() {
		return chicken.sound();
	} 
	
	public String RoostersOwnSound() {
		return "I am mine own Cock-a-doo....";
	}
}
