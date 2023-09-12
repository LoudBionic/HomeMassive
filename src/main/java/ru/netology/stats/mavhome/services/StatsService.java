package ru.netology.stats.mavhome.services;
public class StatsService {


    public int amount(int[] sales) {

        int AllSales = 0;
        for (int sale : sales) {
            AllSales += sale;

        }
        return AllSales;
    }

    public int medium(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        int mediumsum = sum / 12;
        return mediumsum;
    }


    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1

    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее


        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int below(int[] sales) {
        int counter = 0;
        int averagesale = medium(sales);
        for (int sale : sales) {
            if (sale < averagesale) {
                counter++;
            }

        }
        return counter;
    }

    public int higher(int[] sales) {
        int counter = 0;
        int averagesale = medium(sales);
        for (int sale : sales) {
            if (sale > averagesale) {
                counter++;
            }

        }
        return counter;
    }

}
