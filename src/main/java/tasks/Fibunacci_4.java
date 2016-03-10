package tasks;

/**
 */
public class Fibunacci_4 {


    public static void main(String[] args) {

        int n = 10;

        long[] longs = new long[n];


        long first = 0;
        long second = 1;

        for (int i = 0; i < n; i++) { // don't use recursion for Fibunacci
            longs[i] = first + second;
            first = second;
            second = longs[i];
        }


        for (long l : longs) {
            System.out.print(l + ",");
        }


    }


}
