class uppercount{
    static int c=0;
    static int vowel(String s,int k){
        if(k==s.length()){
            return c;
        }
        
        if(s.charAt(k)>='A' && s.charAt(k)<='Z'){
            c++;
        }
        return vowel(s,k+1);
    }
    public static void main(String [] args){
        String s = "SiYarAm";
        int k=0;
        System.out.println(vowel(s,k));
    }
}