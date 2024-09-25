   abstract class AbstractClassDefinition{
    abstract int sum(int X,int Y);
}

   class AbsbractclassImpl extends AbstractClassDefinition {


    @Override
      public int sum(int x, int y) {

           return x + y;
       }
   }


public class AbstractClass {

    public static void main(String[] args) {
        AbsbractclassImpl Ab=new AbsbractclassImpl();
        System.out.println(Ab.sum(6,9));
    }
}
