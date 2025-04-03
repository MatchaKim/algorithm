import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        int su=0;
        if(o=='+'){
           su= a+c;
        }else if(o=='-'){
           su= a-c;
        }else if(o=='/'){
           su= a/c;
        }else if(o=='*'){
           su= a*c;
        }else{
            System.out.println("False");
            return;
        }
        System.out.println(a+" "+o+" "+c+" = "+su);
    }
}