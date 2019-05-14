import java.util.Scanner;

public class Ü5 {

    final static String a = ".-";
    final static String b = "-...";
    final static String c = "-.-.";
    final static String d = "-..";
    final static String e = ".";
    final static String f = "..-.";
    final static String g = "--.";
    final static String h = "....";
    final static String i1 = "..";
    final static String j = ".---";
    final static String k = "-.-";
    final static String l = ".-..";
    final static String m = "--";
    final static String n = "-.";
    final static String o = "---";
    final static String p = ".--.";
    final static String q = "--.-";
    final static String r = ".-.";
    final static String s = "...";
    final static String t = "-";
    final static String u = "..-";
    final static String v = "....-";
    final static String w = ".--";
    final static String x1 = "-..-";
    final static String y = "-.--";
    final static String z = "--..";


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x = "test";

        x = toMorsecode(x);

        System.out.println(x);


    }

    public static String toMorsecode(String x){
        String morse = "";

        for (int i = 0; i < x.length(); i++) {
            switch (x.charAt(i)){
                case 'a':
                   morse = morse.concat(a + " ");
                    break;

                case 'b':
                    morse =morse.concat(b + " ");
                    break;

                case 'c':
                    morse =  morse.concat(c + " ");
                    break;

                case 'd':
                    morse =  morse.concat(d + " ");
                    break;

                case 'e':
                    morse = morse.concat(e + " ");
                    break;

                case 'f':
                    morse = morse.concat(f + " ");
                    break;

                case 'g':
                    morse =  morse.concat(g + " ");
                    break;

                case 'i':
                    morse =  morse.concat(i1 + " ");
                    break;

                case 'h':
                    morse = morse.concat(h + " ");
                    break;

                case 'j':
                    morse = morse.concat(j + " ");
                    break;

                case 'k':
                    morse = morse.concat(k + " ");
                    break;

                case 'l':
                    morse = morse.concat(l + " ");
                    break;

                case 'm':
                    morse = morse.concat(m + " ");
                    break;

                case 'n':
                    morse =  morse.concat(n + " ");
                    break;

                case 'o':
                    morse = morse.concat(o + " ");
                    break;

                case 'p':
                    morse = morse.concat(p + " ");
                    break;

                case 'q':
                    morse = morse.concat(q + " ");
                    break;

                case 'r':
                    morse = morse.concat(r + " ");
                    break;

                case 's':
                    morse = morse.concat(s + " ");
                    break;

                case 't':
                    morse = morse.concat(t + " ");
                    break;

                case 'u':
                    morse =  morse.concat(u + " ");
                    break;

                case 'v':
                    morse = morse.concat(v + " ");
                    break;

                case 'w':
                    morse = morse.concat(w + " ");
                    break;

                case 'x':
                    morse =   morse.concat(x1 + " ");
                    break;

                case 'y':
                    morse = morse.concat(y + " ");
                    break;

                case 'z':
                    morse = morse.concat(z + " ");
                    break;









            }
        }

        return morse;



    }


}
