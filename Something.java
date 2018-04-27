/*
 *Class name: Something.
 * Version 0.1.
 * This program intends to calculate simple Math problems.
 * This program is OpenSource.
 */


package code_convention;

public class Something { 
// this class contain the methods for calculating simple Math problems 
// like multiplication, division, sums and take-away.
	
	
	private int val1,val2,result; 
	// here we are stating the variables whether they are public, private or protected.
    
	
	public Something() { // This is the Constructor and we have initialize the global variables.
		this.val1 = val1;
		this.val2 = val2;
		this.result= result;
	}
	
	  public int Sum(int val1, int val2){
	     
		  return result =val1+val2;
	  // This is the Sum method.
	  }

	 public int TakeAway(int v1, int v2){
	     
		 return result= val1 - val2;
	  // This is the take away method.
	 }

	 public int Multiplication(int v1, int v2){
	       
		 return result= val1*val2;
	  // This the Multiplication method
	 }

	 public int Division(int v1, int v2){
	        
		 return result= val1/val2;
	  // This is the Division method.
	 }
	    
	 public void setvalue(int x,int y){
	        val1=x;
	        val2=y;
	  // This is the Set method.
	 }
}
