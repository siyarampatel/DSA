import java.util.*;
class leet_1796{
    public static int secondHighest(String s) {
        boolean [] present = new boolean [10];
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                present[ch-'0'] = true;
            }
        }
        int count=0;
        for(int i=9; i>=0; i--){
            if(present[i]){
                count++;
                if(count==2){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String [] args){
        String s = "dfa12321afd";
        System.out.println(secondHighest(s));
    }
}