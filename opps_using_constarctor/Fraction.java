package opps_using_constarctor;

public class Fraction {
	 int numerator;
	 int denominator;
	 public Fraction(int numerator, int denominator) {
		 this.numerator=numerator;
		 this.denominator=denominator;
		 simplify();
		 }
	public int getnumerator() {
		return numerator;
		
	}
	public int getdenominator() {
		return denominator;
		
	}
	 public void setnumerator( int rn) {
		 numerator=rn;
		 simplify();
	 }
	 public void setdenominator( int rn) {
		 denominator=rn;
		 simplify();
	 }
	 public void print(){
		 if(denominator==1) {
			 System.out.println(numerator);
		 }else {
			 System.out.println(numerator+"/"+denominator);
		 }
		 
	 }
	 private void simplify(){ 
		 int gcd=1;
		 int small=Math.min(numerator,denominator);
		 for(int i=2;i<=small;i++) {
			 if(numerator%i==0&& denominator%i==0) {
				 gcd=i;
			 }
			 
		 }
		 numerator=numerator/gcd;
		 denominator=denominator/gcd;
		
		
		 
	 }
    public void  add(Fraction f) {
     this.numerator=this.numerator*f.denominator+this.denominator*f.numerator; 
      this.denominator=this.denominator*f.numerator;
      simplify();
    	
    }
    public void addition(Fraction fr, Fraction f) {
    	int newnum=fr.numerator*f.denominator+f.numerator*+fr.denominator;
    	int newdn=fr.denominator*f.denominator;
    	numerator=newnum;
    	denominator=newdn;
    	simplify();
    	
    	
    }
    

}
