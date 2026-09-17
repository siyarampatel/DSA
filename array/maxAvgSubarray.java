import java.util.*;
class maxAvgSubarray{
    public static double findMaxAverage(int[] nums, int k) {
      int currentSum = 0;
      for(int i=0; i<k; i++){
        currentSum += nums[i];
      }

      int maxSum = currentSum;

      for(int i=k; i<nums.length; i++){

        currentSum += nums[i] - nums[i-k];

        maxSum = Math.max(maxSum,currentSum);

        
      }
      return (double)maxSum/k;
    }
    public static void main(String [] args){
        int k=4;
        int[] nums = {1,12,-5,-6,50,3};
       System.out.println(findMaxAverage(nums,k));
    }
}