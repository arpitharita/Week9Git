package test_10;

//10. Write a program to input any number and check if it Armstrong number or not
//153 = (1*1*1)+(5*5*5)+(3*3*3)
//where:
//(1*1*1)=1
//(5*5*5)=125
//(3*3*3)=27
//So:
//1+125+27=153

public class Test10 {

    public static void main(String[] args)
    {

        int n = 153;
        int t = n;
        int p = 0;

        while (n > 0) {

            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }
        if (t == p) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println("No. It is not an Armstrong No.");
        }
    }
}
