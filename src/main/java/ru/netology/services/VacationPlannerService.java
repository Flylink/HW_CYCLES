package ru.netology.services;

public class VacationPlannerService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses; // отнимает деньги со счёта, затратами на отдых
                money /= 3; // остаток накоплений уменьшаем в три раза — траты на отдых
            } else {
                money = money + income - expenses; // Добавляем насчёт заработанные деньги и отнимает от них затраты на отдых
            }
        }
        return count;
    }

}
