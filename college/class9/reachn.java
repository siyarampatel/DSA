//reach n
import java.util.*;
class reachn{
    static int count(int n, int[]dp){
        if(n==1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int ans = count(n-1,dp);
        if(n%2==0){
           ans = Math.min(ans,count(n/2,dp));
        }
        if(n%3==0){
           ans = Math.min(ans,count(n/3,dp));
        }
        dp[n] = 1+ ans;
        return dp[n];

    }
    public static void main(String [] args){
        int n = 10;
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        System.out.println(count(n,dp));
    }
}