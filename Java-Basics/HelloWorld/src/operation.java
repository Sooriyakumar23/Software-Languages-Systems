import java.util.Scanner;

public class operation {
    public static void main(String args[]){
        int firstNumber;
        int secondNumber;
        int result;

//        firstNumber = 10;
//        secondNumber = 23;
        Scanner in = new Scanner (System.in);

        System.out.print("Enter Number 1: ");
        firstNumber = in.nextInt();

        System.out.print("Enter Number 2: ");
        secondNumber = in.nextInt();

        result = firstNumber+secondNumber;
        System.out.print("Addition value : ");
        System.out.println(result);

//        TODO: Subtraction, Multiply, Division, Power...
    }
}
