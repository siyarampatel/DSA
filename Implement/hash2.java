// hashmap stores key and values ->it converts the key in an code using hashfunction -> time complexity is fast
// if the storing codes are same then ->collision -> chaining
// hashset only stores values and they are unique duplicates not allowed
// hashset uses values as keys internally


import java.util.*;
class hash2{
    public static void main(String [] args){
HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
int[] arr = {9,5,9,8,8,9,9};

for(int num:arr){
    map.put(num,map.getOrDefault(num,0)+1);
}

// for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//           if(entry.getValue()==1){
//             System.out.println(entry.getKey());
//           }
//         } this will work for all the elements with frequency one



for(int num:arr){
    if(map.get(num)==1){
        System.out.println("The value with frequency 1 is->"+num);
        break;
    }
}

    }
}