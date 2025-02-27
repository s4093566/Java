import java.util.Scanner;
public class date {
public static void main(String[] args) {
//Create an object of Scanner class to help get input
Scanner myInput = new Scanner(System.in);
        //declare 4 memory boxes (variables)
        int date, year;
        String day, month;
        //get input
        System.out.print("Enter the date: ");
        date = myInput.nextInt();
        System.out.print("Enter the year: ");
        year = myInput.nextInt();
        myInput.nextLine();
        System.out.print("Enter the day: ");
        day = myInput.nextLine();
        System.out.print("Enter the month: ");
        month = myInput.nextLine();
        System.out.println("American Format: " + day + ", "+ month + ", " + date + ", " + year);
        System.out.println("European Format: " + day + ", "+ date + ", " + month + ", " + year);
        System.out.println("Japanese Format: " + year + ", "+ month + ", " + date + ", " + day);

        
    }
}