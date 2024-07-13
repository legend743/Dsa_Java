import java.util.Arrays;

public class countArray {


    void findTwoElement(int arr[], int n) {
        int[] resultArr = new int[2]; // resultArr[0] will hold the repeated number, resultArr[1] will hold the missing number
        int[] count = new int[n + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        System.out.println(Arrays.toString(count));

        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                resultArr[0] = i;
            } else if (count[i] == 0) {
                resultArr[1] = i;
            }
        }


    }

    public static void main(String[] args) {
        countArray cc=new countArray();
        int[] val={12,44,45,46,48,49,50};

        cc.findTwoElement(val,7);
    }

}

