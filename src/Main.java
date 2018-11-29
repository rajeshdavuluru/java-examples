import javafx.util.converter.BigIntegerStringConverter;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        BigInteger bigInteger1 = new BigInteger("37107287533902102798797998220837590246510135740250");

        BigInteger bigInteger2 = new BigInteger("46376937677490009712648124896970078050417018260538");

        BigInteger bigInteger3 = new BigInteger("10000000000000000000000000000000000000000");

        System.out.println(bigInteger1.divide(bigInteger3));
       // BigIntegerStringConverter bigIntegerStringConverter = new BigIntegerStringConverter();
       // bigIntegerStringConverter.fromString("37107287533902102798797998220837590246510135740250");
      //  Optional.of(payloadMap).map()


        Long l = 32768l;
        BigInteger bigInteger4 = new BigInteger("1");
        BigInteger bigInteger5 = new BigInteger("32768");

        for (int i = 0; i < 66; i++) {
            bigInteger4 = bigInteger4.multiply(bigInteger5);
        }
        bigInteger4 = bigInteger4.multiply(new BigInteger("1024"));
        System.out.println(bigInteger4);
        System.out.println(bigInteger4.remainder(new BigInteger("10")));
        BigInteger bigInteger6 = new BigInteger("0");
        while(bigInteger4.divide(new BigInteger("10")).doubleValue() >0){
            System.out.println(bigInteger4);
            bigInteger6 = bigInteger6.add(bigInteger4.remainder(new BigInteger("10")));
            bigInteger4 = bigInteger4.divide(new BigInteger("10"));
        }
        System.out.println(bigInteger6.add(bigInteger4));
        //BigIntegerStringConverter bigIntegerStringConverter = new BigIntegerStringConverter();
        // bigIntegerStringConverter.fromString("37107287533902102798797998220837590246510135740250");


    }
}
