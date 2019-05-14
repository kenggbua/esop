public class Ü6 {


    public static void main(String[] args) {
        String x = "Auge um Auge - und und die ganze Welt wird blind sein.";


        String[] z = removeDuplicate(x);

        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }
    }

    public static String[] removeDuplicate(String x){


        String[] split = x.split(" ");

        int count = split.length;

        for (int i = 0; i < split.length; i++) {
            if(split.length-1 == i){

            }else if(split[i].equals(split[i+1])){
            count--;
            }
        }

        String[] test= new String[count];

        count = 0;



        for (int i = 0; i < split.length; i++) {
            if(split.length-1 == i){
                test[count] = split[i];
                return test;
            }
            if(split[i].equals(split[i+1])){

            }else {
                test[count] = split[i];
                count++;
            }
        }
        return test;


    }


}
