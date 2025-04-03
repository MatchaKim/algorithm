import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int su = 0;
        for(int i=a; i<=b; i++){
            if(onj(i)) su ++;
        }

        System.out.println(su);
    }
    public static boolean onj(int su) {
        boolean cond1 = su % 2 == 0;
        boolean cond2 = su % 10 == 5;
        boolean cond3 = su % 3 == 0 && su % 9 != 0;
        if(!(cond1 || cond2 || cond3)) return true;
        return false;
    }
}