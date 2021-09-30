package JavaSimpleProrgrams;

public class rotationofanotherstring
{
    public static void main(String[] args)
    {
    	boolean result = numberOrNot("1234567890");
    	
    	if(result) 
    		
    		System.out.println("input is number");

    	else
    		System.out.println("input is not a number");
    }
    
    static boolean numberOrNot(String i)
    {
        try
        {
            Long.parseLong(i);
            //Integer.parseInt(i);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
}