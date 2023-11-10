package test_9;

//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

import java.util.Scanner;

public class Test9 {

    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of series “N” ");
        int n = s.nextInt();
        int a=1, b=1;
        System.out.print(a+" "+b);
        int i=1;
        while(i<=n-2)
        {
            int c = a+b;
            a = b;
            b = c;
            System.out.print(" "+c);
            i++;
        }
    }
}
