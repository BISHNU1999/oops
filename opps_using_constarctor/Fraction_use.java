package opps_using_constarctor;

public class Fraction_use {
	public static void main(String[] args) {
		Fraction f1= new Fraction(20,30);
		f1.print();
		f1.setnumerator(12);
		f1.print();
		Fraction f2= new Fraction(19,25);
		f2.print();
		f2.setdenominator(19);
		f2.print();
		int den=f1.getnumerator();
		System.out.println(den);
		f1.add(f2);
		f1.print();
		f2.print();
		Fraction f4=new Fraction(8,9);
	   f4.print();
	   f4.addition(f1, f2);
	   f4.print();
	   System.out.println(" thank you");
	   
	}

}
