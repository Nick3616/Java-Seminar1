// 3) Реализовать простой калькулятор

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        work_calculator();
    }

    static int menu(){
        System.out.println("Выберите операцию: \n1. Сложение(+) \n2. Вычетание(-) \n3. Умножение(*) \n4. Деление(/) \n5. Выйти ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
    static void work_calculator(){
        int choice = menu();
        while (choice != 5) {
            if (choice == 1){
                addition();
            }
            else if (choice == 2){
                subtraction();
            }
            else if (choice == 3){
                multiplication();
            }
            else if (choice == 4){
                division();
            }
            else{
                System.out.println("Вы ошиблись! Введите коректное значение.");
            }
            choice = menu();
        }
    }
    static int enter1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите перве число: ");
        int num1 = scanner.nextInt();
        return num1;
    }

    static int enter2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        return num2;
    }
    static void addition(){
        int num1 = enter1();
        int num2 = enter2();
        System.out.println("Результат: " + (num1 + num2));
    }
    static void subtraction(){
        int num1 = enter1();
        int num2 = enter2();
        System.out.println("Результат: " + (num1 - num2));
    }
    static void multiplication(){
        int num1 = enter1();
        int num2 = enter2();
        System.out.println("Результат: " + num1 * num2);
    }
    static void division(){
        int num1 = enter1();
        int num2 = enter2();
        System.out.println("Результат: " + num1 / num2);
    }

}
