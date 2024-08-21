import java.util.ArrayList;

public class essai {
    public static void main(String[] args) {
        // System.out.println(sum(5, 9));
        // System.out.println(isEven(5));
        System.out.println(factorielle(5));
        System.out.println(multiply(8, 2));
        System.out.println(multiply(2.5, 11.25));
        System.out.println( reverseString("fou"));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int x) {
        boolean isEven = false;
        if (x % 2 == 0) {
            isEven = true;
        } else {
            isEven = false;
        }
        return isEven;
    }

    public static int factorielle(int x) {
        int res=0;
        for (int i = 0; i < x; i++) {
            res = res*i;
        }
        return res;
    }
    public static int multiply(int a, int b){
        return a*b;
    
    }
    public static double multiply(double a, double b){
        return a*b;
    }
    public static String reverseString(String str){
    String s="";
    for (int i=str.length()-1; i>=0;i--){
      s+=str.charAt(i);
    }
        return s;
    }


}
