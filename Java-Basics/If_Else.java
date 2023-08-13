import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        if (input > 0) {
            System.out.println(input + " is a poitive number");
        }
        else {
            System.out.println(input + " is a negative number");
        }
    }
}