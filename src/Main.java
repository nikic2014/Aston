import java.util.Scanner;

public class Main {
    public static void task1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        }
        else if (a < b) {
            System.out.println("a < b");
        }
        else {
            System.out.println("a = b");
        }

        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));

        if (b != 0) {
            System.out.println("Деление: " + ((double) a / b));
        } else {
            System.out.println("Деление на ноль невозможно");
        }

    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String a = scanner.next();

        System.out.println("Введите вторую строку:");
        String b = scanner.next();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        scanner.close();
    }
    public static void task3() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Чётные числа:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
}