class x_pow_n{
    static int xpn(int x, int n){
        if(n==0){
            return 1;
        }
        return x*xpn(x,n-1); 
    }
    public static void main(String [] args){
        int x=5;
        int n=3;
        int result = xpn(x,n);
        System.out.println(result);
    }
}