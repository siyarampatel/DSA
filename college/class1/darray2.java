//Spiral matrix
class darray2{
    public static void main(String [] args){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                //top
             if(i==0){
                System.out.print(a[i][j]);
             }       
        }
    }
    System.out.println();
    for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                //right
             if(j==2){
                System.out.print(a[i][j]);
             }       
        }
    }
    System.out.println();

    //down
      for(int i=0; i<3; i++){
            for(int j=2; j>=0; j--){
             if(i==2){
                System.out.print(a[i][j]);
             }       
        }
    }
    System.out.println();

    //up
      for(int i=2; i>=0; i--){
            for(int j=0; j<3; j++){
             if(j==0){
                System.out.print(a[i][j]);
             }       
        }
    }
    System.out.println();

}
}