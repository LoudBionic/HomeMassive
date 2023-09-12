import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.stats.mavhome.services.StatsService;

public class StatsServiceTest {

    @Test

    public void shouldFindAllSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.amount(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldFindSumSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180 / 12;
        int actual = service.medium(sales);


        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindMonthsWithMaximumSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldFindMonthsWithMinimumSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);


    }

    @Test

    public void shouldFindBelowAverage() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        int actualMonth = service.below(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);


    }

    @Test

    public void shouldFindHigherAverage() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        int actualMonth = service.higher(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);


    }

}