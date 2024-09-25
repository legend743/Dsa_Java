 class employeeSalary{
    private int salary=10000;
    private String name;
    private int empId;
    private String mobileNumber;
    public void setSalary(int salary){
        this.salary=salary;

    }
    public int getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmpId(int Id){
        this.empId=Id;
    }
    public int getEmpId(){
        return empId;
    }

    public void setMobile(String number){
        if(String.valueOf(number).length()!=10){
            System.out.println("please check the number!!!");
        }
        else this.mobileNumber=number;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
}

public class EmployeeDummyDetails {


    public static void main(String[] args) {
        employeeSalary salary=new employeeSalary();
//        salary.setSalary(140000);
        salary.setName("Mohd Faisa");
        salary.setEmpId(7);
        System.out.println(salary.getSalary());
        salary.setMobile("88997376487");

        System.out.println(salary.getMobileNumber());
    }
}
