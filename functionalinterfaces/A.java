package functionalinterfaces;

import java.util.Objects;
import java.util.function.Predicate;

public class A {

    public static void main(String[] args) {

        Predicate<Integer> p=n->n%2==0;
        Predicate<String>nameStartWithF=s->s.toLowerCase().charAt(0)=='d';
        Predicate<String>EndsWithL=x->x.toLowerCase().charAt(x.length()-1)=='l';
        Predicate<String>And=nameStartWithF.and(EndsWithL);
        Predicate<String>Or=nameStartWithF.or(EndsWithL);
      Predicate<Object>predicate=Predicate.isEqual("Faisal");
      String name="Faisal";
        System.out.println(name.toLowerCase());
        System.out.println(predicate.test(name.toLowerCase()));
        System.out.println(Or.test("Faheem"));
        System.out.println(And.test("Faheem"));
        System.out.println(nameStartWithF.test("Doctor"));
        System.out.println(EndsWithL.test("Faisal"));

    }
}



