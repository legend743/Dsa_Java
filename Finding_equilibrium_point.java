public class Finding_equilibrium_point {
    public static void main(String[] args) {
       int[] values={1,2,0,3};
       int n=5;
       int sum1=0;

       for(int i=0;i<n;i++){
           sum1=sum1+values[i];
           int sum2=0;
           for(int j=i+2;j<n;j++){
               sum2=sum2+values[j];
               if(sum1==sum2){
                   System.out.println(j);
               }
               if(sum1<sum2){
                   break;
               }
           }

       }
        System.out.println("Doen not have equilibrium point");
    }

}

