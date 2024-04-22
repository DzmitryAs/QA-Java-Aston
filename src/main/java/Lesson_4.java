import java.util.Arrays;

public class Lesson_4 {
    public static void main(String[] args) {
        printThreeWords("");
        checkSumSign(10, -15);
        printColor(100);
        compareNumbers(5, 7);
        checkSum(2, 1);
        checkNumber(2);
        checkMethod(5);
        printLine("Hello", 3);
        checkYear(803);
        arrayChange();
        fillArray();
        arrayMultiplicative();
        arrayDiagonal();
        lenArr(3, 8);
    }

    /*
    1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
     */
    public static void printThreeWords(String s) {
        System.out.println("1. printThreeWords()");
        System.out.println("Orange\nBanana\nApple " + s);
        System.out.println();
    }

    /*
    2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
    значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
    то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная"
     */
    public static void checkSumSign(int a, int b) {
        System.out.println("2. checkSumSign()");
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println();
    }

    /*
    3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
    Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах
    от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый"
     */
    public static void printColor(int value) {
        System.out.println("3. printColor()");
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
        System.out.println();
    }

    /*
    4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
    значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
    в противном случае “a < b"
     */
    public static void compareNumbers(int a, int b) {
        System.out.println("4. compareNumbers()");
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
        System.out.println();
    }

    /*
    5. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до
    20(включительно), если да – вернуть true, в противном случае – false.
     */
    public static void checkSum(int a, int b) {
        boolean checkSum = ((a + b) > 10 && (a + b) <= 20);
        System.out.println("5. checkSum()");
        System.out.println(checkSum);
        System.out.println();
    }

    /*
    6. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
    положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом.
     */
    public static void checkNumber(int c) {
        System.out.println("6. checkNumber()");
        if (c < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
        System.out.println();
    }

    /*
    7. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
    отрицательное, и вернуть false если положительное.
     */
    public static void checkMethod(int d) {
        boolean checkMethod = (d < 0);
        System.out.println("7. checkMethod()");
        System.out.println(checkMethod);
        System.out.println();
    }

    /*
    8. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
    указанную строку, указанное количество раз.
     */
    public static void printLine(String s, int g) {
        System.out.println("8. printLine()");
        for (int i = 1; i <= g; i++)
            System.out.println(s + " ");
        System.out.println();
    }

    /*
    9. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не
    високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static void checkYear(int h) {
        boolean checkYear = (h % 400 == 0) || (h % 4 == 0 && h % 100 != 0);
        System.out.println("9. checkYear()");
        System.out.println(checkYear);
        System.out.println();
    }

    /*
    10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0.
     */
    public static void arrayChange() {
        System.out.println("10. arrayChange()");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /*
    11. Задать пустой целочисленный массив длиной 100.С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100.
     */
    public static void fillArray() {
        System.out.println();
        System.out.println("11. fillArray()");
        int[] arr100 = new int[100];
        for (int i = 0; i < arr100.length; i++) {
            arr100[i] = i + 1;
            System.out.print(arr100[i] + " ");
        }
        System.out.println();
    }

    /*
    12. Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] пройти по нему циклом, и числа меньше 6 умножить на 2.
     */
    public static void arrayMultiplicative() {
        System.out.println();
        System.out.println("12. arrayMultiplicative()");
        int[] arrMultiplicative = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int j = 0; j < arrMultiplicative.length; j++) {
            if (arrMultiplicative[j] < 6) {
                arrMultiplicative[j] = arrMultiplicative[j] * 2;
            }
            System.out.print(arrMultiplicative[j] + " ");
        }
        System.out.println();
    }

    /*
    13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
    заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы
    одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n]][n].
     */
    public static void arrayDiagonal() {
        System.out.println();
        System.out.println("13. arrayDiagonal()");
        int[][] arrDiagonal = new int[5][5];
        for (int i = 0; i < arrDiagonal.length; i++) {
            arrDiagonal[i][i] = 1;
            arrDiagonal[i][arrDiagonal.length - i - 1] = 1;
        }
        for (int[] ints : arrDiagonal) {
            for (int j = 0; j < arrDiagonal.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    /*
    14. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
    длиной len, каждая ячейка которая равна initialValue.
     */
    public static void lenArr(int len, int initialValue) {
        int[] lenArr = new int[len];
        Arrays.fill(lenArr, initialValue);
        System.out.println();
        System.out.println("14. lenArr()");
        System.out.println(Arrays.toString(lenArr));
    }
}

