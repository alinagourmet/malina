package Numbers;

import java.util.Scanner;

public class FibSequence {
    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int n;
        int sum_fib;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number :");
        n = input.nextInt();

        for (int i = 0 ; i < n ; i++){
            sum_fib = a + b ;
            a = b ;
            b = sum_fib;
            System.out.println(sum_fib + " ");
        }
    }


    /*public static  fibonacchi(n){
        if ( n == 0 ) return 0;

        if (n == 1) return 1;
        return fibonacchi(n-2) + fibonacchi(n-1);
    }
console.log(fibonacchi(10));
*/

}
