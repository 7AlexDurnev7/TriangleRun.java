package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class cyclicCase {
    // Задание 2
    //Реализовать процедуру (статический метод)
    // циклического сдвига одномерного массива целых чисел вправо на n позиций.
    //Пример работы:
    //вход процедуры > arr = [1, 2, 3, 4, 5], n = 1
    //выход > arr = [5, 1, 2, 3, 4]
    //вход процедуры > arr = [1, 2, 3, 4, 5], n = 3
    //выход > arr = [3, 4, 5, 1, 2]
    public static void getArrayShift(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int tmp = arr[arr.length - 1];
            arr[arr.length - 1] = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[arr.length - j] = arr[arr.length - j - 1];
            }
            arr[0] = tmp;
        }
    }


    public static void main(String[] args) {
        //Задание 1
        //Пользователь вводит длину окружности (допускаются дробные значения).
        // Программа должна вывести площадь заданной окружности.

        //Решение:
        //Создаем сканер для ввода данных
        Scanner in = new Scanner(System.in);
        {
        double length;  //объявляем переменную
        System.out.println("Введите длину окружности: ");  //запрашиваем пользователя ввести длину
        length = in.nextDouble();
        in.close(); //закрываем сканер
          //Считаем площадь окружности
        double square = (length * length) / (4 * Math.PI);
         System.out.println("Площадь окружности равна: " + square);
        }
        System.out.println('\n'); //

        //Решение второй задачи:
        int arr[] = {1, 2, 3, 4, 5,};
        System.out.println("Массив " + Arrays.toString(arr));
        getArrayShift(arr, 1);
        System.out.println("Со сдвигом на 1 " + Arrays.toString(arr));
        getArrayShift(arr, 4);
        System.out.println("Со сдвигом на 4 " + Arrays.toString(arr));
        getArrayShift(arr, 3);
        System.out.println("Со сдвигом на 3 " + Arrays.toString(arr));
    }
}




