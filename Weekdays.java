package Problem3;

import java.util.Scanner;

public class Weekdays
{
    public static void main(String[] args)
    {
        //initializing a string array to store all the days in a week.
        String[] WeekdaysArray = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        //Asking user to enter a number
        System.out.println("Enter a number between (1-7) to display respective day name in week(Sun - Sat) :");
        Scanner reader = new Scanner(System.in); // creating object for the Scanner class

        int number= reader.nextInt(); //storing the entered number into (variable)number

       // System.out.println(WeekdaysArray[number-1]);  --> if uncomment this, throws an ArrayIndexOutOfBoundsException and code will not run.

        try
        {
            System.out.println(WeekdaysArray[number-1]); //To display respective day name using index value
            // throws an ArrayIndexOutOfBoundException if entered number is not within range (1-7)
        }
        catch (Exception ex) //using catch to avoid the runtime error and make the rest of the codes to run
        {
            System.out.println(ex.getMessage()); //displays the message of the error
            System.out.println("Entered input which is out side range (1-7)");
        }
    }


}
