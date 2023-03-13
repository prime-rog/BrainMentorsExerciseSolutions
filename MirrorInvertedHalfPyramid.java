import java.util.Scanner;

public class MirrorInvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines- ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int k = i; k >= 0; k--) {
                System.out.print("  ");
            }
            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
