// check if all the character in an string are same or not
class issame{
    static boolean vowel(String s,int k){
        if(k==s.length()){
            return true ;
        }
        char ch = s.charAt(k);
        if(ch!=s.charAt(k-1)){
            return false;
        }
        return vowel(s,k+1);
    }
    public static void main(String [] args){
        String s = "aaaaaaaaaaaaaaa";
        int k=0;
        System.out.println(vowel(s,k+1));
    }
}