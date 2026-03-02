Задание 1
public class Task1 {
    public static void main(String[] args) {
        int[] A = new int[20];
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 40 - 20);
            if (A[i] < 0) sum += A[i];
        }

        System.out.println("Сумма отрицательных: " + sum);
    }
}


Задание 2
public class Task2 {
    public static void main(String[] args) {
        int[] B = new int[15];
        int sum = 0;

        for (int i = 0; i < B.length; i++) {
            B[i] = (int)(Math.random() * 40 - 20);
            if (B[i] > 0) sum += B[i];
        }

        System.out.println("Сумма положительных: " + sum);
    }
}


Задание 3
public class Task3 {
    public static void main(String[] args) {
        double[] A = new double[12];
        double mult = 1;
        boolean found = false;

        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random() * 20 - 10;
            if (A[i] < 0) {
                mult *= A[i];
                found = true;
            }
        }

        if (found)
            System.out.println("Произведение отрицательных: " + mult);
        else
            System.out.println("Отрицательных нет");
    }
}


Задание 4
public class Task4 {
    public static void main(String[] args) {
        int[] C = new int[25];
        int mult = 1;
        boolean found = false;

        for (int i = 0; i < C.length; i++) {
            C[i] = (int)(Math.random() * 40 - 20);
            if (C[i] > 0) {
                mult *= C[i];
                found = true;
            }
        }

        if (found)
            System.out.println("Произведение положительных: " + mult);
        else
            System.out.println("Положительных нет");
    }
}


Задание 5
public class Task5 {
    public static void main(String[] args) {
        double[] D = new double[17];
        double sum = 0;

        for (int i = 0; i < D.length; i++) {
            D[i] = Math.random() * 100;
            sum += D[i];
        }

        System.out.println("Среднее: " + sum / D.length);
    }
}


Задание 6
public class Task6 {
    public static void main(String[] args) {
        int[][] A = new int[10][10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                A[i][j] = (int)(Math.random() * 40 - 20);
                if (A[i][j] < 0) sum += A[i][j];
            }
            B[i] = sum;
            System.out.println("Строка " + i + ": " + B[i]);
        }
    }
}


Задание 7
public class Task7 {
    public static void main(String[] args) {
        int[][] B = new int[5][5];
        int[] A = new int[5];

        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                B[i][j] = (int)(Math.random() * 40 - 20);
                if (B[i][j] > 0) sum += B[i][j];
            }
            A[i] = sum;
            System.out.println("Строка " + i + ": " + A[i]);
        }
    }
}


Задание 8
public class Task8 {
    public static void main(String[] args) {
        int[][] A = new int[12][6];

        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 6; j++)
                A[i][j] = (int)(Math.random() * 40 - 20);

        for (int j = 0; j < 6; j++) {
            int mult = 1;
            boolean found = false;

            for (int i = 0; i < 12; i++) {
                if (A[i][j] < 0) {
                    mult *= A[i][j];
                    found = true;
                }
            }

            if (found)
                System.out.println("Столбец " + j + ": " + mult);
            else
                System.out.println("Столбец " + j + ": нет отрицательных");
        }
    }
}


Задание 9
public class Task9 {
    public static void main(String[] args) {
        int[][] C = new int[5][5];
        int mult = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C[i][j] = (int)(Math.random() * 20 - 10);
                if (i == j && C[i][j] > 0)
                    mult *= C[i][j];
            }
        }

        System.out.println("Произведение диагонали: " + mult);
    }
}


Задание 10
public class Task10 {
    public static void main(String[] args) {
        int[][] D = new int[7][7];
        int sum = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                D[i][j] = (int)(Math.random() * 20);
                if (i == j) sum += D[i][j];
            }
        }

        System.out.println("Среднее диагонали: " + (double)sum / 7);
    }
}


Задание 11
public class Task11 {
    public static void main(String[] args) {
        int[] A = new int[25];

        for (int i = 0; i < A.length; i++)
            A[i] = (int)(Math.random() * 100);

        int min = 0, max = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[min]) min = i;
            if (A[i] > A[max]) max = i;
        }

        int temp = A[min];
        A[min] = A[max];
        A[max] = temp;

        System.out.println("Замена выполнена");
    }
}


Задание 12
        import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] B = new int[25];

        for (int i = 0; i < B.length; i++)
            B[i] = (int)(Math.random() * 100);

        Arrays.sort(B);

        for (int x : B)
            System.out.print(x + " ");
    }
}


Задание 13
public class Task13 {
    public static void main(String[] args) {
        int[] C = new int[20];
        int sum = 0;

        for (int i = 0; i < C.length; i++) {
            C[i] = (int)(Math.random() * 100);
            sum += C[i];
        }

        System.out.println("Среднее: " + (double)sum / C.length);
    }
}


Задание 14
public class Task14 {
    public static void main(String[] args) {
        int[] D = new int[30];
        int even = 0, odd = 0;

        for (int i = 0; i < D.length; i++) {
            D[i] = (int)(Math.random() * 100);
            if (D[i] % 2 == 0) even += D[i];
            else odd += D[i];
        }

        System.out.println("Чётные: " + even);
        System.out.println("Нечётные: " + odd);
    }
}


Задание 15
public class Task15 {
    public static void main(String[] args) {
        int[][] a = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = (int)(Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}