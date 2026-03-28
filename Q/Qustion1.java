// Print diagonals of a matrix

class Qustion1{
     static void diagonal(int arr[][]){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==j){
                    System.out.println(arr[i][j]);
                }
            }
        }

    }
    public static void main(String [] args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        diagonal(arr);
    }
}