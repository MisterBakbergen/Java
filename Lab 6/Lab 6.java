Задание 1
import java.util.Scanner;

public class RectangleArea {

    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ширину: ");
        double width = scanner.nextDouble();

        System.out.print("Введите высоту: ");
        double height = scanner.nextDouble();

        double area = rectangleArea(width, height);

        System.out.println("Площадь прямоугольника: " + area);

        scanner.close();
    }
}


Задание 2
        import java.util.Scanner;

public class EvenCheck {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println("Число чётное.");
        } else {
            System.out.println("Число нечётное.");
        }

        scanner.close();
    }
}


Задание 3
public class MaxExample {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {

        System.out.println("Максимум (int): " + max(10, 25));
        System.out.println("Максимум (double): " + max(5.7, 9.3));
    }
}


Задание 4
        import java.util.Scanner;

public class FactorialExample {

    public static long factorial(int n) {

        if (n < 0) {
            System.out.println("Факториал отрицательного числа не определён.");
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        long result = factorial(number);

        if (result != -1) {
            System.out.println("Факториал: " + result);
        }

        scanner.close();
    }
}


Задание 5
        import java.util.Scanner;

public class PowerExample {

    public static int power(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите основание: ");
        int base = scanner.nextInt();

        System.out.print("Введите показатель степени: ");
        int exponent = scanner.nextInt();

        int result = power(base, exponent);

        System.out.println("Результат: " + result);

        scanner.close();
    }
}