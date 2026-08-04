// code for finding the minimum differance between two elements in an array.
public class closestPair {
    public static void main(String[] args) {
        int[] array = Array_Utility.arrayinput();
        int ans = closestOne(array);
        System.out.println(ans);
    }

    public static int closestOne(int[] array) {
        int diff = 0;
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < array.length; j++) {
            for (int i = j + 1; i < array.length; i++) {
                diff = Math.abs(array[j] - array[i]);

                if (diff < min) {
                    min = diff;
                }
            }
        }
        return min;
    }
}
