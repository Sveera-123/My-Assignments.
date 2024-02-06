package week3day2;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {
	  String a= "mam";
	  // find the length of a10
	   
	 int n= a.length();
	 // empty value
	 String b ="";
	 //incremt revse oder
	 for (int i= n-1; i>=0; i--) {
	 b = b+ a.charAt(i);	
	}
	  
 System.out.println(b);
 // checking the string a to b
 if (a.equals( b)) {
	 
	 System.out.println("it is palindrome");
	 
	
}
 else {
	System.out.println("not palindrome");
}
	}

}
