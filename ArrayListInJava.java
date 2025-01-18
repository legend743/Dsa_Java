import java.util.ArrayDeque;
import java.util.ArrayList;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();


        l1.add(19);
        l1.add(44);
    l2.add(29);
    l2.add(55);
    l1.addAll(l2);
        for (int i=0;i< l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println(l1.size());

    }



}
