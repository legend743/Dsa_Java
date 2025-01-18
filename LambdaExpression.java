
@FunctionalInterface
interface calci{
         void sum(int a);
    }
public class LambdaExpression {


    public static void main(String[] args) {
        calci cal=(a)->{System.out.println("this is anonymous function with value"+":"+a);};

        cal.sum(3);
    }
}
