import java.util.*;

class Ques3 {
    public static void main(String[] args) {
        // Write a java program to convert days into years, weeks and days. Take days as
        // an input through command line.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Days--");
        int days = sc.nextInt();
        int year = days / 365;
        int remday = days % 365;
        int weeks = remday / 7;
        remday = remday % 7;
        System.out.println("No of years-" + year + " No of weeks- " + weeks + " No of days- " + remday);
        sc.close();
    }
}