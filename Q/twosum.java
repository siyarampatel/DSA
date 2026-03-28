import java.util.*;
class twosum{
    public static int[] pair(int [] nums,int target){
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = s.nextInt();
        int [] nums = new int [n];
        System.out.println("Enter Elements");
        for(int i=0; i<n; i++){
            nums[i]=s.nextInt();
            
        }
        System.out.println("Enter target value");
        int target = s.nextInt();
        System.out.print(Arrays.toString(pair(nums,target)));
    }
}