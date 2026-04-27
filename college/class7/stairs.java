// stairs problem with reccursion and memoization
import java.util.*;
class stairs{
    static int fib(int n,int []dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n] != -1){ //checks if for an particular value recus.is done
            return dp[n];
        }
        dp[n]=fib(n-1,dp)+fib(n-2,dp); //stores an value for corresponding recursion
        return dp[n];
    }
    public static void main(String [] args){
        int n = 6;
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        System.out.println(fib(n,dp));
    }
}