import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        int su = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(n%i==0 && m%j==0 && i==j){
                    su = i;
                }
            }
        }

        System.out.println(su);

    }
}