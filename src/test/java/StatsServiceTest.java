import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.stats.mavhome.services.StatsService;

public class StatsServiceTest {


    @Test

    public void shouldFindMonthsWithMaximumSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test

    public void shouldFindMonthsWithMinimumSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);


    }

}