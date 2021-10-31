package Fruits;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> innerList = new ArrayList<>();
    private float fruitWeight;

    T createContents(Class<T> clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return clazz.getDeclaredConstructor().newInstance();
    }

    public float getWeight() {
        if (innerList.isEmpty())
            return 0;
        return innerList.get(0).getWeight() * innerList.size();
    }

    public boolean compare(Box<? extends Fruit> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.00001;
    }

    public void addFruit(T fruit) {
        if (fruit == null) {
            throw new NullPointerException("fruit");
        }
        if (innerList.contains(fruit)) {
            throw new IllegalArgumentException("fruit уже добавлен в корзину");
        }
        innerList.add(fruit);
    }

    public void removeFromBox(T fruit) {
        if (fruit == null) {
            throw new NullPointerException("fruit");
        }
        if (!innerList.contains(fruit)) {
            throw new IllegalArgumentException("fruit не добавлен в корзину");
        }
        innerList.remove(fruit);
    }

    public boolean isItemExistsInBox(T fruit) {
        if (fruit == null) {
            throw new NullPointerException("fruit");
        }
        return innerList.contains(fruit);
    }

    public void moveFromAnotherBox(Box<T> anotherBox) {
        if (anotherBox == null) {
            throw new NullPointerException("anotherBox");
        }
        var iterator = anotherBox.innerList.iterator();
        while (iterator.hasNext()) {
            T elem = iterator.next();
            if (!this.isItemExistsInBox(elem)) {
                this.addFruit(elem);
            }
            iterator.remove();
        }
        /*
        for (var fruit : anotherBox.innerList) {
            if (!this.isItemExistsInBox(fruit)) {
                this.addFruit(fruit);
            }
            anotherBox.removeFromBox(fruit);
        }
         */
    }

    public int size() {
        return innerList.size();
    }
}
