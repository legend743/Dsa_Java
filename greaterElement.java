public class greaterElement {
    public static void main(String[] args) {
        int[] arr={1,3,2,4};
        int[] greaterEle=new int[4];

        int n=4;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i+1]>arr[i]){
                int g=arr[i+1];
                greaterEle[i]=g;
            }
            else{
                greaterEle[i]=-1;
            }
        }
        for(int m=0;m<n;m++){
            System.out.println(greaterEle[m]);


        }

    }
}
