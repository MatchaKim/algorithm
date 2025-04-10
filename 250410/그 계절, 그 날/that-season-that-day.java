import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        isValid(y,m,d);
    }
    public static boolean isYoon(int y){
        if(y%4==0 && y%100==0 && y%400==0){return true;}
        if(y%4==0 && y%100==0 ){return false;}
        if(y%4==0){return true;}

        return false; 
    }
    public static void isValid(int y,int m,int d){
        if(getFullDays(y,m,d)>=d && m<13){
            printSeason(m);
        }else{
            System.out.println(-1);
        }
    }
    public static int getFullDays(int y,int m,int d){
        if(isYoon(y) && m==2) {return 29;}
        if(m==2) {return 28;}

        if(m<=7 && isOdd(m)) {return 31;}
        if(m>7 && isEven(m)) {return 31;}

        return 30;

    }
    public static boolean isEven(int su){
        if(su%2==0) return true;

        return false;
    }
     public static boolean isOdd(int su){
        if(su%2==1) return true;

        return false;
    }
    public static void printSeason(int y){
        if(3<=y && 5>=y ){
System.out.println("Spring");
        }else if(3<=y && 5>=y ){
System.out.println("Summer");
        }else if(9<=y && 11>=y ){
System.out.println("Fall");
        }else{
            System.out.println("Winter");
        }
    }      
}