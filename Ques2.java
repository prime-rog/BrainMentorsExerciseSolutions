import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        // Q2. Write a Java program to enter temperature in Celcius and convert it into
        // Fahrenheit. Take input through command line.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temprature into Celcius--");
        double Cel = sc.nextDouble();
        double fren = (Cel * 9 / 5) + 32;
        System.out.println("Temprature in Fahrenheit is -- " + fren);
        sc.close();

    }
}
