public class Methods {

    private int variable = 23;

    public static void main(String args[]) {
        System.out.println("Hello World !");
        int number = 23;
        System.out.println("Your output is : " + dividing(number));
        int output = multiplying(number);
        System.out.println("Your next output is : " + output);
    }

    public static double dividing(int number1) {
        double result;
        result = number1/5.0;
        return result;
    }

    public static int multiplying(int number2){
        int result2;
        result2 = number2 * 5;
        return result2;
    }
}
