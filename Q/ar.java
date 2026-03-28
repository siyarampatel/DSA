class ar{
    public static void main(String [] args){
        int[] a = {1,2,3,4,5};
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }      
        }
        System.out.println("Maximum="+max);

        int min = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }      
        }
        System.out.println("Minimum="+min);

        int sum=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }

        int average = sum/(a.length-1);
        System.out.println(average);
    }
}