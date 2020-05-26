package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        /**
         * Contains names and surnames
         */
        String[] names = new String[4];
        names[0] = "Alexey Shkirmanov";
        names[1] = "Ïvan Ivanov";
        names[2] = "Petr Petrov";
        names[3] = "Roman Romanov";
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}
