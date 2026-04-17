class leet_58 {
    public static int lengthOfLastWord(String s) {
        int c=0;
        for(int i=s.length()-1; i>=0; i--){
           if(s.charAt(i)!=' '){
            c++;
           }
           else if(s.charAt(i)==' ' && c!=0){
            break;
           }
        }
        return c;
    }
    public static void main(String [] args){
        String s = "siyaram patel  ";
        System.out.println(lengthOfLastWord(s));
    }
}