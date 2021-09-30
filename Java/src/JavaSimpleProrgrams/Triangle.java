package JavaSimpleProrgrams;



public class Triangle {

	public static void main(String[] args) {
	  //Right triangle
		char k = '*';
		for (int i = 1; i <=5; i++) {
			
			for (int j = 5; j > 0 ; j--) {
				
				if (j > i)
				{
					System.out.print(" ");	
				}
				else
				{
				
					System.out.print(" "+k);
				}	
						
			}
			
			System.out.println(" ");			
		}  
			
for (int i = 4; i >= 0; i--) {
			
			for (int j = 4; j >= 0 ; j--) {
				
				if (j >= i)
				{
					System.out.print(" ");	
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
	
