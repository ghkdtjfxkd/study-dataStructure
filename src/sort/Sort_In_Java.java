package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort_In_Java {

    public static void main(String[] args) {
//
//        List<String> fruits = new ArrayList<String>();
//        fruits.add("Pineapple");
//        fruits.add("Apple");
//        fruits.add("Orange");
//        fruits.add("Banana");
//
//        Collections.sort(fruits);
//
//        for (String name : fruits) {
//            System.out.println(name);
//        }

        Fruit[] fruits = new Fruit[4];
        fruits[0] = new Fruit("Pineapple", 70);
        fruits[1] = new Fruit("Apple", 100);
        fruits[2] = new Fruit("Orange", 80);
        fruits[3] = new Fruit("Banana", 90);

        Arrays.sort(fruits);
        for (Fruit fruit : fruits) {
            System.out.println(fruit.name);
        }

        Comparator<Fruit> nameComparator = new Comparator<Fruit>() {
            @Override
            public int compare(Fruit fruit1, Fruit fruit2) {
                return fruit1.name.compareTo(fruit2.name);
            }
        };

        Comparator<Fruit> quantityComparator = new Comparator<Fruit>() {
            @Override
            public int compare(Fruit fruit1, Fruit fruit2) {
                return fruit1.quantity - fruit2.quantity;
            }
        };

        Arrays.sort(fruits, nameComparator);
        // or
        Arrays.sort(fruits, quantityComparator);

    }
}

class Fruit implements Comparable<Fruit> {
    public String name;
    public int quantity;

    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public int compareTo(Fruit other) {
        return quantity - other.quantity;
    }

    public static Comparator<Fruit> nameComparator = new Comparator<Fruit>() {
        @Override
        public int compare(Fruit fruit1, Fruit fruit2) {
            return fruit1.name.compareTo(fruit2.name);
        }
    };

    public static Comparator<Fruit> quantityComparator = new Comparator<Fruit>() {
        @Override
        public int compare(Fruit fruit1, Fruit fruit2) {
            return fruit1.quantity - fruit2.quantity;
        }
    };
}