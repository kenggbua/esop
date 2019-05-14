import java.util.Scanner;

public class Ü1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x = sc.next();

        String y = " ab cde fg ";

        System.out.println(y);

        String s = y.trim();

        System.out.println(s);

        String o = y.substring(3);
        System.out.println(o);

        String[] v = y.split("b");

        String part1 = v[0];
        String part2 = v[1];

        System.out.println(part1);
        System.out.println(part2);

        System.out.println(v);


        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i) == 'a'){

                System.out.println(i+1);


            }
        }

        System.out.println(x.indexOf("abc"));
        System.out.println(x.startsWith("a"));
        System.out.println(x.charAt(x.length()-1));



    }


}
