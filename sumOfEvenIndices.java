import java.util.Scanner;

public class sumOfEvenIndices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = Array_Utility.arrayinput();
        System.out.println("Enter the value of k : ");
        int k = input.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] > k * 2) {
                sum = sum + array[i];
            }
        }

        System.out.println("The sum of the even indices are : " + sum);
        input.close();
    }
}
