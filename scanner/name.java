import java.util.Scanner;
public class name {
public static void main(String[] args) {
//Create an object of Scanner class to help get input
Scanner myInput = new Scanner(System.in);
        //declare 4 memory boxes (variables)
        String firstName, lastName, fullName;
        //get input
        System.out.print("Enter your First name: ");
        firstName = myInput.nextLine();
        System.out.print("Enter your Last name: ");
        lastName = myInput.nextLine();
        fullName = firstName + " "+ lastName;
        System.out.println("Hello, my name is " + fullName );

        
    }
}