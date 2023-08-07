package calculadora;

public class Multiplication implements Operation {
    @Override
    public double performOperation(double num1, double num2) {
        return num1 * num2;
    }
}
