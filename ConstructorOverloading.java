public class ConstructorOverloading {

    private int Salary;
    private String name;

    public ConstructorOverloading(){
        Salary=1000;
        name="Faisal";
    }
public ConstructorOverloading(String val){
        Salary=20000;

}

    public static void main(String[] args) {
        ConstructorOverloading cc=new ConstructorOverloading();
        System.out.println(cc.Salary);
        ConstructorOverloading cc1=new ConstructorOverloading("Faisa;");
        System.out.println(cc1.Salary);
    }
}

