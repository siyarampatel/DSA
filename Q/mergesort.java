//performing merge sort in two steps first divide and then merging
import java.util.*;
class mergesort{
    public static void divide(int []arr,int s,int e){
        if(s>=e) return;
        int mid = (s+e)/2;
        divide(arr,s,mid);
        divide(arr,mid+1,e);
    }
    public static void main(String [] args){
        int []arr={2,5,4,3,6,4,5,9,4};
        int s=0;
        int e=arr.length;
        divide(arr,s,e);

    }
}