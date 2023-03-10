public class Ques1 {
    public static void main(String[] args) {
        // Q1. Write a Java program to build a calculator to perform all
        // arithmetic operations where you have to take input through command line.
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        if (args[1].equals("+")) {
            System.out.println(a + b);
        }
        if (args[1].equals("-")) {
            System.out.println(a - b);
        }
        if (args[1].equals("*")) {
            System.out.println(a * b);
        }
        if (args[1].equals("/")) {
            System.out.println(a / b);
        }
    }

}
