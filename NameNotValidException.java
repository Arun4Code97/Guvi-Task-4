package Problem1;

public class NameNotValidException extends Exception// extends parent class : Exception properties
{
    public NameNotValidException(String s) // declaring parameterized constructor
    {
       super(s);// passing the collected message to parent class : Exception(s) using super keyword
    }
}
