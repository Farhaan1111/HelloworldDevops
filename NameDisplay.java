import java.util.*;
import java.lang.*;

class NameDisplay{
    public static void main(String[] args) {
        // Check if there are two command-line arguments (first name and last name)
        if (args.length == 2) {
            String firstName = args[0];
            String lastName = args[1];
            int n1= Integer.parseInt(firstName);
            int n2= Integer.parseInt(lastName);
            int sucum=n1*n2;

            System.out.println("Product: " +sucum);
        } else {
            System.out.println("Please provide both first name and last name as command-line arguments.");
        }
    }
}
