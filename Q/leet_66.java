// https://leetcode.com/problems/plus-one/description/
import java.util.*;
class leet_66{
    static int[] plusOne(int[] digits) {
        int i=digits.length-1;
            while(i>=0&&digits[i]==9){
                digits[i]=0;
                i--;
            }
            if(i>=0){
                digits[i]=digits[i]+1;
                return digits;
            }
        int result [] = new int [digits.length+1];
        result[0] = 1;
        return result;
        }
    }
    public static void main(String [] args){
        int [] digits = {1,2,3};
        plusOne(digits);
    }
    
}

