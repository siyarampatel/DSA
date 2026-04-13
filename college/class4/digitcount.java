class digitcount{
    static int c=0;
    static int count(int x){
        if(x==0){
            return c;
        }
        c=c+1;
        return count(x/10);

    }
    public static void main(String [] args){
        int x=5675647;
        System.out.println(count(x));
    }
}