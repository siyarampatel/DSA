import java.util.*;
class twoSum{
    public static void main(String [] args){
        int target = 9;
        int a [] = { 11, 15 ,2, 7};
        Arrays.sort(a);
        int i=0;
        int j = a.length-1;
        while(i<j){
            int sum = a[i]+a[j];
            if(sum==target){
                System.out.println(a[i]+"and"+a[j]);
                return;
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }
}
}