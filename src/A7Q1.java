
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A7Q1 {

    //new method that calculates the area of a circle
    public static double cirArea(double radius) {
        //2*pi*r^2 is the area
        double area = 2 * Math.PI * Math.pow(radius, 2);
        //return area
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);

        //asks the user to input the radius
        System.out.println("Please input the radius of a circle");

        //caclulates the area using the cirArea method
        //tells the user the area
        System.out.println("The area of the circle is: " + cirArea(input.nextDouble()));

    }
}
