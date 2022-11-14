package Lab5;

public class Task2 {
    public static void main(String[] args) {
        TestClass Test = new TestClass();
        TestClass Test2 = new TestClass();

        Test.setChValue('A', 'D');
        Test.showCharArray();
        System.out.println();
        Test2.setChValue('V', 'Z');
        Test2.showCharArray();
    }

    static class TestClass extends Task2 {
        private char ch1, ch2;
        protected void setChValue(char ch1, char ch2) {
            this.ch1 = ch1;
            this.ch2 = ch2;
        }
        protected void showCharArray() {
            int int1 = this.ch1;
            int int2 = this.ch2;

            if (int1 > int2) {
                int1 = this.ch2;
                int2 = this.ch1;
            }

            for (int i = int1; i <= int2; i++) {
                System.out.print((char)i);
            }
        }
    }
}