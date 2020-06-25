package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double ostatok = amount;
        while (ostatok > 0) {
            ostatok = ostatok + ostatok * percent * 0.01 - salary;
            year += 1;
        }
        return year;
    }
}