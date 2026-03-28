import java.util.*;
class sorting012{
    public static void sort(int [] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = s.nextInt();
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i]=s.nextInt();
        }
        sort(arr);
    }
}