class fib{
    static int rec(int n){
        if(n<=1){
            return n;
        }
        
         return rec(n-1)+rec(n-2);

    }
    public static void main(String [] args){
        System.out.println(rec(4));
    }
}