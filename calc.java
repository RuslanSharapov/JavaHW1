//  Реализовать простой калькулятор

package HomeWork1;

import java.util.Scanner;

public class calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Введите один оператор (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println("Ошибка! Неверный оператор!");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        sc.close();
    }
}
