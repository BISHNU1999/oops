package opps_using_constarctor;

public class DynamicArray {
	private int [] data;
	private int nextnumber;
	public DynamicArray() {
		data =new int[5];
		 nextnumber=0;
	}
  public int size() {
	  return nextnumber;
  }
   public void add(int element) {
	   if(nextnumber==data.length) {
		   recreation();
	   }
	   data[nextnumber]=element;
	   nextnumber++;
   }
   public void recreation() { 
	    int []temp=data;
	    data=new int [2*data.length];
	    for(int i=0;i<temp.length;i++) {
	    	data[i]=temp[i];
	    	
	    }
	   
   }
    public int get(int index) {
    	if(index>=nextnumber) {
    		return -1;
    	}
    	 return data[index];
    } 
    public boolean isempty() {
    	 if(size()==0) {
    		  return true;
    	 }
    	 else {
    		  return false;
    	 }
    }
    public int removelast() {
    	if(size()==0) {
    		return -1;
    	}
      int temp=data[nextnumber-1];
      nextnumber--;
      return temp;
    	
    }
     public void set( int index, int number) {
    	 int temp=data[index];
    	 data[index]=number;
     }
    
   
}
