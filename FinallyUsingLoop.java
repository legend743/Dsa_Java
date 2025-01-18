public class FinallyUsingLoop {

    public static void count(int k){
        try{
            for(int i=0;i<k;i++){
                System.out.println(i);

            }

        }catch (Exception e){
            if(k<1){
                System.out.println("you have given negative value");
            }
            e.printStackTrace();
            
        }
        finally {
            System.out.println("releasing resources......please wait!!!");
        }

    }

    public static void main(String[] args) {
        count(8);
    }


}


