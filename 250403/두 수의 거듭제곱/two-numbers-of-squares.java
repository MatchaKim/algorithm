import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int su=1;
        for(int i =1; i<=b; i++){
            su *= a;
        }
        System.out.println(su);
    }
}