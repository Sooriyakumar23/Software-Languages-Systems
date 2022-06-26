public class NumberPrimitive {
    byte numByte = -128;
    byte numByte2 = 127;
    short numShort = 1000;
    int numInt = 123_456;
    int numIntHex = 0x0041;
    int numIntBin = 0b01000001;
    long numLong = 1_234_567_890L;
    boolean boolTrue = true;

    void printNumbers(){
        System.out.println(numByte);
        System.out.println(numByte2);

        System.out.println(numShort);

        System.out.println(numInt);
        System.out.println(numIntHex);
        System.out.println(numIntBin);
        System.out.println("\nMinimum value of Integer primitive data type: " + Integer.MIN_VALUE);
        System.out.println("Maximum value of Integer primitive data type: " + Integer.MAX_VALUE + "\n");

        System.out.println(numLong);

        System.out.println(boolTrue);
    }

    public static void main(String[] args){
        NumberPrimitive pn = new NumberPrimitive();
        pn.printNumbers();
    }
}
