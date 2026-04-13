class revno{
    static int rev=0;
    static int reverse(int x){
        if(x==0){
            return rev;
        }
        rev= rev*10+x%10;
        return reverse(x/10);
    }
    public static void main(String [] args){
        int x=123456;
        int result = reverse(x);
        System.out.println(result);
    }
}