package Lab5;

public class Task6 {
    public static void main(String[] args) {
        TestClass first = new TestClass(2, 5);
        first.printValue();

        TestClass second= new TestClass(1);
        second.printValue();

        second.setValue(3, 15);
        second.printValue();

        second.setValue(-9);
        second.printValue();
    }

    static class TestClass {
        private static int min;
        private static int max;
        TestClass(int n1, int n2) {
            min = Math.min(n1, n2);
            max = Math.max(n1, n2);
        }
        TestClass(int n) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        public void setValue(int n1, int n2) {
            min = Math.min(Math.min(n1, min), n2);
            max = Math.max(Math.max(n1, max), n2);
        }
        public void setValue(int n) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        public void printValue() {
            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }
    }
}