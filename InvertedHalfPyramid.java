import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines- ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
