class steps{
    static int steps(int n){
        if(n==0 || n==1){
            return 1;
        }
        return steps(n-1)+steps(n-2);
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(steps(n));
    }
}