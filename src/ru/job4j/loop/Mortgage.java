package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double ostatok = amount;
        while (true) {
            ostatok = ostatok + ostatok * percent * 0.01 - salary;
            year += 1;
            if (ostatok <= 0) {
                break;
            }
        }
        return year;
    }
}