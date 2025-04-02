import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        int cal = 0;
        for(int i = a; i<=b; i++){
            if(isPrime(i)){
                cal+=i;
            }
        }
    System.out.println(cal);

    }
    public static boolean isPrime(int su){
    if(su==2) return true;
    if(su==1) return false;
    for(int i = 2; i<su; i++){
        if(su%i==0){
            return false;
        }
    }
    return true;
    }
}