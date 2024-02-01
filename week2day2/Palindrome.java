package week2day2;

public class Palindrome {

	public static void main(String[] args) {
        int inputNumber1 = 121;
        int inputNumber2 = 12345;

        checkPalindrome(inputNumber1);
        checkPalindrome(inputNumber2);
    }

    public static void checkPalindrome(int number) {
        int reversedNumber = reverseDigits(number);

        if (number == reversedNumber) {
            System.out.println(number + " is a Palindrome.");
        } else {
            System.out.println(number + " is not a Palindrome.");
        }
    }

    public static int reverseDigits(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }
}