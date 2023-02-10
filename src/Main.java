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
        int goal = 2459000;
        int nakopleno = 0;
        int month = 0;
        while (nakopleno < goal) {
            month++;
            nakopleno += 15000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + nakopleno + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int chislo = 0;
        while (chislo < 10) {
            chislo++;
            System.out.print(" " + chislo);
        }
        System.out.println();
        for (int ch2 = 10; ch2 > 0; ch2--) {
            System.out.print(" " + ch2);

        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int y = 12_000_000;
        int year = 0;
        int rojdaemost = (y / 1000) * 17;
        int smert = (y / 1000) * 8;
        while (year < 10) {
            year++;
            y = y + rojdaemost - smert;
            rojdaemost = (y / 1000) * 17;
            smert = (y / 1000) * 8;
            System.out.println("Год " + year + " численность населения составляет " + y);


        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int total = 12_000_000;
        double vklad = 15000;
        double percent = 1.07;
        int month = 0;
        while (vklad < total) {
            vklad = vklad * percent;
            month++;
            System.out.println("Месяц " + month + " суммы накоплений " + vklad);
            if (vklad >= total) {
                System.out.println("Понадобилось " + month + " месяцев чтобы накопить сумму");


            }
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int total = 12_000_000;
        double vklad = 15000;
        double percent = 1.07;
        int month = 0;
        while (vklad < total) {
            vklad = vklad * percent;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " суммы накоплений " + vklad);
            }
            if (vklad >= total) {
                System.out.println("Понадобилось " + month + " месяцев чтобы накопить сумму");


            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double vklad = 15000;
        double percent = 1.07;
        int month = 0;
        int year = 0;
        while (year < 9) {
            vklad = vklad * percent;
            month++;
            if (month % 12 == 0) {
                year++;
            }
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " суммы накоплений " + vklad);
            }
            if (year == 9) {
                System.out.println("За " + year + " лет удалось накопить " + vklad);


            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFridayOfMonth = 5;
        int lastDayOfMonth = 31;
        for (int friday = firstFridayOfMonth; friday <= lastDayOfMonth; friday += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.%n", friday);
        }
    }


    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int last200Years = currentYear - 200;
        int next100Years = currentYear + 100;
        int cometa = 79;
        int startYear = 0;

        for (int year = startYear; year <= next100Years; year += cometa) {
            if (year >= last200Years) {
                System.out.println(year);
            }
        }
    }
}



