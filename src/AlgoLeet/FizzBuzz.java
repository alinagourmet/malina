package AlgoLeet;

import java.util.ArrayList;
import java.util.List;

public  class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for(int i = 1;i<=n; i++ ){

            if (n % 3 ==0 ){
                result.add("Fizz");
            }else if(n % 5 ==0){
                result.add("Buzz");
            }else if(n % 3 == 0 && n % 5 ==0){
                result.add("FizzBuzz");
            }else {
                result.add(String.valueOf(i));

            }


        }return result;
    }
}