package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine(); input.close();
        String reverse = " ";
        // M A l I N A
          //  0 1 2 3 4 5
        for (int i = string.length()-1; i >=0 ;i--){
            reverse = reverse + string.charAt(i);
        }






        System.out.println(reverse);
    }

}
