import java.util.*;
class array1{
    public static void creation(int n,int arr[],Scanner sc){
        
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Your array is -> ");
        for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
        }
    }
    public static void reversal(int arr[],int n){
        //reversing 
         for(int i=0; i<n/2; i++){
                int temp = arr[i];
                arr[i]=arr[n-i-1];
                arr[n-i-1]=temp;
         }

        System.out.println("Reversed array is -> ");
        for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int [n];
        creation(n,arr,sc);
        reversal(arr,n);
       
    }
}