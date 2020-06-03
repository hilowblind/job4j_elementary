package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;   // counter for left array
        int j = 0;   // counter for right array
        while (i + j < rsl.length) {
            if (i == left.length) {
                rsl[i + j] = right[j];       // if array left finished
                j++;                         // add from array right
            } else if (j == right.length) {  // if array right finished
                rsl[i + j] = left[i];        // add from array left
                i++;
            } else if (left[i] < right[j]) {
                rsl[i + j] = left[i];
                i++;
            } else if (right[j] <= left[i]) {
                rsl[i + j] = right[j];
                j++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}