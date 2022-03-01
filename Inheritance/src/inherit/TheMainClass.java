package inherit;

//Encapsulation, other class is Encapsulation

public class TheMainClass {

	public static void main(String[] args) {
		Encapsulation s = new Encapsulation();
		s.setName("Suma");
		s.setAge(31);
		
		System.out.println(s.getAge());
		
		s.setAge(55);
		
		System.out.println(s.getAge());
		
		System.out.println(s.getName());

	}

}
