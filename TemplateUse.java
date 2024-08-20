public class TemplateUse {
    public static void main(String[] args) {
        String letterHeader="Dear <|name|>,";
        String replaced=letterHeader.replace("<|name|>","Mohd Faisal");
        System.out.println(replaced);
    }
}
