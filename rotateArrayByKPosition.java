import java.util.Scanner;

public class rotateArrayByKPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = Array_Utility.arrayinput();
        System.out.println("Enter K: ");
        int k = input.nextInt();
        int[] ans = rotateArray(array, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(array[i] + " ");
        }
        input.close();
    }

    public static int[] rotateArray(int[] array, int k) {

        k = k % array.length; // fixes for bigger k value than the array length;

        int start = 0;
        int last = array.length - 1;
        while (start < last) {
            int temp = array[start];
            array[start] = array[last];
            array[last] = temp;
            start++;
            last--;
        }

        int star = 0;
        int las = k - 1;
        while (star < las) {
            int tem = array[star];
            array[star] = array[las];
            array[las] = tem;
            star++;
            las--;
        }

        int sta = k;
        int la = array.length - 1;
        while (sta < la) {
            int te = array[sta];
            array[sta] = array[la];
            array[la] = te;
            sta++;
            la--;
        }

        return array;
    }
}
