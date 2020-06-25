package ru.job4j.condition;
import java.util.Scanner;

public class SqArea {
    public static double square(int p, int k) {
        int h = p / (2 * (k + 1));  //finding height
        int l = h * k;  // finding length
        double s = l * h;  // finding square
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print perimeter");
        int p = scanner.nextInt();
        System.out.println("print k");
        int k = scanner.nextInt();
        double result1 = SqArea.square(p, k);
        System.out.println("Square = " + result1);
    }
}