public class moveAllZerosToLast {

    public static void main(String[] args) {
        int[] nums = Array_Utility.arrayinput();
        int[] answer = moveZeroes(nums);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    public static int[] moveZeroes(int[] nums) {
        // write your code here
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
