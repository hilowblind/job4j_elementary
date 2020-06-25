package ru.job4j.calculator;
import java.util.Scanner;

public class Fit {

    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }


    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("Write the weight:");
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();
        double man = Fit.manWeight(weight);
        System.out.println("Man " + weight + " is " + man + " kg");
        double woman = Fit.womanWeight(weight);
        System.out.println("Woman " + weight + " is " + woman + " kg");
    }
}
