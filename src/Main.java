import java.util.Scanner;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        task1();
        task2();


    }

    public static boolean yearCheck(int yearForCheck) {
        boolean leapYear = ((yearForCheck % 4 == 0) && (yearForCheck % 100 != 0) || (yearForCheck % 400 == 0));
        return leapYear;

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
        System.out.println("Задание 1");
        Scanner client = new Scanner(System.in);
        System.out.println("Введите 0 - если у Вас Android , введите 1 - если у Вас iOS");
        int clientOS=client.nextInt();
        System.out.println("Введите год выпуска вашего телефона ");
        Scanner yearOfIssue1 = new Scanner(System.in);
        int yearOfIssue=yearOfIssue1.nextInt();
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && yearOfIssue <= currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
            if (clientOS == 1 && yearOfIssue <= currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
                System.out.println("Установите версию приложения для iOS по ссылке");}
        } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

