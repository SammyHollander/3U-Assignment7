
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A7Q9 {

    //method to determine if all of the digits in an inputed number are odd
    public static boolean allDigitsOdd(int number) {
        //setting temp boolean of isOdd to true
        boolean isOdd = true;
        if (String.valueOf(number).contains("0") || String.valueOf(number).contains("2") || String.valueOf(number).contains("4") || String.valueOf(number).contains("6") || String.valueOf(number).contains("8")) {
            isOdd = false;
        }
        if (!(String.valueOf(number).contains("0") || String.valueOf(number).contains("2") || String.valueOf(number).contains("4") || String.valueOf(number).contains("6") || String.valueOf(number).contains("8"))) {
            isOdd = true;
        }
        return isOdd;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);

        //asks the user to input an integer
        System.out.println("Please enter an integer");

        //new variable for the number
        int number = input.nextInt();
        boolean ifodd = allDigitsOdd(number);

        //if all the digits are odd
        if (ifodd == true) {
            //tell the user all the digits are odd
            System.out.println("The number contains all odd digits");
        }
        //if not all of the digits are odd
        if (ifodd == false) {
            //tell the user the number does not contain all odd digits
            System.out.println("The number does contains all odd digits");
        }


    }
}
