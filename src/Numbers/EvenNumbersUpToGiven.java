package Numbers;

import java.util.Scanner;

public class EvenNumbersUpToGiven {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = sc.nextInt();

        sc.close();
        System.out.println("Even number are : ");


       for (int i = 0; i <= number; i++ )
           if(i % 2 == 0 ){
               System.out.println(i);
           }






        System.out.println();
    }








}
