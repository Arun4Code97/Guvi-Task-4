package Problem5;

import java.util.Scanner;
import java.util.Stack;

public class StackTest
{
    // Declared class fields - stk is reference for Stack collections, reader is a reference for Scanner Class
    private Stack<Integer> stk;
   private Scanner reader;
    //initializing fields with StackTest constructor
    StackTest()
   {
       this.stk = new Stack<>();
       this.reader = new Scanner(System.in); // declared here,So it can be accessed by all class methods
   }

    public static void main(String[] args)
    {
        StackTest obj = new StackTest(); // creating object for class StackTest

        obj.pushElementToStack(); // calling method pushElementToStack() to push a element to the stack
        obj.pushElementToStack(); // Also uncomment this line to get one more element to the stack

        if(!obj.isStackEmpty()) // To check whether the stack is not empty,so that element can be deleted
            obj.popElementsFromStack(); // to remove the top element
        else System.out.println("There is no elements in stack as it is already empty : ");
   }

    private boolean isStackEmpty() // returns true if stack is empty
    {
        return stk.empty();
    }

    private void pushElementToStack() // push/add element to the stack:stk
    {
        System.out.println("Enter a integer number to be added in the stack : ");
        int number = Integer.parseInt(reader.nextLine());
        stk.push(number);
        System.out.println("Element has been added in Stack successfully!!");
    }

    private void popElementsFromStack() // stk.pop() - pops/removes the top element from stack and returns the same element
    {
        System.out.println("Top element " + stk.pop() + " in the stack has been removed");
    }


}
