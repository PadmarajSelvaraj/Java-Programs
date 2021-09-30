package JavaSimpleProrgrams;

public class Recursion {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int amc = rfunction(5);
		
		System.out.println(amc);
		
		}

	private static int rfunction(int i) {
		// TODO Auto-generated method stub
		
		if (i == 0) {
		return 1;
		
		}
		return i*rfunction(i -1);
	}
		
	/*public static class FibonacciCalc{
		public static int fibonacciRecursion(int n){
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
				return 1;
			}
		return 
				fibonacciRecursion(n-2)
			+ fibonacciRecursion(n-1);
		}
		
	    public static void main(String args[]) {
		int maxNumber = 10;
		System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
		for(int i = 0; i < maxNumber; i++){
				System.out.print(fibonacciRecursion(i) +" ");
			}
		}
	    
	} */
	
	/*
	static String i = "America" ;
	
	public static void main(String args[]) {
		//int maxNumber = 10;
		//System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
		
		       
		      int k = i.length()-1;
		      
				System.out.print(fibonacciString(k));
				
}

	private static String fibonacciString(int i) {
		// TODO Auto-generated method stub
		String n = "";
		if (i<0) {
			
			return n;
		}
		
		n = n+Recursion.i.charAt(i);
		
		return n+fibonacciString(i -1);
		
		
		
	} */
	
	
}
	
	
	
		
		
				
	


