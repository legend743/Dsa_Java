import java.util.ArrayList;
import java.util.Date;

public class JavAdvanceArr {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Faisal is good boy!!");
        arr.add("Rahil reads book!!");
        arr.add("Go to there!!");
        arr.add("You didn't even listen me!!");
        for(Object o:arr){
            System.out.println(o);
        }
        Date d=new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        System.out.println(d.getDay());
        System.out.println(d.getDate());
        System.out.println(1900  +d.getYear());
    }
}
