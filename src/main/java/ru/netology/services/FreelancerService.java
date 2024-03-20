package ru.netology.services;
public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; // количество денег на счету
        int counter = 0; // счётчик месяцев отдыха

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) { // отдых
                money = money - expenses;
                money = money / 3;
                counter++; // увеличиваем счётчик месяцев отдыха
            } else {
            // работа
                money = money + income;
                money = money - expenses;
            }

        }
        return counter;

    }
}
