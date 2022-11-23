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
        int year = 2100;
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

        //Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 102;
        int oneDay = 20;
        int day = 1;
        int plusDay = 40;
        int deliveryTime = (deliveryDistance - oneDay) / plusDay ;
        //System.out.println(deliveryTime);
        if (deliveryDistance <= oneDay) {
            System.out.println("Для доставки потребуется " + day + " дней.");
        } else
            if ((deliveryDistance - oneDay) % plusDay == 0) {
                System.out.println("Для доставки потребуется " + (day +deliveryTime) + " дней.");
            } else {
                System.out.println("Для доставки потребуется " + (day +deliveryTime + 1) + " дней.");
            }

        //Задание 5
        System.out.println("Задание 5");
            int monthNumber = 6;
            switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                    System.out.println("Такого месяца не существует");
            }

        }
}