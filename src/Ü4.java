import java.util.Scanner;

public class Ü4 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();

        char[] y = x.toCharArray();

        System.out.println(isPalindrom(y));
    }


    public static boolean isPalindrom(char[] x){

        if(x.length % 2 == 0){
            for (int i = 0; i < x.length - 1; i++) {
                if(x[i] != x[x.length-1-i]){
                    return false;
                }
            }

        }

        return true;


    }

}
