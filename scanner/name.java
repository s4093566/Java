import java.util.Scanner;
public class name {
public static void main(String[] args) {
//Create an object of Scanner class to help get input
Scanner myInput = new Scanner(System.in);
        //declare 4 memory boxes (variables)
        String firstName, lastName;
        //get input
        System.out.print("Enter your First name: ");
        firstName = myInput.nextLine();
        System.out.print("Enter your Last name: ");
        lastName = myInput.nextLine();
        System.out.println("Hello, my name is " + firstName + " "+ lastName);

        
    }
}