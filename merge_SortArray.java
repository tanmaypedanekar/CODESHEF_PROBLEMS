import java.util.Scanner;

public class merge_SortArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("This is for first array :");
        int[] array1 = Array_Utility.arrayinput();
        System.out.println("This is for second array :");
        int[] array2 = Array_Utility.arrayinput();

        int[] mergedArray = mergeTwoArray(array1, array2);
        int[] sortedNewarray = sortedArray(mergedArray);
        System.out.println("YOUR MERGED AND SORTED ARRAY ARE PRESENT HERE : ");
        for (int i = 0; i < sortedNewarray.length; i++) {
            System.out.print(sortedNewarray[i] + " ");
        }
        input.close();
    }

    public static int[] mergeTwoArray(int[] array1, int[] array2) {
        int[] mergedarray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            mergedarray[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            mergedarray[i + array1.length] = array2[i];
        }

        return mergedarray;

    }

    public static int[] sortedArray(int[] mergedArray) {

        for (int i = 0; i < mergedArray.length - 1; i++) {
            for (int j = 0; j < mergedArray.length - 1; j++) {
                if (mergedArray[j] > mergedArray[j + 1]) {
                    int temp = mergedArray[j];
                    mergedArray[j] = mergedArray[j + 1];
                    mergedArray[j + 1] = temp;
                }
            }
        }
        return mergedArray;
    }
}