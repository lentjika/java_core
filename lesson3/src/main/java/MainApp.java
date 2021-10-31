import Fruits.Apple;
import Fruits.Box;
import Fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        ExecuteExtensions.ExecuteAndCatch(() -> {
            String[] array = {"a", "b", "c", "d"};
            ArrayExtensions.Swap(array, 1, 3);
            System.out.println(ArrayExtensions.createListFromArray(array));
        });

        ExecuteExtensions.ExecuteAndCatch(() -> {
            String[] array = {"a", "b", "c", "d"};
            ArrayExtensions.Swap(array, 1, 4);
            System.out.println(ArrayExtensions.createListFromArray(array));
        });

        ExecuteExtensions.ExecuteAndCatch(() -> {
            String[] array = {"a", "b", "c", "d"};
            ArrayExtensions.Swap(array, 4, 2);
            System.out.println(ArrayExtensions.createListFromArray(array));
        });

        ExecuteExtensions.ExecuteAndCatch(() -> {
            Integer[] array = {1, 2, 3, 4, 5, 6, 7};
            ArrayExtensions.Swap(array, 4, 2);
            System.out.println(ArrayExtensions.createListFromArray(array));
        });

        //fruit box
        ExecuteExtensions.ExecuteAndCatch(() -> {
            Box<Apple> appleBox = new Box<Apple>();
            appleBox.addFruit(new Apple());
            appleBox.addFruit(new Apple());
            appleBox.addFruit(new Apple());
            System.out.println(String.format("Первоначальный размер коробки %d", appleBox.size()));
            var specialApple = new Apple();
            appleBox.addFruit(specialApple);
            appleBox.addFruit(specialApple);

        });

        ExecuteExtensions.ExecuteAndCatch(() -> {
            Box<Apple> appleBox = new Box<Apple>();
            appleBox.addFruit(new Apple());
            appleBox.addFruit(new Apple());
            appleBox.addFruit(new Apple());
            System.out.println(String.format("Вес коробки %f", appleBox.getWeight()));
        });

        ExecuteExtensions.ExecuteAndCatch(() -> {
            Box<Apple> appleBox = new Box<Apple>();
            appleBox.addFruit(new Apple());
            appleBox.addFruit(new Apple());
            appleBox.addFruit(new Apple());
            System.out.println(String.format("Вес коробки %f", appleBox.getWeight()));
            Box<Orange> orangeBox = new Box<>();
            orangeBox.addFruit(new Orange());
            orangeBox.addFruit(new Orange());
            System.out.println(String.format("Вес коробки %f", orangeBox.getWeight()));
            var isEqual = appleBox.compare(orangeBox);
            System.out.println(String.format("Коробки равны? Ответ %b", isEqual));
        });

        ExecuteExtensions.ExecuteAndCatch(() -> {
            Box<Apple> appleBox = new Box<Apple>();
            appleBox.addFruit(new Apple());
            appleBox.addFruit(new Apple());
            appleBox.addFruit(new Apple());

            Box<Apple> appleBox2 = new Box<Apple>();
            appleBox2.addFruit(new Apple());
            appleBox2.addFruit(new Apple());

            Apple special = new Apple();
            appleBox.addFruit(special);
            appleBox2.addFruit(special);

            System.out.println(String.format("Первоначальный размер коробки %d", appleBox.size()));

            appleBox.moveFromAnotherBox(appleBox2);

            System.out.println(String.format("Конечный размер коробки %d", appleBox.size()));
            System.out.println(String.format("Конечный размер коробки2 %d", appleBox2.size()));

        });
    }
}
