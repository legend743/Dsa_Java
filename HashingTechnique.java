import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public class HashingTechnique {

    public static void main(String[] args) {
        HashSet<Integer> HashSet=new HashSet<>(8);
        //Here I am using HashSet hence it does not store any duplocate value in it

        HashSet.add(99);
        HashSet.add(87);
        HashSet.add(55);
        HashSet.add(87);
        System.out.println(HashSet);
        HashMap<String,Integer> HashMap=new HashMap<>();
        HashMap.put("Faisa",99);
        System.out.println(HashMap);
        System.out.println(HashMap.isEmpty());
        System.out.println(HashMap.get("Faisa"));
        Date d=new Date();
        System.out.println(d.getTime());



    }
}
