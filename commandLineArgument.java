/*
In Java, the String[] args in the main function is a parameter that allows your program to accept command-line arguments. Here's a detailed explanation:

1. String:
Refers to the data type of the parameter.
Command-line arguments are passed as strings.
2. []:
Indicates that args is an array of String objects.
This array can hold multiple values (arguments).
3. args:
This is just a name for the parameter (short for "arguments").
You can rename it to something else, like arguments, but args is a common convention.
Functionality:
When you run a Java program, you can pass additional values (arguments) from the command line. These values are stored in the args array and can be accessed within the program. 

*/
public class commandLineArgument {
    public static void main(String[] args) {
        // Check if arguments are provided
        
        if (args.length > 0) {
            System.out.println("Command-line arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }
}
