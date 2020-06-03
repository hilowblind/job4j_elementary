package ru.job4j.array;

public class Defragment {

    public static String[] swap(String[] array, int source, int dest) {
        String temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    public static String[] compress(String[] array) {
        for (int indexNull = 0; indexNull < array.length; indexNull++) {
            if (array[indexNull] == null) {
                for (int indexNotNull = indexNull; indexNotNull < array.length; indexNotNull++) {
                    if (array[indexNotNull] != null) {
                        array = Defragment.swap(array, indexNull, indexNotNull);
                        break;
                    }
                }
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