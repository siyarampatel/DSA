
import java.util.*;

class stringsubsetMemo {
    static int count(String str, int i, int[] dp) {
        if (i == str.length()) {
            return 1; 
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int exclude = count(str, i + 1, dp);
        int include = count(str, i + 1, dp);

        dp[i] = exclude + include;
        return dp[i];
    }

    public static void main(String[] args) {
        String str = "abc";
        int[] dp = new int[str.length() + 1];
        Arrays.fill(dp, -1);

        System.out.println(count(str, 0, dp));
    }
}