Вариант 1
class Transport {
    String name;
    int speed;

    Transport(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    void move(){
        System.out.println(name + " moves with speed " + speed);
    }
}

class Car extends Transport{
    Car(String name,int speed){ super(name,speed); }
}

class Train extends Transport{
    Train(String name,int speed){ super(name,speed); }
}

class Airplane extends Transport{
    Airplane(String name,int speed){ super(name,speed); }
}

public class Main{
    public static void main(String[] args){
        new Car("Toyota",180).move();
        new Train("Express",120).move();
        new Airplane("Boeing",900).move();
    }
}



Вариант 2
class Shape{
    double area(){
        return 0;
    }
}

class Circle extends Shape{
    double r;
    Circle(double r){ this.r=r; }

    double area(){
        return 3.14*r*r;
    }
}

class Rectangle extends Shape{
    double a,b;
    Rectangle(double a,double b){ this.a=a; this.b=b; }

    double area(){
        return a*b;
    }
}

class Triangle extends Shape{
    double a,h;
    Triangle(double a,double h){ this.a=a; this.h=h; }

    double area(){
        return 0.5*a*h;
    }
}



Вариант 3
class Employee{
    String name;
    double salary;

    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    void work(){
        System.out.println(name+" is working");
    }
}

class Manager extends Employee{
    Manager(String n,double s){ super(n,s); }
}

class Developer extends Employee{
    Developer(String n,double s){ super(n,s); }
}

class Designer extends Employee{
    Designer(String n,double s){ super(n,s); }
}



Вариант 4
class BankAccount{
    int accountNumber;
    double balance;

    BankAccount(int n,double b){
        accountNumber=n;
        balance=b;
    }

    void deposit(double sum){
        balance+=sum;
    }

    void withdraw(double sum){
        balance-=sum;
    }
}

class SavingsAccount extends BankAccount{
    SavingsAccount(int n,double b){ super(n,b); }
}

class CreditAccount extends BankAccount{
    CreditAccount(int n,double b){ super(n,b); }
}



Вариант 5
class Person{
    String name;

    Person(String name){
        this.name=name;
    }
}

class Student extends Person{
    Student(String n){ super(n); }

    void study(){
        System.out.println(name+" studies");
    }
}

class Teacher extends Person{
    Teacher(String n){ super(n); }

    void teach(){
        System.out.println(name+" teaches");
    }
}

class Administrator extends Person{
    Administrator(String n){ super(n); }

    void manage(){
        System.out.println(name+" manages");
    }
}



Вариант 6
class Device{
    String brand;
    int power;

    Device(String b,int p){
        brand=b;
        power=p;
    }

    void turnOn(){
        System.out.println(brand+" device turned on");
    }
}

class Laptop extends Device{
    Laptop(String b,int p){ super(b,p); }
}

class Smartphone extends Device{
    Smartphone(String b,int p){ super(b,p); }
}

class Tablet extends Device{
    Tablet(String b,int p){ super(b,p); }
}



Вариант 7
class Animal{
    void makeSound(){
        System.out.println("Animal sound");
    }
}

class Lion extends Animal{
    void makeSound(){
        System.out.println("Lion roar");
    }
}

class Elephant extends Animal{
    void makeSound(){
        System.out.println("Elephant trumpet");
    }
}

class Monkey extends Animal{
    void makeSound(){
        System.out.println("Monkey sound");
    }
}



Вариант 8
class Vehicle{
    void startEngine(){
        System.out.println("Engine started");
    }
}

class Bike extends Vehicle{}
class Bus extends Vehicle{}
class Taxi extends Vehicle{}



Вариант 9
class Component{
    String name;

    Component(String n){
        name=n;
    }

    void showInfo(){
        System.out.println("Component: "+name);
    }
}

class CPU extends Component{
    CPU(String n){ super(n); }
}

class RAM extends Component{
    RAM(String n){ super(n); }
}

class GPU extends Component{
    GPU(String n){ super(n); }
}



Вариант 10
class Product{
    double price;

    Product(double p){
        price=p;
    }

    void showPrice(){
        System.out.println("Price: "+price);
    }
}

class Food extends Product{
    Food(double p){ super(p); }
}

class Electronics extends Product{
    Electronics(double p){ super(p); }
}

class Clothes extends Product{
    Clothes(double p){ super(p); }
}



Вариант 11
class TeamMember{}

class Player extends TeamMember{
    void play(){
        System.out.println("Player plays");
    }
}

class Coach extends TeamMember{
    void train(){
        System.out.println("Coach trains");
    }
}

class Doctor extends TeamMember{
    void heal(){
        System.out.println("Doctor heals");
    }
}



Вариант 12
class Instrument{
    void playSound(){
        System.out.println("Instrument sound");
    }
}

class Guitar extends Instrument{}
class Piano extends Instrument{}
class Drums extends Instrument{}



Вариант 13
class Course{
    void startCourse(){
        System.out.println("Course started");
    }
}

class ProgrammingCourse extends Course{}
class MathCourse extends Course{}
class HistoryCourse extends Course{}



Вариант 14
class Character{
    void attack(){
        System.out.println("Character attacks");
    }
}

class Warrior extends Character{}
class Mage extends Character{}
class Archer extends Character{}



Вариант 15
class Appliance{
    void operate(){
        System.out.println("Appliance works");
    }
}

class Refrigerator extends Appliance{}
class WashingMachine extends Appliance{}
class Microwave extends Appliance{}