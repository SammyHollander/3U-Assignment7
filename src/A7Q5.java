
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A7Q5 {

    //prints a random number of astrixies
    public static void chaotic(int lines) {
        //print the astirxies pattern
        for (int i = 0; i < lines; i++) {
            //determining the number of random astricies from 1-5 per line
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            System.out.println(" ");
            for (int j = 0; j < randNum; j++) {
                System.out.print("*");

            }
        }
        //print a blank line
        System.out.println(" ");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //Asks the user to enter a integer for the number of lines
        System.out.println("Please enter an integer");
        chaotic(input.nextInt());
    }
}
