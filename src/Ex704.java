
public class Ex704 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.id = 20221004;
		s1.name = "황진희"; //
		s1.printInfo();
		
		s2.insertRecord(20021004, "김미경"); 
		s2.printInfo();
		
		Student s3 = new Student(20221006, "김성민");
		s3.printInfo();

	}

}
