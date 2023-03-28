public class Task3
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int countPositive = 0;
        int sumNegative = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                countPositive++;
            } else if (input[i] < 0) {
                sumNegative += input[i];
            }
        }

        return new int[] {countPositive, sumNegative};
    }
}