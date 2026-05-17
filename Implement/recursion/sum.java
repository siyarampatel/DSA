// class sum{
//     static int sum=0;
//     static int rec(int n){
//         if(n==0){
//             return sum;
//         }
//         sum+=n;
//         return rec(n-1);

//     }
//     public static void main(String [] args){
//         System.out.println(rec(5));
//     }
// }

class sum{
    static int rec(int n){
        if(n==0){
            return n;
        }
        return n+rec(n-1);

    }
    public static void main(String [] args){
        System.out.println(rec(5));
    }
}



