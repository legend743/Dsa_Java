public class FinallyBlock {

    public static int greet(){
        //here you can see that finally block code is running even though the code returns its value
        //
        try{
            int a=19;
//            int b=9; //it does not matters that code runs succesfully or return the value finally always runs
            int b=0;

            int c=a/b;
            return c;
        }catch (Exception e){
            e.printStackTrace();
        }
        //you can check it by removing finally the rest code returns value only then when there is exceotion otherwise
//      it will returns the value and terminate the code
        finally {
            System.out.println("realeasing resources.....");
        }
       return -1;
    }

    public static void main(String[] args) {
        int k=greet();
        System.out.println(k);
    }
}
