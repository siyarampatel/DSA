class replaceby5{
    static int[] array(int a [],int target,int k){
        if(k == a.length){
            return a;
        }
        if(a[k]==target){
            a[k]=5;
        }
        return array(a,target,k+1);

    }
    public static void main(String [] args){
        int a[]={1,2,3,4,5,6,6,6,6,6,6,6};
        int target = 6;
        int k=0;
        int [] result = array(a,target,k);
        for(int i=0; i<a.length; i++){
        System.out.print(result[i]+" ");
        }
    }
}