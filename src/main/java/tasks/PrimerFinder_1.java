package tasks;

/**
 */
public class PrimerFinder_1 {


    public static void main(String[] args) {
        PrimerFinder_1 primerFinder1 = new PrimerFinder_1();
        primerFinder1.isPrime(358891353);

        for (int i = 0; i < 25; i++) {
            if (primerFinder1.isPrime(i)) {
                System.out.println(i);
            }
        }
    }


    private boolean isPrime(int number) {
        if (number == 2) {    //2 is always prime
            return true;
        }
        if (number % 2 == 0) {// 2 is the only even prime number !
            return false;
        }


        for (int i = 3; i * i < number; i++) { // if (x % y) == 0 => x % (x/y) ==0 !
            // you don't need to check all number from 2 -> n
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
