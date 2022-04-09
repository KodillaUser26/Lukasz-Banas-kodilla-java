package calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum();
        calculator.sub();
        if (calculator.sum() == 15) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        if (calculator.sub() == 1) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
class Calculator{
        int a = 8;
        int b = 7;
        public int sum(){
            return a+b;
        }
        public int sub(){
            return a-b;
        }
}
