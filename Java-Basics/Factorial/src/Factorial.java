public class Factorial {
    public static void main(String args[]) {
        int num = 4;
        int factorial = 1;
        while (num>1) {
            factorial *= num;
            num --;
        }

        if (num >= 0) {
            System.out.println("Factorial of " + num + " is " + factorial);
        }
        else {
            System.out.println("Negative numbers does not have factorial at all !");
        }
    }
}
