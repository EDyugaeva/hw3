package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        byte clientOS = 1; //1 - Android, 0 - iOS
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Ошибка");
    }

    public static void task2() {
        byte clientOS; //1 - Android, 0 - iOS
        clientOS = 0;
        boolean apple = clientOS == 0;
        boolean android = clientOS == 1;
        short clientDeviceYear = 2014;
        if (android && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else if (android && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (apple && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    }

    public static void task3() {
        short year = 2024;
        byte temp1 = (byte) (year % 4);
        byte temp2 = (byte) (year % 100);
        byte temp3 = (byte) (year % 400);
        if (temp3 == 0) {
            System.out.println("Год  является високосным");
        } else if (temp1 == 0 && temp2 != 0) {
            System.out.println("Год  является високосным");
        } else System.out.println("Год не является високосным");
    }

    public static void task4() {
        short deliveryDistance = 95;
        short deliveryDay;
        if (deliveryDistance <= 20) {
            deliveryDay = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDay = 2;
        } else deliveryDay = 3;
        System.out.println("Потребуется дней: " + deliveryDay);
    }

    public static void task5() {
        byte monthNumber = 6;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка! Нет такого месяца");
        }
    }
}
