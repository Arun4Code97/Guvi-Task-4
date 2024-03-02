package Problem2;


import java.util.Scanner;

public class Voter
{
    //declaring class fields --> voterID,name,age
    int voterId;
    String name;
    int age;

    // using parameterized constructor to initialize the object
    public Voter(int voterId,String name,int age) throws Exception // adding 'throws Exception' to the constructor as it is using throw keywords
    {
        this.voterId =voterId;
        this.name = name;
        this.age =age;
        try // to throw an exception if user entered age is less than 18
        {
            if(age < 18)
                throw new Exception("Invalid age for voter");
            else System.out.println("Allowed to vote");
        }
        catch (Exception e) // to catch the thrown exception by try and displays exception message
        {
            System.out.println(e.getMessage()); // e.getMessage() - provides a message which is mentioned in exception argument
        }

    }

    public static void main(String[] args) throws Exception
    {
        // To collect only the age from user
        System.out.println("Enter age of voter ");
        Scanner Reader = new Scanner(System.in); // creating object for Scanner class


        int age = Reader.nextInt(); // storing the entered int value to variable age
        new Voter(21,"Arun",age); //passing 2 fixed parameters 21,Arun and user entered age to the Voter Constructor
    }


}
