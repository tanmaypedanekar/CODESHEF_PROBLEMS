import java.util.Arrays;

public class maximumCommonTwoArray {
    public static void main(String[] args) {
        int[] array = Array_Utility.arrayinput();
        int[] array2 = Array_Utility.arrayinput();
        int answer = maxElement(array, array2);
        System.out.println("maximum common element is : " + answer);
    }

    public static int maxElement(int[] array, int[] array2) {
        Arrays.sort(array);
        Arrays.sort(array2);

        int i = 0;
        int j = 0;
        int count = 0;

        while (i < array.length && j < array2.length) {

            if (array[i] == array2[j]) {
                count++;
                i++;
                j++;
            } else if (array[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return count;
    }

}
