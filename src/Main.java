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
        task9();
        task10();

    }

    public static void task1() {
        System.out.println("Задача 1");
        float salary = 15000f;
        float savings = 0f;
        float percentages = 0f;
        int i = 0;
        while (savings <= 2459000) {
            i = i + 1;
            percentages = savings / 100;
            savings = savings + salary + percentages;
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

    }

    public static void task4() {
        System.out.println("Задача 4");

    }

    public static void task5() {
        System.out.println("Задача 5");

    }

    public static void task6() {
        System.out.println("Задача 6");

    }

    public static void task7() {
        System.out.println("Задача 7");

    }

    public static void task8() {
        System.out.println("Задача 8");

    }

    public static void task9() {
        System.out.println("Задача 9");

    }

    public static void task10() {
        //int a =
        System.out.println("Задача 10");

    }

}

