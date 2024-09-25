
class ForInheritance{
    int x=10;
    String name;
    private String age;
    //private member
    private int role=90;


    public void setName(String name){
        this.name=name;

    }
    public String getName(){
        System.out.println("This is inside base class");
        return name;
    }
    public void setAge(String age){
        this.age=age;

    }
    public String getAge(){
        return age;
    }

}
class inherited extends ForInheritance{
    String address;
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        System.out.println("This is in inherited class");
        return address;
    }
}

public class Inheritance {


    public static void main(String[] args) {


        ForInheritance fI=new ForInheritance();

        inherited In=new inherited();
        In.setAddress("Dubai");
        In.setName("Mohd Faisal");
        System.out.println(In.getName());
        System.out.println(In.getAddress());
        In.setAge("twelve");
        System.out.println(In.getAge());

//        we are not allowed to us private member while inheriting class
//        System.out.println(In.role);

    }




}
