package tasks;

/**
 * The double factorial, symbolized by two exclamation marks (!!), is a quantity defined for all integer s greater than or equal to -1. For an even integer n , the double factorial is the product of all even integers less than or equal to n but greater than or equal to 2. For an odd integer p , the double factorial is the product of all odd integers less than or equal to p and greater than or equal to 1. The double factorial values of 0 and -1 are defined as equal to 1. Double factorial values for integers less than -1 are not defined.
 * <p/>
 * Mathematically, the formulas for double factorial are as follows. If n is even, then
 * <p/>
 * n !! = n ( n - 2)( n - 4)( n - 6) ... (4)(2)
 * <p/>
 * If p is odd, then
 * <p/>
 * p !! = p ( p - 2)( p - 4)( p - 6) ... (3)(1)
 * <p/>
 * If q = 0 or q = -1, then q !! = 1 by convention.
 * <p/>
 * The double factorial is mainly of interest to number theorists. It occasionally arises in statistics, combinatorics, calculus, and physics. Compare factorial .
 */
public class DoubleFactorial_8 {


    public static void main(String[] strings) {
        DoubleFactorial_8 doubleFactorial_8 = new DoubleFactorial_8();
        System.out.println(doubleFactorial_8.factorial(9));

    }


    private int factorial(int n) {

        if (n == 0 || n == -1)  //this is by conventions !
            return 1;

        int result = 1;

        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                result = i * result;
            }
        } else {
            for (int i = 3; i <= n; i += 2) {
                result = result * i;
            }
        }
        return result;
    }


}
