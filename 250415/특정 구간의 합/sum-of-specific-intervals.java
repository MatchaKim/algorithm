import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            System.out.println(hap(arr,a1,a2));
        }

    }

    public static int hap(int[] arr, int su1, int su2){
        int cnt = 0;
        for(int i=su1-1; i<=su2-1; i++){
            cnt+=arr[i];
        }
        return cnt;
    }

}