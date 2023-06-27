// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        task1();
        task1_2();
    }

    static void task1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
            count += i;
        }
    System.out.println("Сумма чисел равна: " + count);
    }
        static void task1_2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int count = 1;
        for(int i = 1; i <= n; i++){
            count *= i;
        }
    System.out.println(count);
    }
}
