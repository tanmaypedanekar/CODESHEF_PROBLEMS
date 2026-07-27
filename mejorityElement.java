class mejorityElement {
    public static void main(String[] args) {
        int []arr = Array_Utility.arrayinput();
        int answer = majorityElement(arr);
        System.out.println("MEJORITY ELEMENT IN YOUR ARRAY IS : "+ answer);
    }
    public static int majorityElement(int[] arr) {

        int max = 0;
        int topMax = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                topMax = arr[i];
            }
        }

        return topMax;
    }
}