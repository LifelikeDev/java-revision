package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Good> goods = new ArrayList<>();

        Good goodOne = new Good(1001L, "Luggage", 34.5);
        Good goodTwo = new Good(1004L, "Food", 22.5);
        Good goodThree = new Good(1005L, "Clothing", 17.5);

        goods.add(goodOne);
        goods.add(goodTwo);
        goods.add(goodThree);

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
