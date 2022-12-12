// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter number: ");
        int number = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", num(number));
        iScanner.close();
    }

    public static int num(int a) {
        return (a * (a + 1)) / 2;
    }
}