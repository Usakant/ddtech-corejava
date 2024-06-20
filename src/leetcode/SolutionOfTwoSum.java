package leetcode;

import java.util.Arrays;

public class SolutionOfTwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        boolean outerBreak = false;
        for(int i =0 ; i<= nums.length-1; i++){
            if(outerBreak) break;
            for(int j =1 ; j<= nums.length-1; j++){

                int sumOfTwoArray = nums[i]+ nums[j];
                if(target == sumOfTwoArray)
                {
                    output = new int[]{i, j};
                    outerBreak = true;
                   break;
                }
            }
        }
        return output;
    }
    public static void main(String[] args){
        SolutionOfTwoSum obj = new SolutionOfTwoSum();
        int[] arr = new int[]{2,7,11,8};
        int t = 9;
        int[] result = obj.twoSum(arr,t);
        System.out.println("Result" + Arrays.toString(result));

    }
}
