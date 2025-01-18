public class Mythread_constructor extends Thread{

        public Mythread_constructor( String name){
            super(name);
        }

    @Override
    public void run() {
        System.out.println("This is my constructed class!!!");
    }

    public static void main(String[] args) {
        Mythread_constructor mc=new Mythread_constructor("faisal");
        mc.start();
        Mythread_constructor mc1=new Mythread_constructor("Junaid");
        System.out.println(mc.getId());//this will gives you thread id

//        there are lot more method which you can use according to yourself
        System.out.println(mc.getName());
        System.out.println(mc1.getId());
    }
    }




