package inherit;

//Encapsulation, getters and setters

public class Encapsulation {
	private int age;
	private String name;
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int myAge) {
		age=myAge;//can also use this.age.. as global name on left of equal of local variable name
			//by param
	}
	//public void setAge(int age) {
	//	this.age = age;
	//}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}

