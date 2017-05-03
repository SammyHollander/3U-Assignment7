
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A7Q3 {

    //caclulates all the factors of whatever number is inputed and prints them to screen
    public static void factors(int product) {
        //print a blank line
        System.out.println("");
        //create a new array to store the values to be checked for factors
        int[] mult = new int[product + 1];
        //store the values from 1 to product in the mult array
        for (int i = 0; i < mult.length; i++) {
            mult[i] = i;
        }
        //test to see if each value in mult is a factor of product
        for (int i = 1; i < mult.length; i++) {
            //check if its a multiple
            if ((product % mult[i]) == 0) {
                //if it is, print the value
                System.out.print(" +-" + mult[i] + " ");

            }

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);

        //asks the user to input an integer
        System.out.println("Please enter an integer and its facotrs will be displayed");
        factors(input.nextInt());
    }
}
