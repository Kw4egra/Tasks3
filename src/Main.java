// Задача 1 Класс "Человек"
// Создайте класс Person с полями name, age, gender.
// Реализуйте методы для вывода информации о человеке и увеличения его возраста.
// Добавьте метод для изменения имени.

import java.lang.reflect.Array;
import java.util.ArrayList;

class Person {
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void PersonInfo(){
        System.out.println("Имя - " + name + "\nвозраст - " + age + "\nПол - " + gender);
    }
    public void AddAge(int age){
        this.age += age;
    }
    public void ChangeName(String name) {
        this.name = name;
    }
}

// Задача 2 Наследование: Класс "Работник" и "Менеджер"
// Создайте класс Worker, который наследуется от класса Person, и добавьте поле salary.
// Создайте класс Manager, который наследует от Worker и добавляет поле для подчиненных сотрудников.

class Worker extends Person {
    int salary;
    public Worker(String name, int age, char gender, int salary) {
        super(name,age,gender);
        this.salary = salary;
    }
}

class Manager extends Worker {
    Worker[] slaves;
    public Manager(String name, int age, char gender, int salary, Worker[] slaves) {
        super(name,age,gender,salary);
        this.slaves = slaves;
    }
}

// Задача 3 Полиморфизм: Животные
// Создайте интерфейс Animal с методом makeSound().
// Реализуйте классы Dog, Cat, и Cow, которые реализуют этот интерфейс.
// Продемонстрируйте полиморфизм на примере массива животных.

interface Animal {
    void makeSound();
}
class Dog implements Animal{
    public void makeSound() {
        System.out.println("Гав, гав");
    }
}

class Cat implements Animal{
    public void makeSound() {
        System.out.println("Мяу, мяу");
    }
}

class Cow implements Animal{
    public void makeSound() {
        System.out.println("Му, му");;
    }
}

// Задача 4 Абстрактный класс "Транспорт"
// Создайте абстрактный класс Transport с абстрактным методом move().
// Реализуйте классы Car и Bike, которые наследуются от Transport и реализуют метод move().

abstract class Transport {
    abstract void move();
}

class Car extends Transport {
    public void move() {
        System.out.println("Едет машина");
    }
}

class Bike extends Transport {
    public void move() {
        System.out.println("Едет мотоцикл");
    }
}

// Задача 5 Класс "Книга" и "Библиотека"
// Создайте класс Book с полями title, author, и year.
// Создайте класс Library, который содержит коллекцию книг и методы для добавления книг,
// поиска по автору и году публикации.

class Book {
    String title;
    String author;
    int year;
    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<Book>();
    public void addBook(String title, String author, int year) {
        Book book = new Book(title,author,year);
        books.add(book);
    }
    public void bookSelect(String author,int year) {
        for (Book book : books) {
            if (book.year == year && book.author == author) {
                System.out.println(book.title);
            }
        }
    }
}

// Задача 6 Инкапсуляция: Банк
// Создайте класс BankAccount с полями accountNumber, balance,
// и методами для пополнения и снятия средств.
// Обеспечьте инкапсуляцию для безопасности данных счета.

class BankAccount {
    private int accountNumber;
    private int balance;
    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void addBalance(int balance)
    {
        this.balance += balance;
    }
    public void getBalance(int balance)
    {
        this.balance -= balance;
    }
    public void vjb() {
        System.out.println(this.balance + " " + this.accountNumber);
    }
}

// Задача 7 Счетчик объектов
// Создайте класс Counter, который хранит количество созданных объектов данного класса.
// Реализуйте статическое поле для учета количества объектов и метод для его увеличения
// при каждом создании объекта.

class Counter {
    static int count;
    public Counter() {
        addObject();
    }
    private static void addObject() {
        count += 1;
    }
}

// Задача 8 Площадь фигур
// Создайте абстрактный класс Shape с абстрактным методом getArea().
// Реализуйте классы Circle и Rectangle,
// которые наследуют от Shape и вычисляют площадь круга и прямоугольника соответственно.

abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}

class Rectangle extends Shape {
    double height;
    double weight;
    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    double getArea() {
        return weight*height;
    }
}

// Задача 9 Наследование: Животные и их движения
// Создайте класс Animal с методом move().
// Реализуйте классы Fish, Bird и Dog, которые наследуют Animal и переопределяют метод move()
// (рыба плавает, птица летает, собака бегает).

class Animal1{
    public void move() {
        System.out.println("Я иду");
    }
}

class Fish extends Animal1 {
    @Override
    public void move() {
        System.out.println("Рыба плавает");
    }
}

class Bird extends Animal1 {
    @Override
    public void move() {
        System.out.println("Птица летает");
    }
}

class Dog1 extends Animal1 {
    @Override
    public void move() {
        System.out.println("Собака бегает");
    }
}

// Задача 10 Работа с коллекциями: Университет
// Создайте класс Student с полями name, group, grade. Создайте класс University,
// который содержит список студентов и методы для добавления студентов,
// сортировки по имени и фильтрации по успеваемости.

class Student {
    String name;
    int group;
    double grade;
    public Student(String name,int group,double grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }
}

class University {
    ArrayList<Student> students = new ArrayList<Student>();
    public void addStudent(String name,int group,double grad) {
        students.add(new Student(name, group, grad));
    }
    public void NameList() {
        ArrayList<Student> std = new ArrayList<Student>();
        for (Student student : students.stream()) {
            System.out.println(student.name);
        }
        for (Student student : students) {
            System.out.println(student.name);
        }
    }

}

public class Main {
    public static void main(String[] args) {
        University un = new University();
        un.addStudent("Алыа", 121, 2.5);
        un.addStudent("Блыа", 121, 2.5);
        un.addStudent("Елыа", 121, 2.5);
        un.addStudent("Влыа", 121, 2.5);
        un.addStudent("Ёлыа", 121, 2.5);
        un.addStudent("Нлыа", 121, 2.5);
        un.NameList();

    }
}