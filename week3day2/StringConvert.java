package week3day2;

import java.util.Iterator;

public class StringConvert {

	public static void main(String[] args) {
    String text="Teastleaf";
    // convert string revese
     char[] charArray = text.toCharArray();
    	for (int i =charArray.length-1; i >=0; i--) {
			System.out.println(charArray[i]);
		}
System.out.println("hi");
	}

}
