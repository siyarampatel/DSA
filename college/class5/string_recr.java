class string_recr{
    
    static String vowel(String s){
        if(s.length()==0){
            return "";
        }
        char ch =Character.toUpperCase(s.charAt(0));
        return ch+vowel(s.substring(1));
    }
    public static void main(String [] args){
        String s = "SiYarAm";
        System.out.println(vowel(s));
    }
}