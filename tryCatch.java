public class tryCatch {
    public static void main(String[] args) {
        int a=1000;
        int b=0;
        //if we do not handle this our code will give error and will get crashed
//        but when we handle exception then it will give you an error message but
//                it still execute rest of the code
//        int c=a/b;
//        System.out.println("Your output is:"+c);

        // see how I handle this here
        try {
            int c=a/b;

            System.out.println(""+c);
            System.out.println("program runs easily!!");
        }
        catch (Exception e){
            System.out.println(e);
            //if you use stack trace then it will show you the line where exception occured!!
//e.printStackTrace();
        }
        //here you can see that the rest code is running while having an error
        System.out.println("Got an error!!");

    }
}
