import java.util.Scanner;

public class LargeOneThree {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your First Number: ");
        int firstNumber = in.nextInt();
        System.out.print("Enter your Second Number: ");
        int secondNumber = in.nextInt();
        System.out.print("Enter your Third Number: ");
        int thirdNumber = in.nextInt();

        if ((firstNumber == secondNumber) && (firstNumber == thirdNumber)) {
            System.out.println("All three numbers are same. So all are large !");
        }
        else if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("First number " + firstNumber + " is largest");
        }
        else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println("Second number " + secondNumber + " is largest");
        }
        else {
            System.out.println("Third number " + thirdNumber + " is largest");
        }

    }
}
