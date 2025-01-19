package functionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionChaining {
    public static void main(String[] args) {
        //this function is responsible for upperCasing
        Function<String,String>name=n->n.toUpperCase();
        //this one is for subtringing the data
        Function<String,String>filteres=m->m.substring(0,3);
        //this is for add it into result
        String result=name.andThen(filteres).apply("Faisal");
        System.out.println(result);


        //all interfave in one frame predicate,function,consumer,supplier
        Predicate<Integer>IsEven=n->n%2==0;
        Function<Integer,Integer>product=x->x*x;
        Consumer<Integer>consumer=y->System.out.println(y);
        Supplier<Integer>addedCose=()->200;

    if(IsEven.test(addedCose.get())){
        consumer.accept(product.apply(addedCose.get())) ;
    }

    }



}
