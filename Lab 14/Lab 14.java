Задание 1
import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i = 1, sum = 0;

        System.out.print("Введите N: ");
        n = sc.nextInt();

        do {
            sum += i;
            i++;
        } while (i <= n);

        System.out.println("Сумма: " + sum);
    }
}

Задание 2
        import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 0;

        System.out.print("Введите число: ");
        num = sc.nextInt();

        do {
            num /= 10;
            count++;
        } while (num != 0);

        System.out.println("Количество цифр: " + count);
    }
}

Задание 3
        import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i = 1;

        System.out.print("Введите число: ");
        n = sc.nextInt();

        do {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        } while (i <= 10);
    }
}

Задание 4
        import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, max = 0;

        System.out.print("Введите число: ");
        num = sc.nextInt();

        do {
            int digit = num % 10;
            if (digit > max) {
                max = digit;
            }
            num /= 10;
        } while (num > 0);

        System.out.println("Максимальная цифра: " + max);
    }
}

Задание 5
        import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, original, reversed = 0;

        System.out.print("Введите число: ");
        num = sc.nextInt();
        original = num;

        do {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        } while (num > 0);

        if (original == reversed)
            System.out.println("Палиндром");
        else
            System.out.println("Не палиндром");
    }
}

Задание 6
        import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 0;

        System.out.print("Введите число: ");
        num = sc.nextInt();

        do {
            int digit = num % 10;
            if (digit % 2 == 0) count++;
            num /= 10;
        } while (num > 0);

        System.out.println("Чётных цифр: " + count);
    }
}

Задание 7
        import java.util.Random;

public class RandomUntilZero {
    public static void main(String[] args) {
        Random rand = new Random();
        int num;

        do {
            num = rand.nextInt(10); // 0-9
            System.out.println(num);
        } while (num != 0);
    }
}

Задание 8
        import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;

        do {
            System.out.print("Введите число (0 для выхода): ");
            num = sc.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Сумма: " + sum);
    }
}

Задание 9
        import java.util.Scanner;

public class PasswordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;

        do {
            System.out.print("Введите пароль (мин 6 символов): ");
            password = sc.nextLine();
        } while (password.length() < 6);

        System.out.println("Пароль принят");
    }
}

Задание 10
        import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, min;

        System.out.print("Введите число (0 для выхода): ");
        num = sc.nextInt();
        min = num;

        do {
            if (num < min) min = num;
            System.out.print("Введите число (0 для выхода): ");
            num = sc.nextInt();
        } while (num != 0);

        System.out.println("Минимальное: " + min);
    }
}