package streams;

import java.util.*;

public class CodewarsTrial {

//    public static int[] minMax(int[] arr) {
//        // Your awesome code here
//        int max = Arrays.stream(arr).max().getAsInt();
//        int min = Arrays.stream(arr).min().getAsInt();
//
//        return new int[]{max, min};
//    }

    public static void main(String[] args) {
//        System.out.println(well(new String[] {"good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
        System.out.println(well(new String[] {"bad", "bad", "bad"}));
    }


    public static String well(String[] x) {
        int numberOfGoods = 0;
        // TODO

        for(String s: x) {
            if (s.equals("good")) {
                numberOfGoods++;
            }
        }

        System.out.println(numberOfGoods);
        return numberOfGoods > 2 ? "I can smell a series" : numberOfGoods <= 2 && numberOfGoods > 0 ? "Publish" : "Fail";

    }

}
