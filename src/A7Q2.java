
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A7Q2 {
    //method to take the inputed exam grade and tell the user their grade

    public static void examGrade(double grade) {
        if (grade < 50) {
            System.out.println("F");
        }
        if (grade > 50 && grade < 59 || grade == 50 || grade == 59) {
            System.out.println("D");
        }
        if (grade > 60 && grade < 69 || grade == 60 || grade == 69) {
            System.out.println("C");
        }
        if (grade > 70 && grade < 79 || grade == 70 || grade == 79) {
            System.out.println("B");
        }
        if (grade > 80 || grade == 80) {
            System.out.println("A");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //asking the user to input their percentage
        System.out.println("Please enter your percentage, and your grade will be displayed");

        //new scanner for user input
        Scanner input = new Scanner(System.in);

        //get the exam grade and output it to the user
        examGrade(input.nextDouble());
    }
}