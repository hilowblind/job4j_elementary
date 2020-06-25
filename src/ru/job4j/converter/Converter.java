package ru.job4j.converter;

import java.util.Scanner;

/**
 * Converter
 *
 * @author Alexey Shkirmanov
 */
public class Converter {

    /**
     * Method rubleToEuro
     * @param value Amount of rubles
     * @return Amount of euros
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * Method rubleToDollar
     * @param value Amount of rubles
     * @return Amount of dollars
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        System.out.println("How many rubles do you have?");
        Scanner scanner = new Scanner(System.in);
        /**
         * Contains amount of rubles
         */
        int value = scanner.nextInt();
        /**
         * Contains amount of euros
         */
        int euro = Converter.rubleToEuro(value);
        System.out.println(value + " rubles are " + euro + " euro.");
        /**
         * Contains amount of dollars
         */
        int dollar = Converter.rubleToDollar(value);
        System.out.println(value + " rubles are " + dollar + " dollars.");
        int in = 700;   // test
        int expectedEuro = 10;
        int outEuro = rubleToEuro(in);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("700 rubles are 10 euro. Test result : " + passedEuro);
        int expectedDollar = 11;
        int outDollar = rubleToDollar(in);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("700 rubles are 11 dollars. Test result : " + passedDollar);
    }
}