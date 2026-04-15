class evensum{
    static int sum=0;
    static int count(int x){
        if(x==0){
            return sum;
        }
        if(x%2==0){
        sum = sum+x%10;
        }
        return count(x/10);

    }
    public static void main(String [] args){
        int x=34613;
        System.out.println(count(x));
    }
}