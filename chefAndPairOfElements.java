public class chefAndPairOfElements {
    public static void main(String[] args) {
        int [] nums = Array_Utility.arrayinput();
        int [] answer = findPair(nums, 7);
        System.out.println("The indices are :");
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
    public static int[] findPair(int[] nums, int target) {
    // Write your code here
    int [] array = new int[2];
    for(int i =0;i<nums.length;i++){
        for(int j=0;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                array[0]=j;
                array[1]=i;
                break;
            }
        }
    }
    return array;
}
}
