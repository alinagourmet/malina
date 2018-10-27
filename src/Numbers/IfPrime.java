package Numbers;

import java.util.Scanner;

public class IfPrime {

    public static void main(String[] args) {
        System.out.println("Enter any number :");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.close();

       for (int i = 2; i <=number; i++){
            boolean isPrime = true;
            for(int j = 2 ; j < i; j++){
                if (i%j ==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);

            }
        }
    }
}


