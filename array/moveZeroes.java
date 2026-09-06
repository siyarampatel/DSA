//moves zero in an aray to end while maintaining the order of other elements

class moveZeroes{
    public static void main(String [] args){
        int j=0;
        int temp;
        int a[] = {0, 4, 0, 0, 12, 7, 0, 1, 0, 9, 0};
        for(int i=1; i<a.length; i++){
            if(a[j]==0 && a[i]>0){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        for(int i=0; i<a.length; i++){
        System.out.print(a[i]+" ");
    }
}
}