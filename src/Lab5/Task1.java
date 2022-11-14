package Lab5;

public class Task1 {
    public static void main(String[] args) {
        TestClass Test = new TestClass();
        Test.setValue('X');
        Test.viewCode();
    }

    static class TestClass {
        private char ch;

        public void setValue(char ch1) {
            this.ch = ch1;
        }

        public int getCodeSymbol() {
            return this.ch;
        }

        public void viewCode() {
            System.out.printf("char = %c (code: %d)%n", ch, getCodeSymbol());
        }
    }
}