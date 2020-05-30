package ru.job4j.array;

public class Defragment {

    public static String[] swap(String[] array, int source, int dest) {
        String temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    public static String[] compress(String[] array) {
        int pointNull = 0;
        int pointNotNull = 0;  // starting search NotNull in the array
        for (int index = pointNull; index < array.length; index++) {
            if (array[index] == null) {      //  Starting search Null in the array
                for (int j = pointNotNull; j < array.length; j++) {   /* переместить первую не null ячейку. Нужен цикл. */
                    if (array[j] != null) {
                        Defragment.swap(array, pointNull, pointNotNull);  //  change null and not null in the massive
                        pointNotNull = j + 1;   // next loop will start from here
                        break;
                    }
                }
                System.out.print(array[index] + " ");
                pointNull = index + 1;   /* указатель на null ячейку + 1  */
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}