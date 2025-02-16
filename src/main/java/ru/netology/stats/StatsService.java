package ru.netology.stats;

public class StatsService {

    public long sumOfSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSumOfSales(long[] sales) {
        long sum = 0;
        long averageSum = 0;
        for (long sale : sales) {
            sum += sale;
            averageSum = (sum / sales.length);
        }
        return averageSum;
    }

    public int numMonthOfMaxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int numMonthOfMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countMonthOfSalesBelowAverage(long[] sales) {
        int count = 0;
        long averageSum = averageSumOfSales(sales);
        for (long sale : sales) {
            if (sale > averageSum) {
                count++;
            }
        }
        return count;
    }

    public int countMonthOfSalesAboveAverage(long[] sales) {
        int count = 0;
        long averageSum = averageSumOfSales(sales);
        for (long sale : sales) {
            if (sale < averageSum) {
                count++;
            }
        }
        return count;
    }
}