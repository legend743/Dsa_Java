public class SpaceOccurance {
    public static void main(String[] args) {
        String indexOfSpace="This is Mohd   Faisal, HE is not so  intelligent";
        System.out.println(indexOfSpace.indexOf("   "));
        int firstDoubleSpace=indexOfSpace.indexOf("  ");
        System.out.println(indexOfSpace.replace("   "," ").replace("  "," "));


        String letter="Dear Faisal,\n\t Congratulations for connecting us.\nThanks!!";
        System.out.println(letter);
    }
}
