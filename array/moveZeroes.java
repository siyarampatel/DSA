//moves zero in an aray to end while maintaining the order of other elements

class moveZeroes{
    public static void main(String [] args){
        int j=0;
        int temp;
        int a[] = {5, 4, 0, 0, 12, 7, 0, 1, 0, 9, 0};
        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                j++;
            }
        }
        for(int i=0; i<a.length; i++){
        System.out.print(a[i]+" ");
    }
}
}