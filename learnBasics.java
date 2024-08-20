public class learnBasics {
    public static void main(String[] args) {
        String name="mohdfaisal";
        String name2="mohd  Faisal";
//        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf("al",9));
        System.out.println(name.equals(name2.toLowerCase()));
        System.out.println(name2.toUpperCase());
        System.out.println(name2.replace(" ",""));
        System.out.println(name.equalsIgnoreCase(name2));
    }
}
