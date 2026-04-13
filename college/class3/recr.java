class recr{
    static void pn(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        pn(n+1);
    }
    public static void main(String [] args){
        pn(1);
    }
}