package test_3;

//3. Write a Java program that takes the user to provide a single character from the
//alphabet. Print Vowel of Consonant, depending on the user input. If the user input
//Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
//error message.
//For eg:
//Input an alphabet: p
//Expected Output:
//Input letter is Consonant

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide single character from alphabet : " );
        String alpha = sc.next();

        if (sc.hasNext()){
            alpha = alpha.toLowerCase();
            if (alpha.equals("a") || alpha.equals("e") || alpha.equals("i") || alpha.equals("o") || alpha.equals("u"));
            {
                System.out.println("Vowel");
            }
            if (alpha.length() > 1)
            {
                System.out.println("Error");
            }
            else {
                System.out.println("Consonant");
            }


        }
        else {
            System.out.println("Error");
        }
    }
}
