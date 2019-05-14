public class Ü2 {

    public static void main(String[] args) {

        System.out.println(endsWithQuestuinMark("abdafgadfga?"));


    }



    public static boolean endsWithQuestuinMark(String text){

        if(text.charAt(text.length()-1) == '?'){
            return true;
        }else return false;

    }
}
