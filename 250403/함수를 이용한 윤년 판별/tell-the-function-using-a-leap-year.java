import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // Please write your code here.
        System.out.println(isYoon(y));
        

    }

    public static boolean isYoon (int y){
        if(y%100==0 && !(y%400==0)) return false;
        if(y%4==0) return true;
        return false;
    }
}