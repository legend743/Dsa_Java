public class CreateArrayAndSum {
    public static void main(String[] args) {
        System.out.println("Array with 5 elements:");
        float arr[]={0.01f,88.5f,89.90f,20.2f,54.6f};
        float sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.printf("Sum of array is: %f",sum);
    }
}
