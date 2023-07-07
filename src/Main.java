public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int contribution = 15000;
        int savings = 0;
        int i = 0;
        while (savings <= 2459000) {
            i++;
            savings = savings + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12000000;
        int birthRatePer1000 = 17;
        int mortalityPer1000 = 8;
        for (int i = 1; i < 11; i++) {
            int birthRateCountry = birthRatePer1000 * population / 1000;
            int mortalityRateCountry = mortalityPer1000 * population / 1000;
            population = population + birthRateCountry - mortalityRateCountry;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int contribution = 15000;
        System.out.println("Месяц 1, сумма накоплений " + contribution);
        int monthPercent = 7;
        int i = 1;
        while (contribution <= 12000000) {
            i++;
            contribution = contribution + contribution * monthPercent / 100;
            System.out.println("Месяц " + i + ", сумма накоплений " + contribution);
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int contribution = 15000;
        int monthPercent = 7;
        int i = 1;
        while (contribution <= 12000000) {
            i++;
            contribution = contribution + contribution * monthPercent / 100;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений " + contribution);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int contribution = 15000;
        int monthPercent = 7;
        for (int i = 1; i <= 9 * 12; i++) {
            i++;
            contribution = contribution + contribution * monthPercent / 100;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений " + contribution);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int dateMonth = 1;
        while (dateMonth < 32) {
            dateMonth++;
            if (dateMonth % 7 == 0) {
                System.out.println("Сегодня пятница, " + dateMonth + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int cometPeriod = 79;
        int currentYear = 2023;
        int yearsAgo200 = currentYear - 200;
        int yearsAhead100 = currentYear + 100;
        for (int years = yearsAgo200; years <= yearsAhead100; years++) {
            if (years % cometPeriod == 0) {
                System.out.println(years);
            }
        }
    }
}


