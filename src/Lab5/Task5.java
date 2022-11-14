package Lab5;

public class Task5 {
    public static void main(String[] args) {
        TestClass example = new TestClass(21);
        System.out.println(example.printValue());

        example.setValue(15);
        System.out.println(example.printValue());

        example.setValue(125);
        System.out.println(example.printValue());

        example.setValue(-15);
        System.out.println(example.printValue());

        example.setValue();
        System.out.println(example.printValue());
    }

    static class TestClass {
        private int int1;

        TestClass(int int1) {
            this.setValue(int1);
        }

        public void setValue(int n) {
            this.int1 = n;
            if (n >= 100) {
                this.int1 = 100;
            } else if (n <= 0) {
                this.int1 = 0;
            }
        }

        public void setValue() {
            this.int1 = 0;
        }

        public int printValue() {
            return this.int1;
        }
    }
}