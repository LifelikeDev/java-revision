package strategy_design_pattern;

public class MultiplicationStrategy implements CalculatorStrategy {
    @Override
    public float calculate(int numOne, int numTwo) {
        return numOne * numTwo;
    }
}
