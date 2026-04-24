//===========memoization---------------------
// for optimizing the reccursion code avoiding repeated recursive calls by storing intermediate results.
/*fib(6)
 ├── fib(5)
 │    ├── fib(4)
 │    │    ├── fib(3)
 │    │    │    ├── fib(2)
 │    │    │    ├── fib(1)
 │    │    ├── fib(2)   ← repeated
 │    ├── fib(3)       ← repeated
 ├── fib(4)            ← repeated
*/
import java.util.*;
class optimize{
    static int fib(int n,int []dp){
        if(n<=1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n]=fib(n-1,dp)+fib(n-2,dp);
        return dp[n];
    }
    public static void main(String [] args){
        int n = 6;
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        System.out.println(fib(n,dp));
    }
}