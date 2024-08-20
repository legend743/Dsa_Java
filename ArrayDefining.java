import java.util.Arrays;

public class ArrayDefining {
    public static void main(String[] args) {
        int [] arr={12,22,33,4,5,6};
        int [][] flats=new int[5][5];
        flats[0][0]=11;
        flats[0][1]=33;
        flats[0][2]=77;
        flats[0][3]=8;
        flats[0][4]=70;
        flats[1][0]=54;
        flats[1][1]=74;
        flats[1][2]=98;
        flats[1][3]=57;
        flats[1][4]=909;
        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }


//        arr[2]=7;
//        System.out.println(arr.length);
//
//        for(int elem:arr){
//            System.out.println((elem*7));
//
//        }
    }
}
