package ru.job4j.condition;
import java.util.Scanner;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double perimeter = a + b + c;
        double rsl = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        return rsl;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print a");
        double a = scanner.nextInt();
        System.out.println("print b");
        double b = scanner.nextInt();
        System.out.println("print c");
        double c = scanner.nextInt();


        double rsl = TrgArea.area(a, b, c);
        System.out.println("area = " + rsl);
    }
}
