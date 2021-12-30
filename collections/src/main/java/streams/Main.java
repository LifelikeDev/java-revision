package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

        public static Good goodOne = new Good(1001L, "Luggage", 34.5);
        public static Good goodTwo = new Good(1004L, "Food", 22.5);
        public static Good goodThree = new Good(1005L, "Clothing", 17.5);

    public static void main(String[] args) {

        List<Good> goods = new ArrayList<>();
        Collections.addAll(goods, goodOne, goodTwo, goodThree);

//        goods.add(goodOne);
//        goods.add(goodTwo);
//        goods.add(goodThree);

        System.out.println(goods);
        System.out.println();
        namesOfSortedLightWeightGoods(goods);
        System.out.println();
        System.out.println(getListOfSortedLightWeightGoods(goods));
        System.out.println();
        System.out.println(getMapOfSortedLightWeightGoods(goods));

    }

    private static void namesOfSortedLightWeightGoods(final List<Good> goods) {
        goods.stream()
                .filter(good -> good.getWeight() < 30)
                .sorted(Comparator.comparingDouble(Good::getWeight))
                .map(Good::getName)
                .forEach(System.out::println);
    }

    private static List<Good> getListOfSortedLightWeightGoods(final List<Good> goods) {
        return goods.stream()
                .filter(good -> good.getWeight() < 30)
                .sorted(Comparator.comparingDouble(Good::getWeight))
                .collect(Collectors.toList());
    }

    private static Map<String, List<Good>> getMapOfSortedLightWeightGoods(final List<Good> goods) {
        return goods.stream()
                .filter(good -> good.getWeight() > 20)
                .sorted(Comparator.comparingDouble(Good::getWeight))
                .collect(Collectors.groupingBy(Good::getName));
    }


}
