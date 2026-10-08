import java.util.*;
class arrangeAcoFreq{
    public static int[] sortByFrequency(int [] arr){
        Map<Integer,Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        List <Integer> unique = new ArrayList<>(freq.keySet());

        unique.sort((a,b)->{
            int freqCompare = Integer.compare(freq.get(b),freq.get(a));
            if(freqCompare != 0){
                return freqCompare;
            }
            return Integer.compare(a,b);
        });

        int [] result = new int[arr.length];
        int index = 0;
        for(int num : unique){
            int count = freq.get(num);
            for(int i=0; i<count; i++){
                result[index++] = num;
            }
        }
        return result;
    }
    public static void main(String [] args){
       int[] arr = {1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
        
        int[] sorted = sortByFrequency(arr);
        
        System.out.println(Arrays.toString(sorted));
    }
}