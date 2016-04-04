/**
 * Created by adelin.ghanayem@gmail.com
 */
public class Main {


    public static void main(String[] args) {
        int[] ints = {1, 1, 0, 1, 0, 0};


        System.out.println(solution(new int[]{60, 80, 40}, new int[]{2, 3, 5}, 5, 2, 200));


    }


    public static int solution(int[] A, int[] B, int M, int X, int Y) {


        int weight = 0;
        int numberOfPeople = 0;
        int peopleIndex = 0;
        int numberOfStops = 1;
        int elevatedPeople = 0;


        while (elevatedPeople < A.length) {

            while (weight < Y && peopleIndex < A.length) {
                if (weight + A[peopleIndex] > Y) {
                    break;
                } else {
                    weight += A[peopleIndex];
                    numberOfPeople++;
                    elevatedPeople++;
                }
                peopleIndex++;
            }


            for (int k = peopleIndex; k < numberOfPeople - 1; k++) {
                if (B[k] != B[k + 1]) {
                    numberOfStops++;
                }
            }

            numberOfStops++;//for returning back to the first floor;

        }

        return numberOfStops;
    }


    static int solution(int[] A) {
        int n = A.length;
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] == A[i + 1])
                result = result + 1;
        }
        int r = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            if (i > 0) {
                if (A[i - 1] != A[i])
                    count = count + 1;
                else
                    count = count - 1;
            }
            if (i < n - 1) {
                if (A[i + 1] != A[i])
                    count = count + 1;
                else
                    count = count - 1;
            }
            r = Math.max(r, count);
        }
        return result + r;
    }
}
