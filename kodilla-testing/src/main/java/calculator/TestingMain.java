package calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int calcAdd =  calculator.add(8,7);
        int calcSub = calculator.substract(8,7);
        if (calcAdd == 15) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        if (calcSub == 1) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}

