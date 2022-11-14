package Lab5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first argument");
        int args1 = scanner.nextInt();

        System.out.println("Input second argument");
        int args2 = scanner.nextInt();

        TestClass withoutArgs = new TestClass();
        TestClass withOneArgs = new TestClass(args1);
        TestClass withTwoArgs = new TestClass(args1, args2);
    }
    static class TestClass {
        private int num1, num2;
        TestClass() {
            System.out.println("with 0 args: sum = 0");
        }
        TestClass(int n1) {
            this.num1 = n1;
            System.out.printf("with 1 args: sum = %d%n", sumOneArgs(n1));
        }
        TestClass(int n1, int n2) {
            this.num1 = n1;
            this.num2 = n2;
            System.out.printf("with 2 args: sum = %d%n", sumTwoArgs (n1, n2));
        }
        private int sumOneArgs (int n1) {
            this.num1 = n1;
            return n1 + n1;
        }
        private int sumTwoArgs(int n1, int n2) {
            this.num1 = n1;
            this.num2 = n2;
            return n1 + n2;
        }
    }
}