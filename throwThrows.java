import java.awt.*;
import java.util.Scanner;

class NegativeException extends  Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!!!";
    }

    @Override
    public String getMessage() {
        return "Radius never be negative!!!";
    }
}
public class throwThrows {


    //when you are using thows keyword you have to call that funtion with try catch block
    //otherwise you will get error


    public static double area(int r) throws NegativeException{
        if(r<0){
            throw new NegativeException();
        }
        double result=Math.PI*r*r;
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Enter the radius");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       try{
           System.out.println(area(a));
       }catch (Exception e){
           System.out.println(e.getMessage());
           e.printStackTrace();
       }


    }
}
