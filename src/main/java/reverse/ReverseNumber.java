package reverse;

public class ReverseNumber {
    private int result;

    public ReverseNumber() {
        result = 0;
    }

    public void reverseRecurs(int number) {
        Operationable operation;
        operation = (x, y) -> x + (y % 10);

        if (number != 0) {
            result *= 10;
            result = operation.calculate(result, number);
            number /= 10;
            reverseRecurs(number);
        } else {
            return;
        }
    }
    public void reverseNoRecurs(int number) {
        Operationable operation;
        operation = (x, y) -> x + (y % 10);

        while(number != 0) {
            result *= 10;
            result = operation.calculate(result, number);
            number /= 10;
        }
    }

    interface Operationable {
        int calculate(int x, int y);
    }

    public int getResult() {
        return result;
    }
    public void resetResult() {
        result = 0;
    }
}
