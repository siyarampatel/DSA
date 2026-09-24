// import java.util.*;
// class temp{
//     public static void main(String [] args){
//        int a [] = {2,3,1,2,4,3};
//        int max = 0;
//        for(int i=0; i<a.length; i++){
//         if(a[i]>max){
//             max=a[i];
//         }
//        }
//        System.out.print("The max element is: "+max);
//     }
// }

// import java.util.*;
// class temp{
//     public static void main(String [] args){
//        int a [] = {19,13,7,8,12};
//        int max = 0;
//        for(int i=0; i<a.length; i++){
//         if(a[i]>max){
//             max=a[i];
//         }
//        }
//        System.out.print("The max element is: "+max);
//     }
// }

// import java.io.*;
// import java.util.*;

// public class temp {

//     public static void main(String[] args) {
       
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//          int arr [] = new int[n];
        
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
        
//         int target = sc.nextInt();
//         int found =0;
        
//         for(int i=0; i<n; i++){
//             if(arr[i]==target){
//                System.out.print(i);
//                found=1;
//                break;
//         }
        
// }
// }
// }

import java.io.*;
import java.util.*;

public class temp{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       
       
       
       int maxF = 0;
       for(int i=0; i<n; i++){
        if(arr[i-1]==arr[i]){
            maxF++;
        }
        
       }
    }
}
