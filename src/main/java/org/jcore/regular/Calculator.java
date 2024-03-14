package org.jcore.regular;

public class Calculator {
    static char[] signs = {'+', '-', '*', '/'};

    /**
     * Проверка правильности введения знака
     * @param ch введеный знак
     * @return true - если такой знак есть в signs
     *         false - если такого знака нет
     */
    public static boolean testSign(char ch) {
        boolean flag = false;
        for (char c : signs) {
            if (c == ch) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static double div (int a, int b) {
        return (double) a / b;
    }
}
