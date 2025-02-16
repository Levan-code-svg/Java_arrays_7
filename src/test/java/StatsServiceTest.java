import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    public void shouldCalcSumOfSales() {
        long actual = service.sumOfSales(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAverageSumOfSales() {
        long actual = service.averageSumOfSales(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNumMonthOfMaxSales() {
        int actual = service.numMonthOfMaxSales(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNumMonthOfMinSales() {
        int actual = service.numMonthOfMinSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCountMonthOfSalesBelowAverage() {
        int actual = service.countMonthOfSalesBelowAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCountMonthOfSalesAboveAverage() {
        int actual = service.countMonthOfSalesAboveAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}