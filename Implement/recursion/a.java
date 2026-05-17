class a{
    static void rec(int n){
        if(n>6){
            return ;
        }
        System.out.println(n);
         rec(n+1);

    }
    public static void main(String [] args){
        rec(1);
    }
}