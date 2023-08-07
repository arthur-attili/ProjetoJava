package calculadora;

public class Main {
    public static void main(String[] args) {
        Calculator additionCalculator = new Calculator(new Addition());
        Calculator subtractionCalculator = new Calculator(new Subtraction());
        Calculator multiplicationCalculator = new Calculator(new Multiplication());
        Calculator divisionCalculator = new Calculator(new Division());

        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Resultado da Adição: " + additionCalculator.calculate(num1, num2));
        System.out.println("Resultado da Subtração: " + subtractionCalculator.calculate(num1, num2));
        System.out.println("Resultado da Multiplicação: " + multiplicationCalculator.calculate(num1, num2));

        try {
            System.out.println("Resultado da Divisão: " + divisionCalculator.calculate(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
