package test_12;

//12. Write a programme to input any number and check if it is prime or not.
//(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
//prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
//17... are the prime numbers.)

public class Test12 {

    public static void main(String[] args) {

        int num = 13;
        boolean value = false;
        for (int i = 4; i <= num / 4; i++){
            if (num % i == 0){
                value = true;
                break;
            }
        }
        if (!value)
            System.out.println("Is a prime number " + num);
        else
            System.out.println("Is not prime number " +num);
    }
}
