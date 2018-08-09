package Animal_Package;

public class Fish extends Animal{
	
	String size;
	String color;
	String name;
	
	public Fish(String size,String color, String name) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.color = color;
		this.name = name;
	}
	public String walk() {
		return "I cannot Walk";
	}
	
	public String swim() {
		return "Fishes do swim!!!";
	}
	
	public String feed(Boolean eat) {
		if (eat)
			return "I eat other fish";
		else
			return "I don't eat other fish";
	}
}
