package test_5;

/*5. Palindrome Number
        Write a method called isPalindrome with one int parameter called number.
        The method needs to return a boolean.
        Itshould return true ifthe number is a palindrome number otherwise itshould return false.
        Check the tips below for more info about palindromes.
        Example Input/Output
        isPalindrome(-1221); → should return true
        isPalindrome(707); → should return true
        isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
        11212.
        Tip:What is a Palindrome number? A palindrome numberis a number which when reversed is equal
        to the original number. For example: 121, 12321, and 1001 etc.
        Tip: Logic to check a palindrome number
        Find the reverse of the given number. Store itin some variable,say reverse. Compare the number
        with the reverse.
        If both are the same then the number is a palindrome otherwise it is not.

        Tip: Logic to reverse a number
        Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
        Extract the last digit of the given number by performing the modulo division (remainder).
        Store the last digitto some variable say lastDigit = num % 10.
        Increase the place value of reverse by one.
        To increase place value multiply the reverse variable by 10 e.g.reverse = reverse * 10.
        Add lastDigit to reverse.
        Since the last digit of the number is processed,remove the last digit of num. To remove the last digit
        divide number by 10.
        Repeatsteps until the number is not equalto (or greater than)zero.
        A while loop would be good for this coding exercise.
        Tip: Be careful with negative numbers. They can also be palindrome numbers.
        Tip: Be careful with reversing a number, you will need a parameterfor comparing a reversed number
        with the starting number (parameter).
        NOTE: The method isPalindrome needsto be defined as public static*/

public class Test5 {

    public static void main(String[] args) {

        System.out.println(IsPalindrom(-1221));
        System.out.println(IsPalindrom(707));
        System.out.println(IsPalindrom(11212));
    }

    public static boolean IsPalindrom(int num){

        int reverse = 0;
        int OriginalNumber = num ;

        while (num != 0){
            int LastDigits = num % 10 ;
            reverse = (reverse * 10) + LastDigits ;
            num /= 10 ;
        }
        return OriginalNumber == reverse ;
    }
    public static boolean IsPalidrome(int num){

        int reverse = 0;
        int OriginalNumber = num ;
        while (num != 0){
            int LastDigits = num % 10 ;
            reverse = (reverse * 10) + LastDigits;
            num /= 10;
        }
        return OriginalNumber == reverse;
    }
}
