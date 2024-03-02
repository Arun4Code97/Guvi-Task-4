package Problem1;

public class AgeNotWithinRangeException extends Exception // extends parent class : Exception properties
{
 public AgeNotWithinRangeException(String s) // declaring parameterized constructor
 {
  super(s); // passing the collected message to parent class Exception(s) using super keyword
 }

}
