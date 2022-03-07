public class Array {
    public static void main(String args[]) {

        int[] arrayOne = new int[11];
        int[] arrayTwo = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
        double[] arrayThree = new double[11];

        arrayOne[0] = 23;
        arrayOne[1] = 5;
        arrayOne[5] = 9;
        arrayOne[8] = 23;
        arrayOne[9] = 23;

        arrayThree[2] = 23.9;
        arrayThree[3] = 5.9;
        arrayThree[4] = 23.5;
        arrayThree[9] = 9.23;
        arrayThree[10] = 9.5;

        for (int i=0; i<arrayOne.length; i++){
            System.out.print("Array ONE element :-> " + i + ": ");
            System.out.println(arrayOne[i]);
            System.out.print("Array TWO element :-> " + i + " : ");
            System.out.println(arrayTwo[i]);
            System.out.print("Array THREE element :-> " + i + " : ");
            System.out.println(arrayThree[i]);
            System.out.println(" ");
        }


    }
}
