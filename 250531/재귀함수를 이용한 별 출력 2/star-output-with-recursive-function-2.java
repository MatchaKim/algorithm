import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStars(n, true, n);
    }

    public static void printLine(int count) {
        if (count == 0) {
            System.out.println();
            return;
        }
        System.out.print("* ");
        printLine(count - 1);
    }

    public static void printStars(int current, boolean decreasing, int n) {
        if (current == 0 && decreasing) {
            printStars(1, false, n);
            return;
        }
        if (current > n && !decreasing) return;

        printLine(current);
        if (decreasing)
            printStars(current - 1, true, n);
        else
            printStars(current + 1, false, n);
    }
}
