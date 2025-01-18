public class Thread_priority extends  Thread{
    public Thread_priority(String name){
        super(name);
    }

    @Override
    public void run() {
        while(true){
            System.out.println("This is my thread"+getName());
        }
    }

    public static void main(String[] args) {
        Thread_priority tp=new Thread_priority("No priority");

        Thread_priority tp2=new Thread_priority("max priority");

        Thread_priority tp3=new Thread_priority("----------");
        Thread_priority tp4=new Thread_priority("------------------");
        Thread_priority tp5=new Thread_priority("---------min priority Thread-------");
        tp2.setPriority(Thread.MAX_PRIORITY);
        tp5.setPriority(Thread.MIN_PRIORITY);
        tp.start();

        tp3.start();
        tp2.start();
        tp4.start();
        tp5.start();


    }
}
