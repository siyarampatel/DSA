class leet_55{
       public static boolean canJump(int[] nums) {
       int maximum_reach=0;
        for(int i=0; i<nums.length; i++){
            if(i>maximum_reach){
                return false;
            }
            maximum_reach=Math.max(maximum_reach,nums[i]+i);
        }
        return true;
    }
    public static void main(String [] args){
        int nums[]={2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}