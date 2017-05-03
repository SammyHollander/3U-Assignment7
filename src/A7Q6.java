
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static int lastDigit(int number) {
        //takes the inputed number and splits it into its digits
        int endDigit = number % 10;
        if (endDigit < 0) {
            endDigit = endDigit * -1;
        }
        return endDigit;
    }

    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);

        //asks the user to enter an integer
        System.out.println("Please enter any integer");
        int answer = lastDigit(input.nextInt());

        //uses the lastDigit method to return the last digit in the integer entered
        System.out.println("The last digit in the integer was: " + answer);

    }
}
