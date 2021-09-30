package JavaSimpleProrgrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ReverseStringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using character array
		
		/*String value = "America";
		
		
		
		int length = value.length();
		String temp = "";
		
		for (int i=length-1; i >=0;i--)
		{
		
		   temp = temp+value.charAt(i);
		}
			System.out.println(temp); 
			if(value.equals(temp)) {
				
				System.out.println("String is Palindrom");
			}
			else
			{
				
				System.out.println("String is not Palindrom");
			}*/
		
		// Using string builder
		/*String str = "America";
		System.out.println(new StringBuilder(str).reverse());*/
		
		//Using stack
		/*String str = "America";
		Stack<Character> st = new Stack<Character>();
		
		char[] charr =      str.toCharArray();
	    
		for (int c = 0;c < str.length(); c++) {
			
		      st.push(charr[c]);
			System.out.println(c);
		}
		int k =0;
		while(!st.empty()) {
			
			charr[k++] = st.pop();
				
		}
		
		System.out.println(String.copyValueOf(charr));
		
		}
			*/
		
		String str = "Techie Delight";
		List<Character> list = new ArrayList<Character>();
		
		for (char string : str.toCharArray()) {
			
			list.add(string);
			
		}
			Collections.reverse(list);
		
		StringBuilder builder = new StringBuilder(list.size());
        for (Character c: list) {
            builder.append(c);
        }
 
        System.out.println(builder.toString()); 
        
    }
		
		}
	
