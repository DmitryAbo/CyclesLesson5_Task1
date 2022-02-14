package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 180;

        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAvg() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 15;

        int actual = service.calculateAvg(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSale() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 20;

        int actual = service.calculateMaxSale(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSale() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 7;

        int actual = service.calculateMinSale(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinAvgSaleMonth() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;

        int actual = service.calculateMinAvgSaleMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldcalculateMaxAvgSaleMonth() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;

        int actual = service.calculateMinAvgSaleMonth(sales);

        assertEquals(expected, actual);
    }
}