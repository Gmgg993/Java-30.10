
import java.util.Scanner;

// ==================== КЛАССЫ ====================

class Student {
    String name;
    int age;
    String group;
    int grade;
    double averageGrade;

    Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    Student(String name, double averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    void checkExam() {
        System.out.println(grade >= 50 ? "Экзамен сдан!" : "Экзамен не сдан.");
    }

    void showInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Группа: " + group);
    }
}

class Car {
    String brand;
    String model;
    int year;
    double mileage;
    double fuel;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    Car(String brand, double mileage, double fuel) {
        this.brand = brand;
        this.mileage = mileage;
        this.fuel = fuel;
    }

    void drive(double distance) {
        if (distance > 0 && fuel >= distance / 10) {
            mileage += distance;
            fuel -= distance / 10;
            System.out.println("Пробег: " + mileage + " км");
            System.out.println("Остаток топлива: " + fuel + " л");
        } else {
            System.out.println("Недостаточно топлива или неверное расстояние.");
        }
    }
}

class Book {
    String title;
    String author;
    int pages;

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}

class Phone {
    String brand;
    String model;
    double price;

    Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
}

class Cat {
    String name;
    int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void meow() {
        System.out.println(name + ": Мяу-мяу!");
    }
}

class Dog {
    String name;
    String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + ": Гав-гав!");
    }
}

class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }
}

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Employee {
    String name;
    String position;
    double salary;

    Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}

class Laptop {
    String brand;
    int ram;
    double price;

    Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
}

class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение: " + amount);
        } else {
            System.out.println("Неверная сумма.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снятие: " + amount);
        } else {
            System.out.println("Недостаточно средств или неверная сумма.");
        }
    }
}

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double totalPrice() {
        return price * quantity;
    }
}

class Counter {
    int count;

    void increase() {
        count++;
    }

    void decrease() {
        count--;
    }

    void reset() {
        count = 0;
    }
}

class Movie {
    String title;
    String genre;
    int duration;

    Movie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    void showInfo() {
        System.out.println(title + " | Жанр: " + genre +
                " | Продолжительность: " + duration + " минут");
    }
}

class Temperature {
    double celsius;

    Temperature(double celsius) {
        this.celsius = celsius;
    }

    double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    double toKelvin() {
        return celsius + 273.15;
    }
}

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance() {
        return Math.sqrt(x * x + y * y);
    }
}

class ShoppingCart {
    String productName;
    double price;
    int quantity;

    ShoppingCart(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double total() {
        return price * quantity;
    }

    void changeQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            quantity = newQuantity;
        } else {
            System.out.println("Количество не может быть отрицательным.");
        }
    }
}

class Clock {
    int hours;
    int minutes;
    int seconds;

    Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void showTime() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}

class Flight {
    String flightNumber;
    String destination;
    int availableSeats;

    Flight(String flightNumber, String destination, int availableSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }

    void bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println("Место успешно забронировано.");
        } else {
            System.out.println("Свободных мест нет.");
        }
    }
}

class Computer {
    String brand;
    String processor;
    int ram;
    double price;

    Computer(String brand, String processor, int ram, double price) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.price = price;
    }

    void showInfo() {
        System.out.println(brand + " | " + processor +
                " | RAM: " + ram + " GB | Цена: " + price + " тг");
    }
}

class LibraryBook {
    String title;
    String author;
    boolean isAvailable;

    LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Книга выдана.");
        } else {
            System.out.println("Книга уже выдана.");
        }
    }

    void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Книга возвращена.");
        } else {
            System.out.println("Книга уже находится в библиотеке.");
        }
    }
}

class MobilePhone {
    String brand;
    int batteryLevel;
    boolean isOn;

    MobilePhone(String brand, int batteryLevel) {
        this.brand = brand;
        this.batteryLevel = batteryLevel;
        this.isOn = false;
    }

    void turnOn() {
        if (batteryLevel > 0) {
            isOn = true;
            System.out.println("Телефон включен.");
        } else {
            System.out.println("Батарея разряжена.");
        }
    }

    void turnOff() {
        isOn = false;
        System.out.println("Телефон выключен.");
    }

