package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;                //Начальное значение суммы
        for (int sale : sales) {    //Перебор по всем эелементам входного массива продаж
            sum += sale;            //Прибавляем значение суммы продажи
        }

        return sum;
    }

    public int calculateAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int calculateMaxSale(int[] sales) {
        int currentSaleMax = sales[0];
        for (int sale : sales) {
            if (sale > currentSaleMax) {
                currentSaleMax = sale;
            }
        }
        return currentSaleMax;
    }

    public int calculateMinSale(int[] sales) {
        int currentSaleMin = sales[0];
        for (int sale : sales) {
            if (sale < currentSaleMin) {
                currentSaleMin = sale;
            }
        }
        return currentSaleMin;
    }

    public int calculateMinAvgSaleMonth(int[] sales) {
        int avgSale = calculateAvg(sales);  //Определяем значение средней продажи за месяц
        int numMonth = 0;                   //Кол-во месяцев в которых продажи были ниже среднемесяцного значения
        for (int sale : sales) {
            if (sale < avgSale) {
                numMonth++;
            }
        }
        return numMonth;
    }

    public int calculateMaxAvgSaleMonth(int[] sales) {
        int avgSale = calculateAvg(sales);  //Определяем значение средней продажи за месяц
        int numMonth = 0;                   //Кол-во месяцев в которых продажи были ниже среднемесяцного значения
        for (int sale : sales) {
            if (sale > avgSale) {
                numMonth++;
            }
        }
        return numMonth;
    }

}

