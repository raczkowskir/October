import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Type a number:");
        Ex1 ex1 = new Ex1();
        System.out.println(Integer.toBinaryString(ex1.getNumber()));
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