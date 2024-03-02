package Problem4;

import java.util.HashMap;
import java.util.Scanner;

public class StudentHashMap
{
    //Declaring a field map, where key - String type & Value - Integer type
   private HashMap<String,Integer> map;
   public StudentHashMap() // Initializing map with empty constructor
   {
       this.map=new HashMap<>();
   }


    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        StudentHashMap obj = new StudentHashMap(); //creating object for Student class

        boolean flag = true; // Setting flag = true --> To keep running the interactive menu until user enter option = 0
        while (flag)
        {
            System.out.println("\nChoose a option between(0-3) from below\n1.Add a student details\n2.Remove a student details\n3.Display a student grade\n4.Display all students\n0.Exit\n\n ");
            int option = Integer.parseInt(reader.nextLine()); //collecting the user option/choice
            switch (option)
            {
                case 0: // for exiting from the interactive menu
                {
                    flag = false;
                    break;
                }
                case 1: // To add a new student details
                {
                    System.out.println("Enter student name : ");
                    String nameL = reader.nextLine();
                    System.out.println("Enter student grade : ");
                    int gradeL = Integer.parseInt(reader.nextLine());
                    if (!obj.map.containsKey(nameL)) // checks if entered name is not available in map  ,then calling addStudent(nameL, gradeL)
                        obj.addStudent(nameL, gradeL);
                    else System.out.println("Can not be added again as it is available already\n");
                }
                break;
                case 2: // To remove the entered student name elements from map, if the name is already present in map.
                {
                    System.out.println("Enter a student name to be removed");
                    String nameL = reader.nextLine();
                    if(obj.map.containsKey(nameL)) // checks if the name is already present in map
                    {
                        obj.removeStudent(nameL); // removes the respective element (including key and value)
                        System.out.println("Removed successfully");
                    }
                    else System.out.println("Student name not found\n"); //displays this message if entered name is not found.
                }
                break;
                case 3: // To collect Student name from user and displays grade(value) by name
                {
                    System.out.println("Enter a student name ");
                    String nameL = reader.nextLine();
                    if(obj.map.containsKey(nameL)) // to check whether name is available already
                        obj.displayStudentGrade(nameL); // calling displayStudentGrade(nameL) to display grade by name
                    else System.out.println("entered student name is not found\n");
                }
                break;
                case 4:
                {
                    if (obj.map.isEmpty())  // to check if map is empty,else displays all student grades by name
                        System.out.println("No data available\n");
                    else obj.displayAllStudentGrades();
                }
                break;


            }
        }
    }

    private void addStudent(String name, int grade)
    {
        map.put(name,grade); // adding/putting a elemets into map using arguments name(Key),grade(value)
        System.out.println("Added successfully!!");
    }
    private void removeStudent(String name) // removes a student element from map using key
    {
        map.remove(name);
    }
    private void displayStudentGrade(String name) // displays student name and grade
    {
        System.out.println("Name : " + name + "  Grade : " + map.get(name));
        //map.get(name) - returns the value which is grade
    }

    private void displayAllStudentGrades() // To display all student details in the map
    {
        for(String name : map.keySet()) // using for each to iterate
            System.out.println("Name : " + name + "  Grade : " + map.get(name));
    }
}
