class strrec{
    static int c=0;
    static int vowel(String s,int k){
        if(k==s.length()){
            return c;
        }
        if(s.charAt(k)=='A'||s.charAt(k)=='E'||s.charAt(k)=='I'||s.charAt(k)=='O'||
        s.charAt(k)=='U'||s.charAt(k)=='a'||s.charAt(k)=='e'||s.charAt(k)=='i'||
        s.charAt(k)=='o'||s.charAt(k)=='u'){
            c++;
        }
        return vowel(s,k+1);
    }
    public static void main(String [] args){
        String s = "siyaram";
        int k=0;
        System.out.println(vowel(s,k));
    }
}