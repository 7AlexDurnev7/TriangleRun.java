package com.company;

import java.util.Scanner;

public class TriangleRun {

    // ЗАДАЧА:
//    Реализовать класс «Треугольник».
//    Треугольник характеризуется тремя сторонами (допускаются дробные значения).
//    Необходимо реализовать методы получения периметра и площади треугольника,
//    метод, проверяющий корректность значений стороне треугольника
//    (может ли такой треугольник существовать), ввод/вывод треугольника, setters/getters, конструкторы.
//    Протестировать класс через создание объектов и вызовы методов в коде
//    (менюшки и CLI/GUI делать не надо, просто вызовы методов).
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Triangle triangle = new Triangle();

        //Вводим с клавиатуры параметры
        triangle.inputTriangle(in);

        //
        triangle.being(triangle); //проверка на существование треугольника
        //Выводим на экран
        triangle.printTriangle();
        System.out.println(); // пробел для лучшей читаемости
        // Выводим площадь
        System.out.println("Площадь  равна =  " + triangle.Square());
        System.out.println(); // пробел для лучшей читаемости
        // Выводим периметр
        System.out.println("Периметр равен = " + triangle.Perimeter());
        System.out.println(); // пробел для лучшей читаемости
        //Проверяем существует такой треугольник
        //triangle.being(); // проверка на существование треугольника
        System.out.println(); // пробел для лучшей читаемости
        // Задаем значения треуголника через setters
        triangle.setName("Треугольник по параметрам setters");
        triangle.setA(15);
        triangle.setB(20);
        triangle.setC(30);
        //Выводим на экран getters
        System.out.println("Выводим на экран заданный через setters треуголник");
        System.out.println("Имя треугольника: " + triangle.getName() +
                " сторона A = " + triangle.getA() +
                " сторона B = " + triangle.getB() +
                " сторона C = " + triangle.getC());
        triangle.printTriangle();
        //triangle.being();

        in.close();
    }
}
