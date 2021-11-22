package Lesson5;
import java.util.Random;
import java.util.Scanner;

public class Lesson5_7 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);//Обьявляем тип Scanner
        System.out.println(" Введите размер массива - целое число ");// просим ввести размер массива
        int n = keyboard.nextInt();// присваиваем целый тип данных первой переменной
        System.out.println(" Создан массив размером " + n);// выводим подтверждение введенного размера

        int[] massiv = new int[n]; // задаем массив длинной n - ее ввели с клавиатуры

        for (int i = 0; i < massiv.length; i++) {// перебираем все элементы массива
            Random random = new Random();// заполняем массив случайными числами
            massiv[i] = (int) (Math.random() * 100); //диапозон чисел от 0 до 99
            System.out.println(massiv[i]); // выводим данные массива на экран для самопроверки
        }
        // необходимо найти минимальное значение, максимальное значение массива и среднее значение
        // начнем с 1 элемента, сделав его минимальным и сравнивая с каждым след.будем менять его значение
        int min = massiv[0];// Переменной min задаем значение нулевого элемента.
        int max = massiv[0];// Переменной max задаем значение нулевого элемента.

        //Среднее значение это формула c=a/b , а- сумма всех элеменов массива, в- длинна массива
        int a = 0;// вводим переменную "а" - сумма массива, по умолчанию 0
        int b = massiv.length;// длинна массива присваивается переменной для вставки в формулу

        for (int i = 0; i < massiv.length; i++) {// Считаем сумму массива через цикл
            a += massiv[i];
        }
        int c = a / b;//считаем среднее значение

//нахождение максимального и минимального значения в цикле if-then-else с доп "Если" для max !!!
        for (int i = 0; i < massiv.length; i++) {
            if (min >= massiv[i]) {
                min = massiv[i];
            } else if (max < massiv[i]) {
                max = massiv[i];
            }
        }
        System.out.println("Минимальное значение в массиве: " + min);// Выводим на экран наименьший элемент массива
        System.out.println("Максимальное значение в массиве: " + max);// Выводим на экран наименьший элемент массива
        System.out.println("Сумма элементов массива: " + a);
        System.out.println("Длинна массива = " + b);
        System.out.println("Среднее значение массива = " + c);
    }
}







