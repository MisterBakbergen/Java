Задание 1
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double result = Math.pow(x, y);

        System.out.println("Результат: " + result);
    }
}

Задание 2
        import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        double result = Math.sqrt(x);

        System.out.println("Результат: " + result);
    }
}

Задание 3
        import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Сумма: " + (a + b));
    }
}

Задание 4
        import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            System.out.println("Сумма: " + (a + b));
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода!");
        }
    }
}

Задание 5
        import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 +");
        System.out.println("2 -");
        System.out.println("3 *");
        System.out.println("4 /");

        int choice = sc.nextInt();

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        switch (choice) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println(a * b); break;
            case 4: System.out.println(a / b); break;
        }
    }
}

Задание 6
        import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double result = a + b;

        history.add(a + " + " + b + " = " + result);

        for (String s : history) {
            System.out.println(s);
        }
    }
}

Задание 7
public class Task11 {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        System.out.println("Экран очищен");
    }
}

Задание 8
        import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double percent = sc.nextDouble();
        double number = sc.nextDouble();

        double result = (percent / 100) * number;

        System.out.println("Результат: " + result);
    }
}

Задание 9
        import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        System.out.println("sin: " + Math.sin(x));
        System.out.println("cos: " + Math.cos(x));
        System.out.println("tan: " + Math.tan(x));
    }
}

Задание 10
        import javax.script.*;

public class Task14 {
    public static void main(String[] args) throws Exception {

        String expr = "2+3*4";

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");

        Object result = engine.eval(expr);

        System.out.println("Результат: " + result);
    }
}