import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int f = getVal(n);
        System.out.println(f);
    }
    public static int getVal(int su){
        int hap=0;
        for(int i=1; i<=su; i++ ){
            hap+=i;
        }
        return hap/10;
    }
}