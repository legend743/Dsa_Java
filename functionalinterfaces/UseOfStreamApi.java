package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseOfStreamApi  {
    public static void main(String[] args) {
        List<Integer>li= Arrays.asList(12,33,12,44,588,44,984,24);
        List<Integer> filteredList = li.stream()
                .filter(x -> x % 2 == 0)
                .map(x->x+100)
                .distinct()
                .sorted((a,b)->b-a)
                .collect(Collectors.toList());
        System.out.println(filteredList);


        List<String> studentName = Arrays.asList( "Saif", "Faizan","Faisal", "Furkan");
        List<String> fai = studentName.stream()
                .filter(x -> x.toLowerCase()
                        .startsWith("fai"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(fai);
    }

}
