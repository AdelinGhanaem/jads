package tasks;

/**
 */
public class ReversePrinter_2 {


    public static void main(String[] args) {


        int n = 654;

        String s = new StringBuilder(String.valueOf(n)).reverse().toString();

        System.out.println("Reversed Order: " + s);

        for (int i = n; i >= 0; i--) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
