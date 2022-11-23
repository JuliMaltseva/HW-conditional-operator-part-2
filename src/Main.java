public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        byte clientOS = 1;
        //(0 — iOS, 1 — Android)
        //для iOS так:«Установите версию приложения для iOS по ссылке».
        //для Android так: «Установите версию приложения для Android по ссылке».
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        //Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else
            if (clientOS != 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

        //Задание 3
        System.out.println("Задание 3");
        int year = 2000;
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else
            if (year % 100 == 0) {
                System.out.println(year + " год не является високосным");
        } else
            if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }
}