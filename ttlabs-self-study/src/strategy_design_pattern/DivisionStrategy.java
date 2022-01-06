package strategy_design_pattern;

public class DivisionStrategy implements CalculatorStrategy {
    @Override
    public float calculate(int numOne, int numTwo) {
        return (float)(numOne / numTwo);
    }
}
