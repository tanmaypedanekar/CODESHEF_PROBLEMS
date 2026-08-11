import java.util.Scanner;

public class LinearSearchInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        char num = sc.next().charAt(0);

        boolean found = false;

        for (int i = 0; i < n.length(); i++) {

            if (n.charAt(i) == num) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println(-1);
        }
        sc.close();
    }

}
