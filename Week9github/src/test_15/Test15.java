package test_15;

//15. Display left angle triangle of * using nested for loops
//*
//* *
//* * *
//* * * *
//* * * * *

public class Test15 {
    public static void main(String[] args){

        for (int i =1; i <=5; i++)
        {
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
