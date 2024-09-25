
 class multiThread extends Thread{
    @Override
    public void run() {
        int n=0;
        while(n<2000){
            System.out.println("You are in thread 1______");
        }

    }
}

class multiThread2 extends  Thread{
    @Override
    public void run() {
        int n=0;
        while (n<6000){
            System.out.println("You are in thread 2______");
        }
    }
}
public class Multithreading_in_java {


    public static void main(String[] args) {


        multiThread2 m2=new multiThread2();
        multiThread m=new multiThread();
        m2.start();
        m.start();
    }
}
