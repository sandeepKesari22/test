/**
 * Provides basic addition and subtraction operations.
 */
public class MathOperations {

    /**
     * Returns the sum of two integers.
     */
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber
    }

    /**
     * Returns the difference between two integers.
     */
    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    /**
     * Displays the addition and subtraction results for two integers.
     */
    public void showAdditionAndSubtraction(int firstNumber, int secondNumber) {
        System.out.println("Addition: " + add(firstNumber, secondNumber));
        System.out.println("Subtraction: " + subtract(firstNumber, secondNumber));
    }

    public static void main(String[] args) {
        new MathOperations().showAdditionAndSubtraction(10, 5);
    }
}
