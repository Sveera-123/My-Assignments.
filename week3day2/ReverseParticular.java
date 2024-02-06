package week3day2;

public class ReverseParticular {

	public static void main(String[] args) {
	 String text="I,Love,Chicken,Chuka";
	
	 // first we need to seaprete byindex
	 // 0   1    2         3
	// i  love  chicken    chuka
    // nxt to split sentence, use   splitmethod
	 
	 String[] split = text.split(",");
	 
	 for (int i=0; i< split.length; i++) {
		 if(i%2!=0) {
			 
	 // for reverse need tocatch  use char arrys	 
			 char[] charArray = split[i].toCharArray();
			 // for loop fr revese need to use revs for loop i>=0 ,i--
			 for (int j = charArray.length-1; j>=0; j--) {
				 System.out.println(charArray[j]);
					
			}
          
		 }
	
		 
		 
	 }	 
		 
   
	}

}
