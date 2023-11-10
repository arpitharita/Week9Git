package test_7;

//7. First And Last Digit Sum
//Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//The method needsto find the first and the last digit of the parameter number passed to the method,
//using a loop and return the sum of the first and the last digit of that number.
//If the number is negative then the method needsto return -1 to indicate an invalid value.
//
//Example input/output
//* sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
//* sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
//* sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
//
//gives us 0+0 and the sum is 0.
//
//* sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
//
//gives us 5+5 and the sum is 10.
//
//* sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
//NOTE: The method sumFirstAndLastDigit needsto be defined as public static//

public class Test7 {

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        int LastDigit = number % 10;
        System.out.println("last digit = " + LastDigit);

        int FirstDigit = LastDigit;
        while (number != 0) {
            number /= 10;
            if (number % 10 == 0)
                break;
            FirstDigit = number;

        }
        System.out.println("First digit = " + FirstDigit);
        sum = LastDigit + FirstDigit;
        return sum;

    }

    public static void main(String[] args) {
        System.out.println("The sum of the first and last digit of 252 is = " + sumFirstAndLastDigit(252));
        System.out.println("The sum of the first and last digit of 0 is = " + sumFirstAndLastDigit(0));
        System.out.println("The sum of the first and last digit of 257 is = " + sumFirstAndLastDigit(257));
        System.out.println("The sum of the first and last digit of 5 is = " + sumFirstAndLastDigit(5));
        System.out.println("The sum of the first and last digit of -2 is = " + sumFirstAndLastDigit(-2));
    }
}

