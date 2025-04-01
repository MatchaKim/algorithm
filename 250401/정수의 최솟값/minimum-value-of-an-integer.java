import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.

        int fir = min(a,b);
        int sec = min(fir, c);

        System.out.println(sec);

    }
    public static int min(int fr, int se){
        if(fr<se){
            return fr;
        }else{
            return se;
        }
    }
}