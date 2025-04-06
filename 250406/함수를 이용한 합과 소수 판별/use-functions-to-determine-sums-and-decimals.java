import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for(int i = a ; i<= b ; i++){
            if(sosu(i)&&hapzzak(i)){{
                cnt++;
            }}
        }

        System.out.println(cnt);
        

    }

    public static boolean sosu(int su){
        if(su==1) return false;
        if(su==2) return true;
        for(int i=2; i<su; i++){
            if(su%i==0){return false;}
        }
        return true;
    }


    public static boolean hapzzak(int su) {
        String suString = String.valueOf(su);
        char[] arr = suString.toCharArray();
        int hap = 0;
        for (char c : arr) {
            hap += Character.getNumericValue(c);
        }
        return hap % 2 == 0;
    }
}