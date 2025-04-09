import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        if(mainLogic(a,b)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        


    }

    public static boolean isYeonsok(int[] arr1,int[] arr2){
        for(int i=0; i<arr2.length; i++){
            if(arr2[i]!=arr1[i]) return false;
        }
        return true;
    }

    public static int[] extractSame(int index,int[] arr,int cnt){
        int[] etd = new int[cnt];
        int now = 0;
        for(int i=0; i<cnt; i++){
            etd[now] = arr[i+index];
            now++;
        }

        return etd;
    }

    public static boolean mainLogic(int[] 긴거, int[] 짧은거){
        for(int i = 0; i< 짧은거.length; i++){
            if(긴거[i]==짧은거[0]){
                int[] etd = extractSame(i,긴거,짧은거.length);
                if(isYeonsok(etd,짧은거))return true;
            }
        }
        return false;
    }
    
}