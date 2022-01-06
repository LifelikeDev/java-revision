package strategy_design_pattern;

public class CalculatorContext {
    CalculatorStrategy calculatorStrategy;

    public void setCalculatorStrategy(CalculatorStrategy calculatorStrategy) {
        this.calculatorStrategy = calculatorStrategy;
    }

    public float performCalculation(int numOne, int numTwo) {
        return this.calculatorStrategy.calculate(numOne, numTwo);
    }
}
