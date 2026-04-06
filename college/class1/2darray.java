//sum of diagonal elements of 2d array
class 2darray{
    public static void main(String [] args){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0; 
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i=j){
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal elements is -> ",sum);
    }
}