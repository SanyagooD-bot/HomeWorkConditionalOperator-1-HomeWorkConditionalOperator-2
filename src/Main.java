import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №2 Условный оператор");

        System.out.println("_____________________Задание 1_______________________");

        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("_____________________________________________________");

        System.out.println("_____________________Задание 2_______________________");

        int clientOS1 = 0;
        int clientDeviceYear  = 2010;

        if (clientOS1 == 0 && clientDeviceYear  < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear  >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear  >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("_____________________________________________________");

        System.out.println("_____________________Задание 3_______________________");

        int year1 = 2024;
        if ((year1 % 4 == 0) && (year1 % 100 != 0) || (year1 % 400 == 0)) {
            System.out.println(year1 + " год является високосным");
        }
        else {
            System.out.println(year1 + " год не является високосным");
        }
        System.out.println("_____________________________________________________");

        System.out.println("_____________________Задание 4_______________________");

        int deliveryDistance = 95;
        int day = 1;
        int day2 = 2;
        int day3 = 3;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + day2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + day3);
        }
        else {
            System.out.println("Доставки нет");
        }

        System.out.println("_____________________________________________________");

        System.out.println("_____________________Задание 5_______________________");

        int monthNumber = 12;

        switch (monthNumber) {
            case 3, 4, 5:
                System.out.println(monthNumber + "-ый месяц принадлежит к весне");
                break;
            case 6, 7, 8:
                System.out.println(monthNumber + "-ый месяц принадлежит к лету");
                break;
            case 9, 10, 11:
                System.out.println(monthNumber + "-ый месяц принадлежит к осени");
                break;
            case 12, 1, 2:
                System.out.println(monthNumber + "-ый месяц принадлежит к зиме");
                break;
            default: System.out.println("Ошибка, введите корректное цисло месяца");
        }

        System.out.println("____________________________________________________");






    }

}