
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A7Q7 {

    //takes the first digit from an inputed number
    public static int firstDigit(int number) {
        //gets the length of the inputed number as an integer
        int length = String.valueOf(number).length();
        //determines what power of ten to divide number by to get the first digit
        double dividend = Math.pow(10, length - 1);
        //convert dividend back to an int
        int div = (int) Math.round(dividend);
        //if the length is only one, then it will just take the first digit
        if (length == 1) {
            div = 1;
        }
        //divides it by ten to the power of the length to get the first digit as an integer
        int startDigit = number / div;
        //if the number was negative, it makes it positive
        if (startDigit < 0) {
            startDigit = startDigit * -1;
        }
        //returns the first digit
        return startDigit;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);

        //asks the user to enter an integer
        System.out.println("Please enter any integer");
        int answer = firstDigit(input.nextInt());


        //uses the firstDigit method to return the first digit in the integer entered
        System.out.println("The first digit in the integer was: " + answer);
    }
}