    void useBattery(int amount) {
        if (isOn && amount > 0) {
            batteryLevel = Math.max(0, batteryLevel - amount);

            if (batteryLevel == 0) {
                isOn = false;
            }

            System.out.println("Заряд батареи: " + batteryLevel + "%");
        } else {
            System.out.println("Телефон выключен или неверное значение.");
        }
    }
}

class Order {
    int orderNumber;
    String productName;
    double price;
    int quantity;

    Order(int orderNumber, String productName, double price, int quantity) {
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double totalPrice() {
        return price * quantity;
    }

    void changeQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            quantity = newQuantity;
        } else {
            System.out.println("Количество не может быть отрицательным.");
        }
    }
}

class Player {
    String name;
    int health;
    int damage;

    Player(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    void attack(Player enemy) {
        System.out.println(name + " атакует " + enemy.name + "!");
        enemy.takeDamage(damage);
    }

    void takeDamage(int amount) {
        health = Math.max(0, health - amount);
        System.out.println(name + " получил урон. Здоровье: " + health);
    }
}

class Warehouse {
    String productName;
    int quantity;
    int capacity;

    Warehouse(String productName, int quantity, int capacity) {
        this.productName = productName;
        this.quantity = quantity;
        this.capacity = capacity;
    }

    void add(int amount) {
        if (amount > 0 && quantity + amount <= capacity) {
            quantity += amount;
            System.out.println("Добавлено: " + amount);
        } else {
            System.out.println("Невозможно добавить товар.");
        }
    }

    void remove(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
            System.out.println("Удалено: " + amount);
        } else {
            System.out.println("Недостаточно товаров на складе.");
        }
    }
}

// ==================== КЛАССЫ ДЛЯ ЗАДАНИЯ 30 ====================

class Teacher {
    String name;
    String subject;
    double salary;

    Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    void showInfo() {
        System.out.println("Имя: " + name + ", Предмет: " +
                subject + ", Зарплата: " + salary + " тг");
    }
}

class Course {
    String name;
    String teacher;
    int hours;

    Course(String name, String teacher, int hours) {
        this.name = name;
        this.teacher = teacher;
        this.hours = hours;
    }

    void showInfo() {
        System.out.println("Курс: " + name + ", Преподаватель: " +
                teacher + ", Часы: " + hours);
    }
}

