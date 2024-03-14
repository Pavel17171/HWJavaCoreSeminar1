package org.jcore.regular;

import java.util.Scanner;
import static org.jcore.decorator.Decorator.*;
import static org.jcore.regular.Calculator.*;
public class Work {
    public static void startCal() {
        Scanner sc = new Scanner(System.in);

        firstNumber();
        int a = sc.nextInt();

        symbol();
        char c = sc.next().charAt(0);
        while (!testSign(c)) {
            System.out.println("Нет такого знака");
            c = sc.next().charAt(0);
        }

        secondNumber();
        int b = sc.nextInt();
        result(a, b, c);
    }
}
