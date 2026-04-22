class stringsubset{
    static void subset(String ans,String main){
        if(main.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = main.charAt(0);
        subset(ans+ch,main.substring(1));
        subset(ans,main.substring(1));
    }
    public static void main(String [] args){
        String main = "ram";
        subset("",main);
    }
}