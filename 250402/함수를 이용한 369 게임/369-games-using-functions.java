import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        for(int i=A; i<=B; i++ ){
            int[] su = seper(i);
             for (int digit : su) {
                if (is369(digit) || i %3==0) {
                    cnt++;
                    break; 
                }
            }
        }
        System.out.println(cnt);
    }

public static int[] seper(int su) {
    int[] arr = new int[7];
    int i = 0;
    while (su > 0 && i < 7) {
        arr[i] = su % 10;
        su /= 10;
        i++;
    }
    return arr;
}


    public static boolean is369(int su){
        if(su==3||su==6||su==9){
            return true;
        }else{
            return false;
        }
    }
}