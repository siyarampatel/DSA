// find all the subset of an array and add them through recurssion 
class ar{
    static int total=0;
    static int subset(int a[],int sum,int i){
            if(i==a.length){
                total+=sum;
                return total;
            }
            subset(a,sum+a[i],i+1);
            subset(a,sum,i+1);
            return total;
    }
    public static void main(String [] args){
        int [] a={1,2,3};
        int sum=0;
        int i=0;
        System.out.println(subset(a,sum,i));
    }
}