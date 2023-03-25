package HW_Java_Start;

public class Java_1 {
    public static byte byteMaxVal = Byte.MAX_VALUE;
    public static void main(String[] args) {
        // Логические операторы
        System.out.println("!!! Логическое 'И': " + (3 > 2 && 4 > 3)); // && (И)
        System.out.println("!!! Логическое 'ИЛИ': " + (2 > 3 ||  3 > 4)); // || (ИЛИ)
        System.out.println("!!! Логическое 'НЕ': " + (!(2 > 3))); // ! (НЕ)

        // Математические операторы
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 10;
        System.out.println("!!! a + b = " + (a + b)); // + Сложение
        System.out.println("!!! c - a = " + (c - a)); // - Вычеитание
        System.out.println("!!! c * b = " + (c * b)); // * Умножение
        System.out.println("!!! d / b = " + (d / b)); // / Деление
        System.out.println("!!! c % b = " + (c % b)); // % Остаток от деления

        // Переполнение
        byte a1 = 127;
        System.out.println("!!! Переполнение №1 = " + (a1 + 1));
        System.out.println("!!! Переполнение №2 = " + (byteMaxVal + 1));
        byte y = Byte.MAX_VALUE;
        byte u = y + 5;
        System.out.println("!!! Переполнение №3 = " + (u));

        // Вычисления комбинаций типов данных (int и double)
        int w = 70;
        double q = 7.77;
        System.out.println("!!! Комбинации типов данных = " + (w + q));
    }
}
