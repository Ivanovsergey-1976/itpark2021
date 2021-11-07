package Lesson2;

public class Result {

    int arg1,arg2;

    public static void main(String[] args) {
        System.out.println("Привет,мир123!");
        long summa = summa(3, 5);
        System.out.println(summa);
        long otherSumma = summa(5, 5);
        System.out.println(otherSumma);
        long yetOtherSumma = summa(2, 18);
        System.out.println(yetOtherSumma);

        long resultOfMinus = minus(2, 18);
        System.out.println(resultOfMinus);

        long result = multiplyAndSumma(5);
        System.out.println(result);

        long result2 = multiplyAndSumma2(5);
        System.out.println(result2);
    }

    /**
     * метод будет складывать 2 аргумента и возвращать результат операции
     * @param arg1  первый аргумент
     * @param arg2  первый аргумент
     * @return  результат сожения 2-х чисел
     */
    public static long summa(int arg1,int arg2) {
        /* в этой переменной будет сложение
         результат вычисления бла бла бла
        павпвапв правп*/
        int result = arg1 + arg2;
        return result;
    }

    public static long minus(int arg1,int arg2) {
            return arg1-arg2;
    }
    public static long multiplyAndSumma(int arg1) {//умножение числа и сложение с другим
        return 3*arg1+15;
    }
    public static long multiplyAndSumma2(int arg1) {//замена значения
        int result2 = 3*arg1+15;
        result2= result2-38;// справа меняем значение
        return result2;
    }
}

