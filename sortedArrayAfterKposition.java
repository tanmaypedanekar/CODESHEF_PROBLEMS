public class sortedArrayAfterKposition {
    public static void main(String[] args) {
        int[] array = Array_Utility.arrayinput();
        cheakArray(array);

    }

    public static void cheakArray(int[] nums) {

        // write your code here
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i + 1 % nums.length] ){
                count++;
            }

        }

        if (count > 1) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

    }
}
