import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ü3 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(change(sc.nextLine()));


    }



    public static String change(String s){

         s = s.replace('.', '!');
        String[] x = s.split(" ");
        String p1 = x[0];
        String p2 = x[1];



        return p2.concat(" "+ p1).toUpperCase();


    }
}
