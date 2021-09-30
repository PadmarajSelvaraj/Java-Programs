package JavaSimpleProrgrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	
	    
	    public static void main(String[] args)
	    {
	        Integer [] a = { 9,8,9,6 };
	        int n = a.length;
	        String[] geeks = {"Rahul", "Utkarsh",
                    "Shubham", "Rahul"};
	        List values =    Arrays.asList(geeks);
	      
	        Set<String> primesWithoutDuplicates
            = new LinkedHashSet<String>(values);
	    		  
	    		  for (String integer : primesWithoutDuplicates) {
					System.out.println(integer);
				}
	      

	    }
		
}
	
