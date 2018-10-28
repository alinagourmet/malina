package AlgoLeet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public  class Solutions {


        public static List<String> fizzBuzz(int n) {
            List<String> result = new ArrayList<>();


            for (int i = 1; i <= n; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    result.add("FizzBuzz");
                } else if (i % 3 == 0) {
                    result.add("Fizz");
                } else if (i % 5 == 0) {
                    result.add("Buzz");
                } else {
                    result.add(String.valueOf(i));  // 1 -> "1"
                }
            }
            System.out.println(result);
            return result;


        }
        public static int[] twoSum(int[] nums, int target) {
        if(nums==null || nums.length<2)
            return new int[]{0,0};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }else{
                map.put(target-nums[i], i);
            }
        }

        return new int[]{0,0};
    }





}