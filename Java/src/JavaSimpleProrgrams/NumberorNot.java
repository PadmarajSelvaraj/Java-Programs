package JavaSimpleProrgrams;

import java.util.HashMap;
import java.util.Set;

public class NumberorNot {

	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//For Character	
		String Money = "Malayam";
	    String country = Money.toLowerCase();

		HashMap<Character,Integer> k = new HashMap<Character,Integer>();
		char[] countryc = country.toCharArray();
		
		for (char c : countryc) {
			if(k.containsKey(c))
			{
				k.put(c, k.get(c)+1);	
			}
			else
			{
				k.put(c, 1);
			}
		}
		  Set<Character> remduplicate = k.keySet();
		
		           for (Character object : remduplicate) {
		        	   if(k.get(object) >1)
		        	   {
		        		   
		        		   System.out.println("Duplicate string is " + object);
		        	   }
				    }	
		           
		           
	}	*/	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//For Character	
		String Money = "Malayam";
	    String country = Money.toLowerCase();

		HashMap<Character,Integer> k = new HashMap<Character,Integer>();
		char[] countryc = country.toCharArray();
		
		for (char c : countryc) {
			if(k.containsKey(c))
			{
				k.put(c, k.get(c)+1);	
			}
			else
			{
				k.put(c, 1);
			}
		}
		  Set<Character> remduplicate = k.keySet();
		
		           for (Character object : remduplicate) {
		        	   if(k.get(object) >1)
		        	   {
		        		   
		        		   System.out.println("Duplicate string is " + object);
		        	   }
				    }	
		           
		           
	}	
}
				



