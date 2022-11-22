package opps_using_constarctor;

public class student {
	
	String name;
	 final int roll;
	public student(String name,int roll) {
		this.name=name;
		this.roll=roll;
	 }
	
 public void print() {
	 System.out.println(name +roll);
 }
}
