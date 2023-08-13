public class SwitchCase {
    public static void main(String[] args) {
        String grade = "B";

        switch (grade) {
            case "A":
                System.out.println("Best :)");
                break;
            case "B":
                System.out.println("Better");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Bad");
                break;
            case "E":
                System.out.println("Worse");
                break;
            default:
                System.out.println("Worst :(");
        }
    }
}