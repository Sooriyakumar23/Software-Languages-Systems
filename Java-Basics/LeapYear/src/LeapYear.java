import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the year you want to check: ");
        int year = in.nextInt();

        if ((year%400 == 0) || ((year%100 != 0) && (year%4 == 0))) {
            System.out.println("This is a leap year");
        }
        else {
            System.out.println("Not a leap year !");
        }
    }
}
