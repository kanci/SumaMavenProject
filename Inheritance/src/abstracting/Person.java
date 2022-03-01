package abstracting;

public abstract class Person {
	
	private String name;
	private String gender;
	
	public Person(String na, String gen) {
		this.name=na;
		this.gender=gen;
	}
	
	public abstract void Studying();
	
	@Override
	public String toString() {
		return "Name="+this.name+"::Gender="+this.gender;
	}

}
