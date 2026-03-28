import java.util.*;
class leet_3074{
    public static int minimumBoxes(int[] apple, int[] capacity) {
       int  sum_apple=0;
       for(int i=0; i<apple.length; i++){
        sum_apple=apple[i]+sum_apple;
       }
       Arrays.sort(capacity);   

for (int i = 0; i < capacity.length / 2; i++) {
    int temp = capacity[i];
    capacity[i] = capacity[capacity.length - 1 - i];
    capacity[capacity.length - 1 - i] = temp;
}
       int count=0;
       int i=0;
  do{
       sum_apple= sum_apple-capacity[i];
        count++;
        i++;
    }  while(sum_apple>0);
     return count;   
    }
    public static void main(String [] args){
       int [] apple = {1,3,2};
       int [] capacity = {4,3,1,5,2};
       System.out.println(minimumBoxes(apple,capacity));

    }
}