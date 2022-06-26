import java.math.BigDecimal;

public class DecimalPitfall {
    double firstError = 0.1;
    double secondError = 0.2;

    BigDecimal firstCorrect = new BigDecimal("0.1");
    BigDecimal secondCorrect = new BigDecimal("0.2");

    void compute(){
        System.out.println(firstError + secondError);
        System.out.println(firstCorrect.add(secondCorrect));
    }

    public static void main(String[] args) {
        DecimalPitfall dp = new DecimalPitfall();
        dp.compute();
    }
}