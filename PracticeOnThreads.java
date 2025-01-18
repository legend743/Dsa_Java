
class Greetings extends Thread{
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
                //It is used for delaying the process but you have to use try catch statement because sleep
                //method has some exception in it.
                
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Hlo everyone !!!!");

        }
    }

}class MorningGreetings extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("Good Morning!!!!");

        }
    }
}
public class PracticeOnThreads {

    public static void main(String[] args) {

        Greetings greetings=new Greetings();
        greetings.start();
        MorningGreetings morningGreetings=new MorningGreetings();
        morningGreetings.start();

    }


}
