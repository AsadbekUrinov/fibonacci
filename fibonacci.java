import java.util.Scanner;

public class Fibonacci {
    // Fibonacci sonlarini hisoblash (iterativ usul)
    public static int[] fibonacci(int n) {
        if (n <= 0) {
            return new int[0];
        } else if (n == 1) {
            return new int[]{0};
        } else if (n == 2) {
            return new int[]{0, 1};
        } else {
            int[] fibSequence = new int[n];
            fibSequence[0] = 0;
            fibSequence[1] = 1;
            for (int i = 2; i < n; i++) {
                fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
            }
            return fibSequence;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci sonlari uchun tartib raqamini kiriting: ");
        int n = scanner.nextInt();
        int[] result = fibonacci(n);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
