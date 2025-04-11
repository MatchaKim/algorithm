import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.

        char[] textArray = text.toCharArray();
        char[] patternArray = pattern.toCharArray();

        for(int i=0; i<textArray.length; i++){
            if(textArray[i]==patternArray[0]){
                if(textArray.length - i < patternArray.length) {
                    System.out.println(-1);
                    return;
                };
                if(isSame(i, patternArray, textArray)){
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(-1);

    }

    public static boolean isSame(int index, char[] patternArray,char[] textArray){
        for(int j=index; j < patternArray.length + index ; j++){ 
            if(patternArray[j-index]!=textArray[j]){
                return false;
            }
        }
        return true;
    }

}