package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
//        if(value == 0 || value ==1) {
//            return value;
//        }
//        int i = 1, output = 1;
//        while (output <=value){
//            i++;
//            output = i *i;
//        }
//        return i-1;
        return Math.sqrt(value);
    }

    public static Double square(Double value) {

        return value * value;
    }

    public static Double[] squareRoots(Double... value) {
        Double[] output = new Double[value.length];
        for(int i = 0; i < value.length; i++) {
            output[i] = squareRoot(value[i]);
        }
        return output;
    }

    public static Double[] squares(Double... values) {
        Double[] temp = new Double[values.length];
        for(int i = 0; i< values.length; i++) {
            temp[i] = square(values[i]);

        }

            return temp;
    }

    public static Double add(Double value1, Double value2) {

        return value1 + value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1-value2;
    }


    public static Double divide(Double divisor, Double dividend) {
        return divisor/dividend;
    }
}
