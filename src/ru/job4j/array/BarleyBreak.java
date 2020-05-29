package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] table = new int[3][3];
        int numbers = 1;  // numbers for filling
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = numbers;
                numbers++;
                System.out.println(table[i][j]);
            }
        }
    }
}
