package JavaSimpleProrgrams;



public class LeftTriangle {

	public static void main(String[] args) {
	  //Right triangle
		char k = '*';
		for (int i = 1; i < 5; i++) {
			
			for (int j = 4; j > 0 ; j--) {
				
				if (j > i)
				{
					System.out.print("  ");	
				}
				else
				{
				
					System.out.print(" "+k);
				}	
						
			}
			
			System.out.println(" ");			
		}  
			
		 }  
    }
		

	
