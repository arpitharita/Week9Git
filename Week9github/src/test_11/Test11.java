package test_11;

//11. Even Digit Sum
//Write a method named getEvenDigitSum with one parameter of type int called number.
//The method should return the sum of the even digits within the number.
//If the number is negative,the method should return -1 to indicate an invalid value.
//EXAMPLE INPUT/OUTPUT:
//* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
//* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
//* getEvenDigitSum(-22); → should return -1 since the number is negative
//
//NOTE: The method getEvenDigitSum should be defined as public static

public class Test11 {

    public static void main(String[] args) {

    }
    public static int getEvenDigitSum(int num){
        int a = 0;

        if(num > 0){
            while (num != 0){
                int even = num % 10;
                if (even % 2 == 0){
                    a += even;
                }
                num /= 10;
            }
            System.out.println(a);
        }
        return 1;
    }
}
