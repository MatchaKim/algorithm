import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if(m>12){
            System.out.println("No");
            return;
        }

        int fd = getFullDays(m);
        if(fd>=d){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
    public static int getFullDays(int month){
        if(month==2){
            return 28;
        }else if(month<7&&month!=2){
            if(isOdd(month)) return 31;
        }else{
            if(!isOdd(month)) return 31;
        }
        return 30;
    }
    public static boolean isOdd(int su){
        if(su%2==0){
            return true;
        }else{
            return false;
        }
    }
}