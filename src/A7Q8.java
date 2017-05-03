
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A7Q8 {

    //a method that determines what season it is from the inputed month and day
    public static String Season(int month, int day) {
        //defining season
        String season = " ";

        //Winter months
        //January or February
        if (month == 1 || month == 2) {
            season = "Winter";
        }
        //end of December
        if (month == 12 && day >= 16) {
            season = "Winter";
        }
        //beginning of march
        if (month == 3 && day <= 15) {
            season = "Winter";
        }


        //Spring months
        //April or May
        if (month == 4 || month == 5) {
            season = "Spring";
        }
        //end of March
        if (month == 3 && day >= 16) {
            season = "Spring";
        }
        //beginning of June
        if (month == 6 && day <= 15) {
            season = "Spring";
        }


        //Summer months
        //July or August
        if (month == 7 || month == 8) {
            season = "Summer";
        }
        //end of June
        if (month == 6 && day >= 16) {
            season = "Summer";
        }
        //beginning of September
        if (month == 9 && day <= 15) {
            season = "Summer";
        }


        //Fall months
        //October or November
        if (month == 10 || month == 11) {
            season = "Summer";
        }
        //end of September
        if (month == 9 && day >= 16) {
            season = "Summer";
        }
        //beginning of Decmber
        if (month == 12 && day <= 15) {
            season = "Summer";
        } //if they entered an invalid date (exluding Febraury and months that only have 30 days)
        else if (month > 12 || day > 31) {
            return "That is an invalid date";
        }
        return season;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);

        //asks the user to enter a month and a day as integers
        System.out.println("Please enter a month and a day of the year (as integers");
        //saves the season as a string
        String season = Season(input.nextInt(), input.nextInt());

        //tells the user what season it is
        System.out.println("The season is: " + season);
    }
}
