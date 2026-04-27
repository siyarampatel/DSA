//give the subsets whos sum = k
class backtrack{
    static void count(int [] arr,int i,int k,int sum,int [] ans,int size){
        if(i==arr.length){
            if(sum == k){
                for(int j=0; j<size; j++){
                    System.out.print(ans[j]+" ");
                }
                System.out.println();
            }
            return;
        }
        ans[size]=arr[i];
        count(arr,i+1,k,sum+arr[i],ans,size+1);
        count(arr,i+1,k,sum,ans,size);

    }
    public static void main(String [] args){
     int [] arr = {1,2,3};
     int k=3;
     int i=0;
     int sum=0;
     int []  ans = new int [arr.length];
     int size = 0;
     count(arr,0,k,0,ans,0);
    }
}