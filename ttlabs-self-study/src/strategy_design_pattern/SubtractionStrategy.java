package strategy_design_pattern;

public class SubtractionStrategy implements CalculatorStrategy {
    @Override
    public float calculate(int numOne, int numTwo) {
        return numOne - numTwo;
    }
}
