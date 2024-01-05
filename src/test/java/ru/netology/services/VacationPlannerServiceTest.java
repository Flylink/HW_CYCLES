package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class VacationPlannerServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Savings.csv")
    public void shouldCalculateVacationMonths(int income, int expenses, int threshold, int expected) {
        VacationPlannerService service = new VacationPlannerService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}