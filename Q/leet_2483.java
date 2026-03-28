class leet_2483{
    public static  int bestClosingTime(String customers) {     
        //Brute force approach
        char [] s = customers.toCharArray();
        int n = s.length;
        int [] records = new int [n+1];
        
        for(int i=0; i<=n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(j<i&&s[j]=='N')count++;
                else if(j>=i&&s[j]=='Y')count++;
            }
            records[i]=count;     
        }
       int min=records[0];
       int best = 0;
        for(int i=1; i<records.length; i++){
            if(records[i]<min){
                min = records[i];
                best = i;
            }
        }
        return best;
    }
    public static void main(String [] args){
        String customers = "YYNY";
        System.out.println(bestClosingTime(customers));
    }
}