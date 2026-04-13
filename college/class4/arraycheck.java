class arraycheck{
    static boolean array(int a [],int target,int k){
        if(k == a.length){
            return false;
        }
        if(a[k]==target){
            return true;
        }
        return array(a,target,k+1);

    }
    public static void main(String [] args){
        int a[]={1,2,3,4,5,6};
        int target = 6;
        int k=0;
        System.out.println(array(a,target,k));
    }
}