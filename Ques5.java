import java.util.*;

class Ques5 {
    public static void main(String[] args) {
        // Write a java program to convert username into proper case. Take input through
        // command line.
        // For example
        // - Input : rAm KUmar shARma
        // - Output : Ram Kumar Sharma
        // Hint : Use String class methods
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username -- ");
        String name = sc.nextLine();
        String arr[] = name.split(" ");
        for (int i = 0; i < arr.length; i++) {
            char aim = Character.toUpperCase(arr[i].charAt(0));
            arr[i] = aim + arr[i].substring(1).toLowerCase();
        }
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans = ans + arr[i] + " ";
        }
        System.out.println(ans);
        sc.close();

    }
}