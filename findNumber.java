public class findNumber {
    public static void main(String[] args) {
        float arr[]={12.0f,33.5f,44.0f,55.89f};
        float val=12.0f;

        for(float element:arr){
            if(element==val){
                System.out.println("Got the value at index:");
                break;
            }
            System.out.println("did not find at this iteration");
        }

    }
}
