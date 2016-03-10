package tasks;

/**
 *
 */
public class VowelsCheck_3 {


    public static void main(String[] args) {


        String someString = "The 1804 dollar is one of the rarest and most valuable American coins";


        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};


        for (int i = 0; i < someString.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (someString.charAt(i) == vowels[j]) {
                    System.out.print(someString.charAt(i) + ",");
                }
            }
        }


    }

}
