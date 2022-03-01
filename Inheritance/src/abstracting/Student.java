package abstracting;

public class Student extends Person {
	
	private int studentID;
	
	public Student(String na, String gen, int id) {
		super(na, gen);
		this.studentID=id;
	}
	
	@Override
	public void Studying() {
		if (studentID == 0) {
			System.out.println("Not studying");
		}
		else {
			System.out.println("Pursuing a Degree in Bachelor of Engineering");
		}
	}

	public static void main(String[] args) {
		// coding in terms of abstract classes
		Person student=new Student("Priya", "Female", 0);
		Person student2=new Student("Karan", "Male", 201021);
		Person student3=new Student("Kumari", "Female", 101021);
		Person student4=new Student("John", "Male", 201661);
		
		student.Studying();
		student2.Studying();
		student3.Studying();
		student4.Studying();

	}

}
