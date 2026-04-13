class maxindex{
    static int max=0;
    static int index=0;
    static int array(int a [],int k){
        if(k == a.length){
            return index;
        }
        if(a[k]>max){
            max=a[k];
            index=k;
        }
        
        return array(a,k+1);

    }
    public static void main(String [] args){
        int a[]={1,2,9,3,4,5,6,7};
        int k=0;
        System.out.println(array(a,k));
    }
}