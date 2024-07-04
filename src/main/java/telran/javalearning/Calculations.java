package telran.javalearning;

public class Calculations
{
    public static int sum(int arg1, int arg2)
    {
        return arg1 + arg2;
    }
    public static int dif(int arg1, int arg2)
    {
        return arg1 - arg2;
    }
    public static int mul(int arg1, int arg2)
    {
        return arg1 * arg2;
    }
    public static int sumOfDigits(int number)
    {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static int maxDigit(int number)
    {
        int max = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            number /= 10;
        }
        return max;
    }
    public static boolean isDividedOn(int source, int divider)
    {
        if (divider != 0) {
            return source % divider == 0;
        } else {
            return false;
        }
    }
}
