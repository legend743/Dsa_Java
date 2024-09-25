interface Animal{
    void eat();
    void sleep();
}

public  class Monkey {
void jump(){
    System.out.println("Monkey is jumping");
};
void bite(){
    System.out.println("mokey is biting...");
}
public  static class Human extends Monkey implements Animal{
    @Override
    public void eat() {
        System.out.println("monkey can eat anything.");

    }

    @Override
    public void sleep() {
        System.out.println("Human has to take 8 hour sleep!!");
    }

    public static void main(String[] args) {
          Human h=new Human();
        h.eat();
        h.sleep();
        Monkey m=new Human();
        m.bite();
        m.jump();
      

    }

}

}
