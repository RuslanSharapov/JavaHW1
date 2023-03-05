//  Вывести все простые числа от 1 до 1000

package HomeWork1;

public class primenumbers {
    public static void main(String[] args) {

        for(int i = 2; i <= 1000; i++) {
            boolean prime = true;

            // Проверка на простое число
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if(prime) {
                System.out.print(i + " ");
            }
        }
    }
}
