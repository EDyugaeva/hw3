package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
        task7();
    }

    public static void task1() {
        byte clientOS = 1; //1 - Android, 0 - iOS
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Ошибка");
        }
    }

    public static void task2() {
        byte clientOS; //1 - Android, 0 - iOS
        clientOS = 1;
//        boolean apple = clientOS == 0;
//        boolean android = clientOS == 1;
        short clientDeviceYear = 2014;
//        if (android && clientDeviceYear >= 2015) {
//            System.out.println("Установите версию приложения для Android по ссылке ");
//        } else if (android && clientDeviceYear < 2015) {
//            System.out.println("Установите облегченную версию приложения для Android по ссылке");
//        } else if (apple && clientDeviceYear >= 2015) {
//            System.out.println("Установите версию приложения для iOS по ссылке");
//        } else {
//            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
//        }
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке ");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }


    public static void task3() {
        short year = 100;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год  является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    public static void task4() {
        short deliveryDistance = 95;
        short deliveryDay;
        if (deliveryDistance <= 20) {
            deliveryDay = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDay = 2;
        } else {
            deliveryDay = 3;
            System.out.println("Потребуется дней: " + deliveryDay);
        }
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

    public static void task6() {
        int age = 18;
        int salary = 1_000_000;
        int limit;
        int limitAge;
        int limitSalary;
        if (age >= 23) {
            limitAge = 3 * salary;
        } else {
            limitAge = 2 * salary;
        } // Определение лимита по возрасту+
        if (salary >= 50_000) {
            limitSalary = (int) (1.2 * salary);
        } else if (salary >= 80_000) {
            limitSalary = (int) (1.5 * salary);
        } else {
            limitSalary = salary;
        } // определение лимита по зарплате
        if (limitSalary > limitAge) {
            limit = limitSalary;
        } else limit = limitAge; //сравнение
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit);
    }

    public static void task7() {
        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;
        int maxPayment = salary / 2;
        float rate = 10f;
        if (age < 23) {
            rate = rate + 1f;
        } else if (age < 30) {
            rate = rate + 0.5f;
        }
        if (salary >= 80000) {
            rate = rate - 0.7f;
        }
        float payment = (wantedSum * rate / 100 + wantedSum) / 12;
        System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж по кредиту " + payment + " рублей.");
        if (payment <= maxPayment) {
            System.out.println("Одобрено");
        } else {
            System.out.println("Отказано");
        }
    }
}
