
class Mythread  implements Runnable{
   public  void run(){
       int n=19;
       while(n<1000){
        System.out.println("this is my thread1 runnable interface!!!");
        System.out.println("this is my thread1 runnable interface!!!");
        System.out.println("this is my thread1 runnable interface!!!");
        System.out.println("this is my thread1 runnable interface!!!");
        System.out.println("this is my thread1 runnable interface!!!");
        System.out.println("this is my thread1 runnable interface!!!");
        System.out.println("this is my thread1 runnable interface!!!");
        n++;
    }}


}
class Mythread2 implements Runnable{
    public void run() {
        int m=0;
        while (m < 199) {
            System.out.println("this is mythread 2 runnable Interface!!!");
            m++;
        }
    }
}
public class RunnableClassInterface {
    public static void main(String[] args) {
        //here we cannot call run directly by making object this class
       // Mythread t1=new Mythread();//in this way you only get running on one thread
        //Mythread2 t2=new Mythread2();
        //t1.run();
        //t2.run();

    //but in this way they will run concurrently

        Mythread t1=new Mythread();
        Thread thread1=new Thread(t1);
        Mythread2 t2=new Mythread2();
        Thread thread2=new Thread(t2);
        thread1.start();
        thread2.start();
        //The reason why your threads might not appear to be running concurrently
        // could be related to how thread scheduling works internally, but most likely it has to do with the fact that both threads are being run in rapid succession and the output is interleaved in a non-noticeable way. However, both threads are actually running concurrently, but since they are both just printing to the console, you may not observe the expected "interleaving" as clearly.
        // Java's Single Inheritance Limitation
        //Extending Thread: When a class extends Thread, it cannot extend any other class because Java only supports single inheritance (a class can only extend one other class). This restricts the class from inheriting from any other useful classes.
        //Implementing Runnable: If a class implements Runnable, it is free to extend another class,
        // which offers more flexibility. This is a significant advantage when you want to leverage
        // inheritance from another class while still using threading.

    }
}
