// class r{
//     static int rec(int n){
//         if(n<1){
//             return 1;
//         }
//        System.out.println(n);
//        return rec(n-1);
//     }
//     public static void main(String [] args){
//         rec(10);
//     }
// }

// class r{
//     static int rec(int n){
//         if(n>9){
//             return 10;
//         }
//        System.out.println(n);
//        return rec(n+1);
//     }
//     public static void main(String [] args){
//         rec(1);
//     }
// }

// class r{
//      static int sum=0;
//     static int rec(int n){
      
//         if(n<1){
//             return 1;
//         }
//         sum+=n;
//        return rec(n-1);
//     }
//     public static void main(String [] args){
//         rec(3);
//         System.out.print(sum);
//     }
// }

class r{
    static int rec(int n){  
        if(n==0){
            return 0;
        }
       return n+rec(n-1);
    }
    public static void main(String [] args){
        System.out.print(rec(3));
    }
}