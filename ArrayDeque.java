import  java.util.*;

public class ArrayDeque {

    public static void main(String[] args) {
        java.util.ArrayDeque<Integer> ad1=new java.util.ArrayDeque<>();
        ad1.add(78);
        ad1.add(108);
        ad1.add(99);
        //it is used to remove from first
        ad1.removeFirst();
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

        


    }
}
