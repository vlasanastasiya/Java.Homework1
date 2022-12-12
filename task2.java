// Вывести все простые числа от 1 до 1000
public class task2 {
    public static void main(String[] args) {
    int numberber = 1000;
    int count = 0;
    for (int i = 2; i < numberber; i++) {
        boolean a = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                a = false;
                break; 
            }
        }
        if (a) {
            count++;
            System.out.print(i + ", ");
        }
    }
}
}

