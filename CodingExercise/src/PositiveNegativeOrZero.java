public class PositiveNegativeOrZero {

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-10);
        checkNumber(0);
    }

    public static void checkNumber(int number) {
        String numberStatus = "zero";
        if (number > 0) {
            numberStatus = "positive";
        } else if (number < 0) {
            numberStatus = "negative";
        }
        System.out.println(numberStatus);
    }
}
