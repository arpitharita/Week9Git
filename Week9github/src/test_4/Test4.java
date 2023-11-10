package test_4;

//4. Digit Sum Challenge
//Write a method with the name sumDigitsthat has one int parameter called number.
//If the parameter is >= 10 then the method should processthe number and return sum of all digits,
//otherwise return -1 to indicate an invalid value.
//The numbersfrom0-9 have 1 digitso we don't want to processthem; also we don't want to process
//negative numbers, so also return -1 for negative numbers.
//For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
//Calling the method sumDigits(1)should return -1 as per requirements described above.
//Add some code to the main method to test out the sumDigits method to determine that it is working
//correctly for valid and invalid values passed as arguments.
//Hint: Use n % 10 to extract the least-significant digit.
//Use n = n / 10 to discard the least-significant digit.
//The method needs to be static
//Create a class with the name DigitSumChallenge.

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input An Integer");
        int digits = sc.nextInt();
        System.out.println("This sum is " + SumDigits(digits));
    }
    public static int SumDigits(long num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;

        }
        return result;
    }
}
