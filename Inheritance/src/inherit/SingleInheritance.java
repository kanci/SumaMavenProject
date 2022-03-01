package inherit;

import java.util.*;


public class SingleInheritance extends Teacher {
	
	String mainSubject = "Sparks";

	public static void main(String[] args) {
		SingleInheritance obj = new SingleInheritance();
		System.out.println(obj.collegeName);
		System.out.println(obj.mainSubject);
		obj.does();

	}

}
