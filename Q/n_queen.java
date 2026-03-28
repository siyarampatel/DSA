//Place n queens in an matrix in such a way that they don't cross each other
class n_queen{
    static int n=4;
    static void draw(){
        char [][] arr= new char [n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]='.';
            }
        }
        solve(arr,0);
    }
    static void solve(char arr[][],int row){
        if(n==row){
            print(arr);
            return;
        }
        for(int col=0; col<n; col++){
            if(isSafe(arr,row,col)){
                arr[row][col]='Q';
                solve(arr,row+1);
                arr[row][col]='.';
            }
        }
    }
    static boolean isSafe(char arr[][],int row,int col){
        for(int i=0; i<row; i++){
            if(arr[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1; i>=0&&j>=0; i--,j--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1; i>=0&&j<n; i--,j++){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    static void print(char arr[][]){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
         System.out.println();

    }

    public static void main(String [] args){
         draw();
    }
}