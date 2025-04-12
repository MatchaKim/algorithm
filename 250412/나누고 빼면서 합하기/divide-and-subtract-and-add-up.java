import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int sum = 0;

        while(m!=1){
            if(isEven(m)){
                sum+=arr[m];
                m=m/2;
            }else{
                sum+=arr[m];
                m=m-1;
            }
        }
        sum+=arr[1];
        System.out.println(sum);
    }


    public static boolean isEven(int su ){
        if(su%2==0){
            return true;
        }else{
            return false;
        }
    }
}