package opps_using_constarctor;

public class Dynamic_rray_use {

	public static void main(String[] args) {
		 DynamicArray arr= new DynamicArray();
		 for( int i=0;i<100;i++) {
			 arr.add(10+i);
		 }
		 System.out.println(arr.size());
		 arr.set(4,66);
		 System.out.println(arr.get(4));
		 while(!arr.isempty()) {
			 System.out.println(arr.removelast());
			 System.out.println("size="+arr.size());
			 
		 }
		 

	}

}
