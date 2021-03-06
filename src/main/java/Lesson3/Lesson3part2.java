package Lesson3;

public class Lesson3part2 {
    //Факториал числа n — это значение произведения (умножения) всех натуральных
    // чисел от 1 до n, которое обозначается как n!
    // 1! =  1, 2! =  1 * 2 = 2, 3! =  1 * 2 * 3 = 6, 4! =  1 * 2 * 3 * 4 = 24 и тд
    // Важное замечание  0! = 1/
    // нужно вычислить n!, n=1*2*...*n

    public static void main(String[] args) {
        int n = 4;// n - наш факториал
        System.out.println("Факториал числа " + n + " равен " + factorial(n));
    }

    public static int factorial(int n) {
        int a = 1;// первое число всегда 1, пусть это будет переменная "a"
        //Далее нам нужно использовать цикл for, чтоб перемножать числа от 1 до n:
        for (int i = 1; i <= n; i++) {
            // первое число всегда 1, следующее увеличиваем на 1 (i++)
            // присваиваем первому числу новое значение, увеличив на 1, т.е. 2 и т.д.
            // и так умножаем пока не дойдем до числа n
            a = a * i;
        }
        return a;
    }
}
