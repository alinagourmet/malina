package AlgoLeet;

import java.util.ArrayList;
import java.util.List;

public  class Solutions {


        public static List<String> fizzBuzz(int n) {
            List<String> result = new ArrayList<>();

            for(int i = 1;i<=n; i++ ){

                if (i % 3 ==0 && i % 5 ==0){
                    result.add("Solutions");
                }else if(i % 5 ==0){
                    result.add("Buzz");
                }else if( i % 3 ==0){
                    result.add("Fizz");
                }else {
                    result.add(String.valueOf(i));

                }


            }return result;

        }



}