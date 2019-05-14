public class test {

    public static void main(String[] args) {

        int[] zahlen = {45,34, 23, 42, 65, 93, 82, 72, 84};

        int[] modzahlen = new int[zahlen.length];

        int n = 1;
        boolean set = false;

        while(n != 100){

            for (int i = 0; i < modzahlen.length; i++) {
                modzahlen[i] = 0;
            }

            for (int i = 0; i < zahlen.length; i++) {
                modzahlen[i] = zahlen[i] % n;
            }
            for (int i = 0; i < modzahlen.length; i++) {
                for (int j = 0; j < modzahlen.length; j++) {
                    if(modzahlen[i] == modzahlen[j]){
                        set = true;
                    }
                }
            }
            if(!set){
                System.out.println(n);
            }

            n++;

        }






    }


}
