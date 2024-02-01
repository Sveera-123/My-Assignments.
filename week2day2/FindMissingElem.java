package week2day2;

import java.util.Arrays;

public class FindMissingElem {

	public static void main(String[] args) {
	int input[]= {1, 4,3,2,8, 6, 7};
   //  int b=input.length;
	int sum=0;
	int sum1=0;
	Arrays.sort(input);
	
	for (int i = 1; i<=8; i++) {
		sum=sum+i;
	}
		System.out.println(sum);
		
		for (int i = 0; i < input.length; i++) {
			sum1=sum1+input[i];	
		}
		System.out.println(sum1);
		int a=sum-sum1;
		System.out.println(a);
	}
	

}
