public class snapchatStreak {
    public static void main(String[] args) {
        System.out.println("You must want to input two array and both array size should be same !!!");
        int[] array = Array_Utility.arrayinput();
        int[] array2 = Array_Utility.arrayinput();
        int count = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array2[i] > 0) {
                count++;
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println("The streak is the snapchat is : " + max);
    }
}
