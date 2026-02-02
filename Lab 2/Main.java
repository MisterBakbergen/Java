Задание 1
public class Task1 {
    public static void main(String[] args) {

        int age = 18;
        double height = 175.5;
        boolean isStudent = true;

        final int BIRTH_YEAR = 2007;

        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Студент: " + isStudent);
        System.out.println("Год рождения: " + BIRTH_YEAR);
    }
}



Задание 2
public class Task2 {
    public static void main(String[] args) {

        int number = 10;          // примитивный тип
        String text = "Java";     // ссылочный тип

        System.out.println("Число: " + number);
        System.out.println("Текст: " + text);
    }
}


Задание 3
public class Task3 {

    int classVariable = 100; // поле класса

    void show() {
        int localVariable = 50; // локальная переменная
        System.out.println("Поле класса: " + classVariable);
        System.out.println("Локальная переменная: " + localVariable);
    }

    public static void main(String[] args) {
        Task3 obj = new Task3();
        obj.show();
    }
}



Задание 4
class Person {
    String name;
    int age;
}

class Student extends Person {
    String group;
}

public class Task4 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Иван";
        student.age = 20;
        student.group = "ИС-2204";

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.group);
    }
}



Задание 5
class Person {
    void displayInfo() {
        System.out.println("Это человек");
    }
}

class Student extends Person {
    @Override
    void displayInfo() {
        System.out.println("Это студент");
    }
}

public class Task5 {
    public static void main(String[] args) {

        Person person = new Student(); // ссылка родителя, объект потомка
        person.displayInfo();
    }
}

