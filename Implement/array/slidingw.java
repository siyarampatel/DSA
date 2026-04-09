//sliding window of variable size 
import java.util.*;
class slidingw{
    public static void main(String [] args){
        int a[]={4, 2, 1, 7, 8, 1, 2};
        int limit = 8;
        int sum = 0;
        int left=0;
        int right=0;
        int maxlength=0;
        for(right=0; right<a.length; right++){
            sum=sum+a[right];

            while(sum>limit){
                sum-=a[left];
                left++;
            }

            maxlength=Math.max(maxlength,right-left+1);
        }
        System.out.println("The max length that can be acheived is -> "+maxlength);
    }
}