import java.util.*;
class leet_3075 {
    static long maximumHappinessSum(int[] happiness, int k) {
//         long max_sum = 0;
//         Arrays.sort(happiness);
//         for (int i = 0; i <happiness.length / 2; i++) {
//             int temp = happiness[i];
//             happiness[i] = happiness[happiness.length - 1 - i];
//             happiness[happiness.length - 1 - i] = temp;
// }
//         for(int i=0; i<k-1; i++){
//             max_sum=happiness[i]+max_sum;
//             }
//              return max_sum-(k-1)*k/2;                         
// 
 /*this logic won't work if we have ones in last part of our array they 
                                                                         will become 0*/
        long maxsum=0;
       Arrays.sort(happiness);
        for (int i = 0; i <happiness.length / 2; i++) {
            int temp = happiness[i];
            happiness[i] = happiness[happiness.length - 1 - i];
            happiness[happiness.length - 1 - i] = temp;
}
        for(int i=0; i<k; i++){
            if(happiness[i]-i>0){
            maxsum=maxsum+happiness[i]-i;
            }
        else{
           return maxsum;
        }
        }
    }
       public static void main(String [] args){
        int [] happiness = {5,4,3,2,1};
        int k=3;
        System.out.println(maximumHappinessSum(happiness,k));
       }
}
     