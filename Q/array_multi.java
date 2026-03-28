import java.util.*;
class array_multi{
    public static void main(String [] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Enter size of coloumn of first 2d array");
        int col1= s.nextInt();
        System.out.println("Enter size of row of first 2d array");
        int row1= s.nextInt();
        System.out.println("Enter size of coloumn of second 2d array");
        int col2= s.nextInt();
        System.out.println("Enter size of row of second 2d array");
        int row2= s.nextInt();
        int [][] a = new int [row1][col1];
        int [][] b = new int [row2][col2];
        int [][] c = new int [row1][col2];
        if(col1!=row2){
            System.out.println("Cannot be multiplied!!");
            return;
        }
        System.out.println("Enter elements in first array");
        for(int i=0; i<row1; i++){
            for(int j=0; j<col1; j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter elements in second array");
        for(int i=0; i<row2; i++){
            for(int j=0; j<col2; j++){
                b[i][j]=s.nextInt();
            }
        }
        for(int i=0; i<row1; i++){
            for(int j=0; j<col2; j++){
                for(int k=0; k<col1; k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Result Matrix");
        for(int i=0; i<row1; i++){
            for(int j=0; j<col2; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}