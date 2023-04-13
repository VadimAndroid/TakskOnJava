import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int divider = 2;
        int[] result = getDivisibleNumbers(numbers, divider);
        System.out.println(Arrays.toString(result));

    }
    
    public static int[] getDivisibleNumbers(int[] numbers, int divider) {
      int size = 0;
      for (int number : numbers) {
          if (number > 0 && number % divider == 0) {
              size++;
          }
      }
      int[] result = new int[size];
      int counter = 0;
      for (int number : numbers) {
          if (number > 0 && number % divider == 0) {
              result[counter++] = number;
          }
      }
      return result;
    }
  }
  