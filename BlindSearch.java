import java.util.Random;
import java.util.Scanner;



public class BlindSearch {
    private int randomNumber;
    public BlindSearch(){
        Random random=new Random();
        randomNumber=random.nextInt(100);

    }
    static class Issame {
        private int number;

        public void uu(int number) {
            this.number = number;
        }

        BlindSearch search = new BlindSearch();
        int randomBlindSearchNumber = search.randomNumber;

        public String checkNumber(int number) {
            while (number!= randomBlindSearchNumber) {
                if (number >randomBlindSearchNumber) {
                    System.out.println("Number is greater than!!");

                }
                System.out.println("number is less than random number");
            }
            return "matchedd!!";

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write Guessed number!!!");
        int val=sc.nextInt();
        BlindSearch search = new BlindSearch();
        System.out.println(search.randomNumber);
        Issame same=new Issame();
       System.out.println(same.checkNumber(val));


    }
}