// ==================== ГЛАВНАЯ ПРОГРАММА ====================

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n========== МЕНЮ ЗАДАНИЙ ==========");

            for (int i = 1; i <= 30; i++) {
                System.out.println(i + ". Задание " + i);
            }

            System.out.println("0. Выход");
            System.out.print("Выберите номер задания: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Введите число!");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Программа завершена.");
                break;
            }

            System.out.println("\n========== РЕЗУЛЬТАТ ==========");

            switch (choice) {

                case 1: {
                    Student s = new Student("Амир", 17, "3ПО-124");
                    s.showInfo();
                    break;
                }

                case 2: {
                    Car c1 = new Car("Toyota", "Camry", 2022);
                    Car c2 = new Car("BMW", "M5", 2024);

                    System.out.println(c1.brand + " " + c1.model + ", " + c1.year);
                    System.out.println(c2.brand + " " + c2.model + ", " + c2.year);
                    break;
                }

                case 3: {
                    Book book = new Book("Война и мир", "Лев Толстой", 1225);

                    System.out.println("Название: " + book.title);
                    System.out.println("Автор: " + book.author);
                    System.out.println("Страниц: " + book.pages);
                    break;
                }

                case 4: {
                    Phone p1 = new Phone("Apple", "iPhone 16", 450000);
                    Phone p2 = new Phone("Samsung", "S25", 400000);
                    Phone p3 = new Phone("Xiaomi", "15", 300000);

                    Phone[] phones = {p1, p2, p3};

                    for (Phone p : phones) {
                        System.out.println(p.brand + " " + p.model + " — " + p.price + " тг");
                    }
                    break;
                }

                case 5: {
                    Cat cat = new Cat("Мастер", 3);
                    System.out.println("Кошка: " + cat.name + ", возраст: " + cat.age);
                    cat.meow();
                    break;
                }

                case 6: {
                    Dog dog = new Dog("Абби", "Дворняга");
                    System.out.println("Собака: " + dog.name + ", порода: " + dog.breed);
                    dog.bark();
                    break;
                }

                case 7: {
                    Rectangle rect = new Rectangle(5, 10);
                    System.out.println("Площадь: " + rect.area());
                    System.out.println("Периметр: " + rect.perimeter());
                    break;
                }

                case 8: {
                    Circle circle = new Circle(5);
                    System.out.printf("Площадь круга: %.2f%n", circle.area());
                    break;
                }

                case 9: {
                    Employee emp = new Employee("Богдан", "Программист", 1);
                    System.out.println("Имя: " + emp.name);
                    System.out.println("Должность: " + emp.position);
                    System.out.println("Зарплата: " + emp.salary + " тг");
                    break;
                }

                case 10: {
                    Laptop l1 = new Laptop("Acer", 16, 300000);
                    Laptop l2 = new Laptop("ASUS", 32, 450000);

                    System.out.println(l1.brand + ": " + l1.price + " тг");
                    System.out.println(l2.brand + ": " + l2.price + " тг");

                    if (l1.price > l2.price) {
                        System.out.println("Первый ноутбук дороже.");
                    } else if (l1.price < l2.price) {
                        System.out.println("Второй ноутбук дороже.");
                    } else {
                        System.out.println("Стоимость одинаковая.");
                    }
                    break;
                }

                case 11: {
                    BankAccount account = new BankAccount("Катя", 1000000);
                    account.deposit(5000);
                    account.withdraw(3000);
                    System.out.println("Баланс: " + account.balance + " тг");
                    break;
                }

                case 12: {
                    Product product = new Product("Ноутбук", 250000, 5);
                    System.out.println("Товар: " + product.name);
                    System.out.println("Общая стоимость: " + product.totalPrice() + " тг");
                    break;
                }

                case 13: {
                    Student student = new Student("Марьяна", 90);
                    System.out.println("Студент: " + student.name);
                    System.out.println("Оценка: " + student.grade);
                    student.checkExam();
                    break;
                }

                case 14: {
                    Counter counter = new Counter();

                    counter.increase();
                    counter.increase();
                    counter.increase();

                    System.out.println("После увеличения: " + counter.count);

                    counter.decrease();
                    System.out.println("После уменьшения: " + counter.count);

                    counter.reset();
                    System.out.println("После сброса: " + counter.count);
                    break;
                }

                case 15: {
                    Movie movie = new Movie("Интерстеллар", "Фантастика", 169);
                    movie.showInfo();
                    break;
                }

                case 16: {
                    Temperature temp = new Temperature(25);

                    System.out.println("Цельсий: " + temp.celsius + " °C");
                    System.out.printf("Фаренгейт: %.2f °F%n", temp.toFahrenheit());
                    System.out.printf("Кельвин: %.2f K%n", temp.toKelvin());
                    break;
                }

                case 17: {
                    Point point = new Point(3, 4);

                    System.out.println("Координаты: (" + point.x + ", " + point.y + ")");
                    System.out.println("Расстояние: " + point.distance());
                    break;
                }

                case 18: {
                    ShoppingCart cart = new ShoppingCart("Мышь", 5000, 2);

                    System.out.println("Товар: " + cart.productName);
                    System.out.println("Сумма: " + cart.total() + " тг");

                    cart.changeQuantity(5);
                    System.out.println("После изменения: " + cart.total() + " тг");
                    break;
                }

                case 19: {
                    Clock clock = new Clock(9, 5, 7);
                    System.out.print("Время: ");
                    clock.showTime();
                    break;
                }

                case 20: {
                    Flight flight = new Flight("KC123", "Астана", 3);

                    System.out.println("Рейс: " + flight.flightNumber);
                    System.out.println("Направление: " + flight.destination);
                    System.out.println("Свободных мест: " + flight.availableSeats);

                    flight.bookSeat();

                    System.out.println("Осталось мест: " + flight.availableSeats);
                    break;
                }

                case 21: {
                    Computer pc1 = new Computer("ASUS", "Intel i5", 16, 350000);
                    Computer pc2 = new Computer("HP", "Intel i7", 32, 500000);
                    Computer pc3 = new Computer("Acer", "Ryzen 5", 16, 400000);

                    pc1.showInfo();
                    pc2.showInfo();
                    pc3.showInfo();
                    break;
                }

                case 22: {
                    BankAccount acc1 = new BankAccount("Богдан", 10000);
                    BankAccount acc2 = new BankAccount("Амир", 20000);

                    acc1.deposit(5000);
                    acc2.withdraw(3000);

                    System.out.println(acc1.owner + ": " + acc1.balance + " тг");
                    System.out.println(acc2.owner + ": " + acc2.balance + " тг");
                    break;
                }

                case 23: {
                    LibraryBook book = new LibraryBook("Гарри Поттер", "Дж. Роулинг");

                    book.borrow();
                    book.borrow();
                    book.returnBook();
                    book.borrow();
                    break;
                }

                case 24: {
                    Student[] students = {
                        new Student("Иван", 85.5),
                        new Student("Мария", 95.2),
                        new Student("Алексей", 78.4),
                        new Student("Анна", 91.0),
                        new Student("Петр", 88.6)
                    };

                    Student best = students[0];

                    for (Student st : students) {
                        System.out.println(st.name + ": " + st.averageGrade);

                        if (st.averageGrade > best.averageGrade) {
                            best = st;
                        }
                    }

                    System.out.println("Лучший студент: " + best.name);
                    System.out.println("Средний балл: " + best.averageGrade);
                    break;
                }

                case 25: {
                    MobilePhone mobile = new MobilePhone("Samsung", 100);

                    mobile.turnOn();
                    mobile.useBattery(30);
                    mobile.turnOff();
                    break;
                }

                case 26: {
                    Car car = new Car("Toyota", 10000, 50);
                    car.drive(100);
                    break;
                }

                case 27: {
                    Order order = new Order(101, "Клавиатура", 15000, 2);

                    System.out.println("Заказ №" + order.orderNumber);
                    System.out.println("Товар: " + order.productName);
                    System.out.println("Итоговая стоимость: " + order.totalPrice() + " тг");

                    order.changeQuantity(4);
                    System.out.println("После изменения: " + order.totalPrice() + " тг");
                    break;
                }

                case 28: {
                    Player player1 = new Player("Воин", 100, 25);
                    Player player2 = new Player("Маг", 80, 15);

                    player1.attack(player2);
                    player2.attack(player1);

                    System.out.println("Здоровье " + player1.name + ": " + player1.health);
                    System.out.println("Здоровье " + player2.name + ": " + player2.health);
                    break;
                }

                case 29: {
                    Warehouse warehouse = new Warehouse("Монитор", 50, 100);

                    warehouse.add(30);
                    warehouse.add(40);
                    warehouse.remove(20);
                    warehouse.remove(100);

                    System.out.println("Товар: " + warehouse.productName);
                    System.out.println("Количество: " + warehouse.quantity);
                    System.out.println("Вместимость: " + warehouse.capacity);
                    break;
                }

                case 30: {
                    // Студенты
                    Student s1 = new Student("Амир", 17, "3ПО-124");
                    Student s2 = new Student("Богдан", 18, "3ПО-124");

                    // Преподаватели
                    Teacher t1 = new Teacher("Магжан Ержанович", "Программирование на C#", 300000);
                    Teacher t2 = new Teacher("Елена", "Математика", 280000);

                    // Курсы
                    Course c1 = new Course("C#", "Магжан Ержанович", 60);
                    Course c2 = new Course("Математика", "Елена", 45);

                    System.out.println("--- СТУДЕНТЫ ---");
                    s1.showInfo();
                    s2.showInfo();

                    System.out.println("\n--- ПРЕПОДАВАТЕЛИ ---");
                    t1.showInfo();
                    t2.showInfo();

                    System.out.println("\n--- КУРСЫ ---");
                    c1.showInfo();
                    c2.showInfo();
                    break;
                }

                default:
                    System.out.println("Задания с таким номером нет!");
                    break;
            }

            System.out.println("\nНажмите Enter, чтобы продолжить...");
            scanner.nextLine();
            scanner.nextLine();
        }

        scanner.close();
    }
}
