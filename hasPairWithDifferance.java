
// code for take a array A ,  differance of any two element B, 
// return 1 if the any two elements have differnace is B or return 0;
import java.util.Scanner;

class hasPairWithDifferance {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = Array_Utility.arrayinput();
        System.out.println("Enter a differance that you want to see : ");
        int diff = input.nextInt();
        int ans = hasPairWithDifference(array, diff);
        System.out.println(ans);

        input.close();
    }

    public static int hasPairWithDifference(int[] A, int B) {

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (Math.abs(A[i] - A[j]) == B) {
                    return 1;
                }
            }

        }
        return 0;
    }

}