
interface MyCamera{
    void takingSnap();
    void recordingVideoin4k();
}

class Phone{
    void callingNumber(){
        System.out.println("Calling...");
    }
}

class MySmartphone extends Phone implements MyCamera {
    @Override
    public void takingSnap() {
        System.out.println("snap taken....");

    }
    public  void recordingVideoin4k(){
        System.out.println("recording video...");
    }


}

public class PolymorphismJava {
    public static void main(String[] args) {
        MyCamera cam1=new MySmartphone();
        cam1.takingSnap();
        Phone ph=new Phone();
        ph.callingNumber();
        MySmartphone ms=new MySmartphone();
        ms.recordingVideoin4k();


    }



}
