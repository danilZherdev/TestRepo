package ru.chat.commonr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("введите начало");
//        int s = input.nextInt();
//        System.out.println("введите конец");
//        int e = input.nextInt();
//        chisla(s, e);
        ComplexNumber b = new ComplexNumber(0, 3);
        ComplexNumber c = new ComplexNumber(17, 5);
        ComplexNumber res = b.add(c);
        System.out.println("Result is = " + res);
    }

    public static void chisla(int start, int end) {
        if (start <= end) {
            if (start % 2 == 0)
                System.out.println(start + " Число четное");
            chisla(++start, end);
        }

        int a = 3;

    }
}

















