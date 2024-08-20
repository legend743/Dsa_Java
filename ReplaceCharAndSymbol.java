public class ReplaceCharAndSymbol {
    public static void main(String[] args) {
        String sentence="Hi,  this is Mohd Faisal/";
        String cleanedSentence=sentence.replace("  ","").replace("/","");
        System.out.println(cleanedSentence);
        System.out.println(sentence.replace("  ",""));
//        System.out.println(sentence.replace("/",""));
    }
}
