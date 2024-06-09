package Lesson_13_ArrayOfWords;
/*
Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово. (реализовать с
использованием коллекций)
 */

import java.util.*;

public class ArrayOfWords {
    public static void main(String[] args) {
        List<String> modelCar = Arrays.asList(
                "Mercedes", "BMW", "Audi", "Toyota", "Reno",
                "Opel", "Subaru", "Range Rover", "Toyota", "Reno",
                "BMW", "Audi", "Toyota", "Lada", "Subaru",
                "Audi", "Toyota", "Subaru", "Subaru", "Lada"
        );

        Set<String> unique = new HashSet<>(modelCar);

        System.out.println("Initial array :");
        System.out.println(modelCar);
        System.out.println();
        System.out.println("Unique words :");
        System.out.println(unique);
        System.out.println();
        System.out.println("The words are repeated :");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(modelCar, key));
        }
    }
}
