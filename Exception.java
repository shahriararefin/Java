import java.util.Scanner;

public class Exception extends Throwable {

    static void main(String[] args) {

        while(true) {          //run the code as long as the user give the right input!!
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter num1: ");
            int num1 = input.nextInt();

            System.out.println("Please enter num2: ");
            int num2 = input.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);

        }
    }
}



