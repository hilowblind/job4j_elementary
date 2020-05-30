package ru.job4j.array;

public class Defragment {

    public static String[] swap(String[] array, int source, int dest) {
        String temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    public static String[] compress(String[] array) {
        int indexNull = 0;  //
        for (int indexNotNull = 0; indexNotNull < array.length; indexNotNull++) {
            if (array[indexNotNull] != null) {
                if (indexNotNull != indexNull) {
                    array = Defragment.swap(array, indexNull, indexNotNull);  // replace null and not null
                }
                indexNull++;  //
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}