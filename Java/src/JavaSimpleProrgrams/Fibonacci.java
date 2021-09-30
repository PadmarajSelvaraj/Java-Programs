package JavaSimpleProrgrams;

public class Fibonacci {

	
	// This program would print the fibonaacci series
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int intial = 0;
		int tempt = 1;
		
		while (intial <= 100 )
				{
			
			System.out.println(intial);
			
		int varvalue = intial+tempt;
		intial = tempt;
		tempt = varvalue;
		
		}
		
		
		}
				
	}


