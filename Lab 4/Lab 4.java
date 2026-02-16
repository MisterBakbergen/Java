Пример 1
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Число положительное");
        } else if (n < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }
}


Пример 2
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("Оценка: 5");
        } else if (score >= 75) {
            System.out.println("Оценка: 4");
        } else if (score >= 60) {
            System.out.println("Оценка: 3");
        } else {
            System.out.println("Оценка: 2");
        }
    }
}


Пример 3
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Первое число больше");
        } else if (a < b) {
            System.out.println("Второе число больше");
        } else {
            System.out.println("Числа равны");
        }
    }
}


Пример 4
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Неверный номер дня");
        }
    }
}


Пример 5
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }
}


Пример 6
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Доступ разрешён");
        } else {
            System.out.println("Доступ запрещён");
        }
    }
}


Пример 7
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 день");
            case 4, 6, 9, 11 -> System.out.println("30 дней");
            case 2 -> System.out.println("28 или 29 дней");
            default -> System.out.println("Неверный номер месяца");
        }
    }
}


Пример 8
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        if (t < 0) {
            System.out.println("Холодно");
        } else if (t <= 25) {
            System.out.println("Тепло");
        } else {
            System.out.println("Жарко");
        }
    }
}


Пример 9
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 10 && n <= 50) {
            System.out.println("Число в диапазоне");
        } else {
            System.out.println("Число вне диапазона");
        }
    }
}


Пример 10
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char op = sc.next().charAt(0);

        switch (op) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            case '/' -> {
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Деление на ноль невозможно");
                }
            }
            default -> System.out.println("Неверная операция");
        }
    }
}
