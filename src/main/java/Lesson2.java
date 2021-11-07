public class Lesson2 {

    public static void main(String[] args) {// короткий вариант операций
        int a = 5;// сложение 2-х чисел
        int b = 10;
        int c = a + b;
        System.out.println(c);
        int d = 5;// вычитание 2-х чисел
        int e = 10;
        int f = a - b;
        System.out.println(f);
        int g = 5;// умножение 2-х чисел
        int h = 10;
        int i = g * h;
        System.out.println(i);
        int k = 5;// деление 2-х чисел
        int l = 10;
        int m = l / k;
        System.out.println(m);

//Задача: сколько человек может поднять лифт, грузоподьемностью 1000 кг.Если вес человека 80 кг.
        int k1;//вес человека
        int l1;//грузоподьемность лифта
        int m1;//количество человек, которых может поднять

        k1 = 80;
        l1 = 1000;
        m1 = l1 / k1;

        System.out.print("Лифт может поднять ");
        System.out.print(m1);
        System.out.println(" человек");

        plus(5,10);
        minus(5,10);
        umnogenie(5,10);
    }

    public static void plus(int arg1, int arg2) {
        int result = arg1 + arg2;
        System.out.println(result);

    }
    public static void minus(int arg1, int arg2) {
        int result = arg1 - arg2;
        System.out.println(result);
    }
    public static void umnogenie(int arg1, int arg2) {
        int result = arg1 * arg2;
        System.out.print(result);
    }
}