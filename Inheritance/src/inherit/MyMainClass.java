package inherit;


//Super class

class Aminal { //Superclass (parent)
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Doggie extends Aminal { //Subclass (child)
	public void animalSound() {
		super.animalSound(); //call the superclass method
		System.out.println("The dog says: ba-bow");
	}
}

public class MyMainClass {

	public static void main(String[] args) {
		Aminal myDog=new Doggie(); //create a Dog object
		myDog.animalSound(); //call the method on the Dog object

	}

}
