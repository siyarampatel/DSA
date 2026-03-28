// Rotate matrix by 90 degrees clockwise
class question3{
    static void Ninty_degree(int arr[][]){
    System.out.println("Ninty Degree Rotation");
    for(int j=0; j<3; j++){
    for(int i=2; i>=0; i--){
        
            System.out.print(arr[i][j]);
    }
   
    System.out.println();
    }
    
    }
    public static void main(String [] args){
         int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
                   Ninty_degree(arr);
    }
}