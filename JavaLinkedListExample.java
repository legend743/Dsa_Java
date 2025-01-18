import java.util.LinkedList;

public class JavaLinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(89);
        ll.add(800);
        ll.add(67);
        ll.add(76);

        System.out.println(ll.getLast());
        System.out.println(ll.contains(76));
        ll.addFirst(0000);
        System.out.println("This is first element after addition");
        System.out.println(ll.getFirst());
    }
}
