package Problem1;

import java.util.Scanner;

public class Student {
    //Declaring student class fields
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Initializing Student class fields with parameterized constructor
    public Student(int rollNo, String name, int age, String course)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    // adding 'throws Exception' to the main method as it throws exceptions at line  39 & 55
     public static void main(String[] args) throws Exception
    {
        Scanner reader = new Scanner(System.in); //creating object for Scanner class
        System.out.println("Enter student roll number :");
        int roll_num = Integer.parseInt(reader.nextLine()); //storing entered roll number to var roll_num

        System.out.println("Enter student name");
        String name = reader.nextLine(); //storing entered name to var name

        boolean flag = true; // using flag to create an object only if user entered variables are valid

        flag = generateNameException(name);

        System.out.println("Enter student age");
        int age = Integer.parseInt(reader.nextLine()); // stores entered age to var age

        flag= generateAgeException(age);

        System.out.println("Enter student course");
        String course = reader.nextLine(); // stores entered age to var course

        if(flag) // creates object for a student only if entered details are valid
        {
            Student obj = new Student(roll_num,name,age,course);
            System.out.println("***** Created a object for the student successfully ******");
        }
        else // displays below message if entered details are not valid
            System.out.println("********** Unable to create object as you entered invalid age or name ********");
    }

    private static boolean generateAgeException(int age)
    {
        try // using try as it throws exception at line 55
        {
            if (!(age >= 18 && age <= 21)) // if entered age is not within range,throws below Exception
            {
                throw new AgeNotWithinRangeException("AgeNotWithinRange");
            }
        }
        catch (Exception ex) // To catch the exception and display its message
        {
            System.out.println(ex.getMessage());
           return false; // setting flag to false, so that will not create any object
        }
        return true;
    }

    private static boolean generateNameException(String name)
    {
        try // using try block as line 75 throws exception
        {
            for (int i = 0; i < name.length(); i++) //for iterating inside the string
            {
                char c = name.charAt(i); // to store character at each index

                if (!((c >= 65 && c <= 90) || (c >= 'a' && c <= 'z') || (c == ' '))) //checks if any other characters found except 'a-z' , 'A-Z' & '0-9'
                    throw new NameNotValidException("NameNotValidException");

            }
        }
        catch (Exception e) // To catch the exception and display its message
        {
            System.out.println(e.getMessage());
            return false; // setting flag to false, so that will not create any object
        }
        return true;
    }


}

