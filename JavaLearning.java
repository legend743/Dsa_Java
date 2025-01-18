import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class JavaLearning {

    public static void main(String[] args) {

        List<Integer> nums= Arrays.asList(89,88,23,45,52);
//        List<String>name=Arrays.asList("Faisal","Junaid","Rafiq","Rizwan","Rehan");
//        nums.forEach(n-> System.out.println(n+30));

        Stream<Integer> evenNmber=nums
                .stream()
                .filter(n->n%2==0);
        System.out.println();
    }
}
