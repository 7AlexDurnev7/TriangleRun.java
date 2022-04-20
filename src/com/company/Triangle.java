package com.company;

import java.util.Scanner;

public class Triangle {

    //1. Создаем поля класса
    private String name; //переменная имени
    private double a; //переменная стороны А
    private double b; //переменная стороны В
    private double c; //переменная стороны С

    // Создаем конструктор без параметров
    public Triangle() {
        this.name = "Name";
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    //2. Создаем конструктор с 4-мя параметрами
    public Triangle(String name, double a, double b, double c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //3. Getters
    public String getName() {
        return name;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    //4. Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    //5. Вывод метода на экран
    public void printTriangle() {
        System.out.println(toString());
    }

    //6. Метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return name + " сторона А = " + a + " сторона B = " + b + " сторона C = " + c;
    }

    //7. Метод ввода данных с клавиатуры
    public void inputTriangle(Scanner in) {
        System.out.print("Введите имя треугольника: ");
        name = in.nextLine();
        System.out.print("Введите сторону треугольника А: ");
        a = in.nextDouble();
        System.out.print("Введите сторону треугольника B: ");
        b = in.nextDouble();
        System.out.print("Введите сторону треугольника C: ");
        c = in.nextDouble();
    }

    // 8. Метод вычисления периметра
    public double Perimeter() {
        return a + b + c;
    }

    //9. Метод вычисления площади
    public double Square() {
        double per = (a + b + c) / 2;
        return Math.sqrt(per * (per - a) * (per - b) * (per - c));
        // return Math.sqrt(Square() / 2 * (Square() / 2 - a) * (Square() / 2 - b) * (Square() / 2 - c));
    }

    // 10. Метод проверяющий корректность значений стороне треугольника
    //    (может ли такой треугольник существовать)
    public static boolean being(Triangle triangle) {
        boolean isBeing;
        if ((triangle.a + triangle.b > triangle.c) && (triangle.a + triangle.c > triangle.b)
                && ((triangle.b + triangle.c > triangle.a)
                && triangle.a >= 0 && triangle.b >= 0 && triangle.c >= 0)) {
            isBeing = true;
            System.out.println("Данный треуголник существует!");
        } else {
            isBeing = false;
        System.out.println("Данный треуголник не может существовать!");
    }
        return isBeing;
}
}
