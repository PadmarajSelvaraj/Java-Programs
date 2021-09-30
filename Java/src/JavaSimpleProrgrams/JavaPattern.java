package JavaSimpleProrgrams;



public class JavaPattern {

	public static void main(String[] args) {
	  //Right triangle
		char k = '*';
		for (int i = 1; i < 5; i++) {
			
			for (int j = 1; j < 5; j++) {
				
				if (j <=i)
				{
					System.out.print(k+" ");	
				}
				else
				{
					System.out.print(" ");
				}	
						
			}
			
			System.out.println(" ");			
		}  
			
		 }  
    }
		

	
