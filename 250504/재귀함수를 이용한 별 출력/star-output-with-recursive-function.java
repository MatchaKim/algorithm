import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        printFirst(n);
    }
    public static void printFirst(int su){
    if(su==0)return;

    printFirst(su-1);

    for(int i = 0; i<su; i++){
        System.out.print("*");
    }
    System.out.println("");
    }
}