import java.util.Scanner;

public class costOfGroceries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int[] array = Array_Utility.arrayinput();
        System.out.println("Enter the freshness value : ");
        int freash = input.nextInt();
        int[] array2 = Array_Utility.arrayinput();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= freash) {
                sum += array2[i];
            }
        }
        System.out.println("The cost of fresh groceries Is : " + sum);
        input.close();
    }
}
