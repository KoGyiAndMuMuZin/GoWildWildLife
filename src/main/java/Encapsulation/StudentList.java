package Encapsulation;

public class StudentList {
	public static void main (String[] args) {
	StudentContent s1 = new StudentContent();
	StudentContent s2 = new StudentContent();
	StudentContent s3 = new StudentContent();
	s1.setName("MayPhoo");
	s2.setName("Mu Mu Zin");
	s3.setName("Seng Hkam");
	s1.setAge(28);
	s2.setAge(20);
	s3.setAge(19);
	System.out.println("S1 Name "+s1.getName());
	System.out.println("S2 Name "+s2.getName());
	System.out.println("S3 Name "+s3.getName());
	
	}
}
