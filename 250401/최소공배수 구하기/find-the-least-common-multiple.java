import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int su = 1;
        while(!((su*n)%n==0 & (su*n)%m==0)){
            su++;
        }
        System.out.println(su*n);
    }
}