package ru.sber.task3;

public class Main {
    /* Написать публичный метод принимающий 2 параметра: первый типа byte и второй типа short.
Метод должен возвращать сумму значений параметров. Тип возвращаемого значения должен быть byte. */
    public static  byte byteShort(byte b, short s) {

        return (byte) (b + s);
    }
    /*Написать публичный метод принимающий 2 параметра: первый типа int и второй типа long.
     Метод должен возвращать произведение значений параметров. Тип возвращаемого значения int.*/
    public static int byteLong(int i, long l) {
        return (int) (i*l);
    }

    /*Написать метод getMaxNumber принимающий 2 параметра: int и int.
     Метод должен сравнить переданные параметры между собой и вернуть максимальный. Для решения необходимо использовать IF или тернарный оператор ?:*/
    public static int getMaxNumber  (int a ,int b){
        return (a >= b) ? a : b;
    }

    /*  Написать метод isCharA принимающий 1 параметр типа char. Если передана буква 'А', то возвращать true, а в остальных случаях false
     */
    public static boolean isCharA  (char c){
        return  c == 'A';
    }
    /*            8. Написать метод isCharNumber принимающий 1 параметр типа char. Если передано число, то вернуть true, а в остальных случаях false*/
    public static boolean isCharNumber  (char c){
        return Character.isDigit(c); }

    /*         9. Написать метод выводящий на экран в цикле бинарное представление чисел от 0 до 30.
    Для вывода бинарного представления использовать Integer.toBinaryString(). Без входных параметров и не возвращающая ничего.*/
    public static void printDigit() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }

    /*10. Написать метод выводящий бинарное представление Integer.MAX_VALUE и Integer.MAX_VALUE + 1.
    Для вывода бинарного представления использовать Integer.toBinaryString(). Без входных параметров и не возвращающая ничего.
     Покажет, что переполнение не вызывает ошибку и как это выглядет в памяти*/


    public static void intMax (){
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE +1));
    }

    /* 11. Написать метод принимающий 1 параметр типа char и возвращающий его числовое представление.*/
    public static int charToInt (char c){
        return (int) c;
    }

    /*12. Написать метод принимающий 1 параметр типа int и возвращающий его представление в виде печатного символа*/
    public static char intToChar  (int i){
        return (char) i;
    }
    public static  void main(String[] args) {
        // write your code here
        byte b = Byte.MAX_VALUE;
        short s = Short.MAX_VALUE;
        long l= 555L;


        System.out.println(byteShort(b,s));
        System.out.println(byteLong(b,l));
        System.out.println(getMaxNumber(545454,566556));
        System.out.println(isCharA('K'));
        System.out.println(isCharA('A'));

        System.out.println(isCharNumber( 'h' ));
        System.out.println(isCharNumber( '1' ));

        printDigit();
        intMax ();
        System.out.println( charToInt( 'T' ));
        System.out.println(intToChar(9555));


    }


}
