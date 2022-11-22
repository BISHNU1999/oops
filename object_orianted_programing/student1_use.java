package object_orianted_programing;

public class student1_use {
	public static void main(String[] args){
		Student1 s1=new Student1();
		s1.name="bishnu";
		//s1.rollNumber=1145; this syntex give us error
		// because in Student1 rollNumber is a private 
		//type 
		
		s1.setrollNumber(123);
		 int roll = s1.getrollNumber();
		 System.out.println(s1.name + roll);
		
	}

}
