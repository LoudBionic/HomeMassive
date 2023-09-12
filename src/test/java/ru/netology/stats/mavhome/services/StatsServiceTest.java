package ru.netology.stats.mavhome.services;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class StatsServiceTest {
    @Test

    public void shouldFindAllSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        int actual = service.amount(sales);

        Assertions.assertEquals(expected, actual);

    }

}