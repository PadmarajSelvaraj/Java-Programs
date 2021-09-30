package JavaSimpleProrgrams;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 0;
		
		for (int i =1; i<=100;i++) {
			
		
		 for (int j =1;j<=i;j++)
		 {
			 int checknumber = i%j;
			 
			 if(checknumber==0) {
				 
				 number ++;	 	 
			 }
			 
		 }
		 if (number <=2) {
			 
			 System.out.println("The number is Prime number "+i);
		 }
		 number =0;
		}
			
	}
}
