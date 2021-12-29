package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
    }

    private static void namesOfSortedLightWeightGoods(final List<Good> goods) {
        goods.stream()
                .filter(good -> good.getWeight() < 30)
                .sorted(Comparator.comparingDouble(Good::getWeight))
                .map(Good::getName)
                .forEach(System.out::println);
    }

}
