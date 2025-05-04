import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printFirst(n);
        System.out.println("");
        printLast(n);
    }

    public static void printFirst(int su){
        if(su==0)return;

        printFirst(su-1);
        System.out.print(su+" ");
    }
    
    public static void printLast(int su){
        if(su==0)return;

        System.out.print(su+" ");
        printLast(su-1);
    }
}