class replacebyx{
    static String vowel(String s,int k){
        if(k==s.length()){
            return "";
        }
        char ch = s.charAt(k);
        if(ch=='A'||ch=='a'){
            ch='x';
        }
        return ch+vowel(s,k+1);
    }
    public static void main(String [] args){
        String s = "SiYarAm";
        int k=0;
        String n = vowel(s,k+1);
        System.out.println(n);
    }
}