package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] newInt = new int[5];
        for (int i = 0; i < newInt.length; i++) {
            newInt[i] = i * 2 + 3;
        }
        for (int i = 0; i < newInt.length; i++) {
            System.out.println(newInt[i]);
        }
    }
}
