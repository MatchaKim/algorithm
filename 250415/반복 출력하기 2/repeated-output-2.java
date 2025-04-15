import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printHelloWorld(n);
    }
    public static void printHelloWorld(int i ){
        if(i==0) return;
        System.out.println("HelloWorld");
        printHelloWorld(i-1);
    }
}