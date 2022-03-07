import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your First number: ");
        int firstNumber = in.nextInt();
        System.out.print("Enter your Second number: ");
        int secondNumber = in.nextInt();

        if (firstNumber == secondNumber){
            System.out.println("Both numbers are equal");
        }
        else{
            if (firstNumber < secondNumber){
                System.out.println("Second number is larger than First number");
            }

            else{
                System.out.println("First number is larger than Second number");
            }
        }



    }
}
