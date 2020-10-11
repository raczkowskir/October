import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
// works, time for next exercise :)
//        createSortAndShowArray(ex2);

        String myTxt  = ex2.getString();
        System.out.println(myTxt);
        System.out.println("The length of myTxt is:" + myTxt.length());
        StringBuilder SBmyTxt = new StringBuilder(myTxt);
        StringBuilder SBmyReversedTxt = SBmyTxt.reverse();
        String myReversedTxt = SBmyReversedTxt.toString();
        System.out.println(myReversedTxt);
        System.out.println("Is it a palindrom:" + myTxt.equals(myReversedTxt));
    }



    private static void createSortAndShowArray(Ex2 ex2) {
        System.out.println("What is the array size? Type number:");
        Integer[] newTab = new Integer[ex2.getNumber()];

        for (int i = 0; i < newTab.length; i++) {
            System.out.println("Lets fill in the array. Type number:");
            newTab[i] = ex2.getNumber();
        }

        Arrays.sort(newTab);

        for (int i : newTab) {
            System.out.println(i);
        }
    }

    public String getString() {
        String myTxt;
        System.out.println("Type sth not sht:");

        while(true) {
            try {
                Scanner scanner = new Scanner(System.in);
                myTxt = scanner.nextLine();
            } catch (InputMismatchException E) {
                System.out.println("Type sth not sht:");
                continue;
            }
            return myTxt;
        }
    }

    public Integer getNumber() {
        int myNumber;
        while(true) {
            try {
                Scanner scanner = new Scanner(System.in);
                myNumber = scanner.nextInt();
            } catch (InputMismatchException E) {
                System.out.println("This is not an integer number. Type the number one more time.");
                continue;
            }
            return myNumber;
        }
    }
}
