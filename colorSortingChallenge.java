public class colorSortingChallenge {
    public static void main(String[] args) {
        int[] array = Array_Utility.arrayinput();
        sortColors(array);
    }

    public static void sortColors(int[] nums) {
        // write code...
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

        }
        System.out.println("TOUR CORRECTED ARRRAY IS : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);

        }
    }
}
