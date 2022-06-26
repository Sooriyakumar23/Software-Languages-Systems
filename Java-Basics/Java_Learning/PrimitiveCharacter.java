public class PrimitiveCharacter {
    int intInt = 65;
    int intHex = 0x0041;
    int intBin = 0b0100_0001;
    int intChar = 'A';

    float floatFloat = 65.1f;
    double doubleDouble = 65.1d;

    char charInt = 65;
    char charHex = 0x0041;
    char charBin = 0b0100_0001;
    char charChar = 'A';
    char charUnicode = '\u0041';

    void calculate(){
        System.out.println(intInt);
        System.out.println(intHex);
        System.out.println(intBin);
        System.out.println(intChar);
        
        System.out.println(floatFloat);
        System.out.println(doubleDouble);
        
        System.out.println(charInt);
        System.out.println(charHex);
        System.out.println(charBin);
        System.out.println(charChar);
        System.out.println(charUnicode);
    }

    public static void main(String[] args) {
        PrimitiveCharacter pc = new PrimitiveCharacter();
        pc.calculate();
        
    }

}