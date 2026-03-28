// import java.util.*;
// class longeststring{
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
    
//     int n = sc.nextInt();          // how many words
//     sc.nextLine();                 // consume the leftover newline
    
//     for(int i = 0; i < n; i++) {
//         String word = sc.nextLine();     // read one word
//         int len = word.length();
        
//         String result;
        
//         if(len <= 10) {
//             result = word;               // keep as is
//         } else {
//             // This is the line you asked about — but only for THIS word
//             result = "" + word.charAt(0) + (len - 2) + word.charAt(len - 1);
//             // or: result = word.charAt(0) + String.valueOf(len-2) + word.charAt(len-1);
//         }
        
//         System.out.println(result);      // print THIS word's result
//     }
    
//     sc.close();
// }
// }

import java.util.*;
class longeststring{
public static void main(String [] args){
Scanner s = new Scanner(System.in);

int n = s.nextInt();
s.nextLine();
for(int i=0; i<n; i++){
String word = s.nextLine();
String result;
if(word.length()<=10){
    result=word;
}else{
    result=""+word.charAt(0)+(word.length()-2)+word.charAt(word.length()-1);
}
System.out.println(result);
}

}
}