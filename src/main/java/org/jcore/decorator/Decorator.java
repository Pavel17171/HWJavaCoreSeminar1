package org.jcore.decorator;

import static java.lang.String.valueOf;
import static org.jcore.regular.Calculator.*;

public class Decorator {
    public static void firstNumber() {
        System.out.println("Введите Первое число: ");
    }

    public static void symbol() {
        System.out.println("""
                Введите знак операции:
                 + - * /""");
    }

    public static void secondNumber() {
        System.out.println("Введите второе число: ");
    }

    public static void result(int a, int b, char ch) {
        String text = a + " " + ch + " " + b + " = ";
        switch (ch) {
            case '+' -> {
                text += add(a, b);
            }
            case '-' -> {
                text += sub(a, b);
            }
            case '*' -> {
                text += mul(a, b);
            }
            case '/' -> {
                if (b == 0) {
                    text = "Делить на ноль нельзя!";
                } else {
                    text += div(a, b);
                }
            }
            default -> text = "Команда неизвестна";
        }
        System.out.println(text);
    }
}



