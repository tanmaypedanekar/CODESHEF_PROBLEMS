public class removeDuplicate {
    public static void main(String[] args) {
        int[] array = Array_Utility.arrayinput();
        removeDuplicates(array);
    }

    public static void removeDuplicates(int[] nums) {
        // code here...
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[count] = nums[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
