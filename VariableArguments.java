public class VariableArguments {

    static int sum(int ...val){
    int result=0;
    for(int a:val){
        result+=a;
    }
    return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(10,7,89,83939,93,383,293,3,3,2));

    }
}


