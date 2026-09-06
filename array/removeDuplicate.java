class removeDuplicate{
    public static void main(String [] args){
        int a [] = {1,1,1,2,2,3,4,5,6,6,7,7,7,7,7,8,9,9,9};
        int j=0;
        int temp = 0;
        for(int i=1; i<a.length; i++){
            if(a[j]!=a[i]){
                a[j+1]=a[i];
                j++;
        }
        }
        for(int i=0; i<a.length; i++){
        System.out.print(a[i]+" ");

        }
    }
}