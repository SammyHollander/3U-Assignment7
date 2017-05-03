
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A7Q4 {

    //method to calculate compound intrest
    public static double compoundIntrest(double principal, double rate, double years) {
        //caculating the new balance
        double balance = (1 + rate);
        balance = Math.pow(balance, years);
        balance = principal * balance;
        return balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);

        //asks the user to input the principal amount, intrest rate, and the number of years
        System.out.println("please enter the principal amount, intrest rate, and the number of years");

        //tell the user their new balance by calling the compound intrest method
        System.out.println("Your new balance is: " + compoundIntrest(input.nextDouble(), input.nextDouble(), input.nextDouble()));


    }
}
