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
    }
}