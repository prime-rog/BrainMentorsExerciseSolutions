import java.util.*;

public class OddStarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines- ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j >= 0; j--)
                System.out.print(" ");
            for (int k = 0; k <= i; k++)
                System.out.print("* ");

            System.out.println();
        }
        for (int i = n; i <= 0; i--) {
            System.out.println("am,a");
            for (int j = n - i - 1; j >= 0; j--)
                System.out.print(" ");
            for (int k = 0; k <= i; k++)
                System.out.print("* ");

            System.out.println();
        }

    }
}
