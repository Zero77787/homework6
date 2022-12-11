import java.util.Scanner;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static boolean yearCheck(int yearForCheck) {
        boolean leapYear = ((yearForCheck % 4 == 0) && (yearForCheck % 100 != 0) || (yearForCheck % 400 == 0));
        return leapYear;

    }

    public static void clientOSAndYearOfIssue(int clientOS, int yearOfIssue) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1 && yearOfIssue <= currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && yearOfIssue <= currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
    }

    public static void amountOfDeliveryDays(int deliveryDistance){
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }

}

    public static void task1() {
        System.out.println("Задание 1");
        Scanner year = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year1 = year.nextInt();
        boolean leapYear = yearCheck(year1);
        if (leapYear) {
            System.out.println(year1 + " год является високосным");
        } else {
            System.out.println(year1 + " год не является високосным");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        Scanner client = new Scanner(System.in);
        System.out.println("Введите 0 - если у Вас Android , введите 1 - если у Вас iOS");
        int clientOS = client.nextInt();
        Scanner yearOfIssue1 = new Scanner(System.in);
        System.out.println("Введите год выпуска вашего телефона ");
        int yearOfIssue = yearOfIssue1.nextInt();
        clientOSAndYearOfIssue(clientOS, yearOfIssue);
    }

    public static void task3() {
        System.out.println("Задание 3");
        Scanner deliveryDistance1 = new Scanner(System.in);
        System.out.println("Введите сколько киилометро занимает расстояние до Вас: ");
        int deliveryDistance= deliveryDistance1.nextInt();
        amountOfDeliveryDays(deliveryDistance);
        }
    }


