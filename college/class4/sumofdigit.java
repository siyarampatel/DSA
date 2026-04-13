class sumofdigit{
    static int sum=0;
    static int count(int x){
        if(x==0){
            return sum;
        }
        sum = sum+x%10;
        return count(x/10);

    }
    public static void main(String [] args){
        int x=1234;
        System.out.println(count(x));
    }
}