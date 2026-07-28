
public class binaryArraySorting {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
    System.out.println("ENTER A BINARY ARRY : ");
    int [] array = Array_Utility.arrayinput();
    int []sortedArray = sortBinaryArray(array);
       for(int i=0;i<sortedArray.length;i++){
        System.out.print(sortedArray[i]+" ");
       }

    }
    public static int []sortBinaryArray(int [] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
            if(array[j]>array[j+1]){
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
       
    }
     return array;
}
}
