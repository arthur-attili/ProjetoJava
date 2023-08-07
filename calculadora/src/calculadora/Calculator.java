package calculadora;

public class Calculator {
    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double num1, double num2) {
        return operation.performOperation(num1, num2);
    }
}
