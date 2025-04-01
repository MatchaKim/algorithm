import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        if(isZZak(n)&&is5(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean isZZak(int su){
        if(su%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean is5(int su){
        if((su/10+su%10)%5==0){
            return true;
        }else{
            return false;
        }
    }
}