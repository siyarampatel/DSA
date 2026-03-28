class leet_121{
      public static int maxProfit(int[] prices) {
        int ans = 0;
        int min=prices[0];
        for(int i=1; i<prices.length; i++){
           if(min>prices[i]){
            min=prices[i];
           }else{
            ans=Math.max(ans,prices[i]-min);
           }
        }
        return ans;
    }
    public static void main(String [] args){
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}