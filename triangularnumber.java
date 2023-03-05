//   Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HomeWork1;

import java.util.Scanner;

public class triangularnumber {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.printf("Введите n: ");
      int n = sc.nextInt();
      int sNum = 0;
      int factorial = 1;
      
      // Вычисляем сумму чисел от 1 до n
      for (int i = 1; i <= n; i++) {
        sNum += i;
      }
      
      // Вычисляем n!
      for (int i = 1; i <= n; i++) {
        factorial *= i;
      }
      
      System.out.println("Сумма чисел " + n + " = " + sNum);
      System.out.println("Факториал " + n + "! = " + factorial);
      sc.close();

    }
  }
