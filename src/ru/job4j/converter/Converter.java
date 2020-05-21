package ru.job4j.converter;

import java.util.Scanner;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static void main(String[] args) {

        System.out.println("How many rubles do you have?");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        int euro = Converter.rubleToEuro(value);
        System.out.println(value + " rubles are " + euro + " euro.");

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