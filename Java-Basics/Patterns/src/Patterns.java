public class Patterns {
    public static void main(String args[]){

//        TODO: a. Star increasing order
        System.out.println("Part (A) ");
        int number1 = 5;
        while (number1>0){
            for (int order=5-number1; order>-1; order--) {
                System.out.print('*');
            }
            System.out.println("");
            number1 --;
        }
        System.out.println("");

//        TODO: b. Star decreasing order
        System.out.println("Part (B) ");
        int number2 = 5;
        while (number2>0){
            for (int order=number2-1; order>-1; order--) {
                System.out.print('*');
            }
            System.out.println("");
            number2 --;
        }
        System.out.println("");

//        TODO: c. Number decreasing order
        System.out.println("Part (C) ");
        int number3 = 5;
        while (number3>0){
            for (int order=number3; order>0; order--) {
                System.out.print(order);
            }
            System.out.println("");
            number3 --;
        }
        System.out.println("");
    }
}
