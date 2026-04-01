import java.util.*;
class decimal_to_binary{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int decimal;
        System.out.println("Enter your decimal number:");
        decimal=sc.nextInt();
        int i=0;
        int rem[]=new int[32];
        while(decimal!=0){
           rem[i] = decimal%2;
           decimal=decimal/2;
             i++;
        }
          

        for(int j=i-1; j>=0; j--){
            System.out.print(rem[j]+" ");
        }
    }
}