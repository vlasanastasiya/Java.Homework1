// Реализовать простой калькулятор
import java.util.Scanner;
public class task3 {   
    static String getOp() {
        Scanner scan = new Scanner(System.in);
        String opr = scan.nextLine();
        scan.close(); 
        return opr;

    }
    static int Calculator(String opr, int a, int b) {
        int calc = 0;
        switch (opr) {
            case "+":
                calc = a + b;
                break;
            case "-":
                calc = a - b;
                break;
            case "*":
                calc = a * b;
                break;
            case "/":
                calc = a / b;

            default:
                System.out.println("Введите нужное действие: +, -, *, /");
                break;
        }
        return calc;

    }

    public static void main(String[] args) {
        int a = 3;
        System.out.println("Введите нужное действие: +, -, *, /");
        String opr = getOp();
        int b = 3;
        int calc = Calculator(opr, a, b);
        System.out.printf("%d %s %d = %d", a, opr, b, calc);

    }

}

