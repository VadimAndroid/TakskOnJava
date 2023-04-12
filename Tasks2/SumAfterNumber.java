package Tasks2;

public class SumAfterNumber {
    public static int getSum(int[] values, int startValue) {
      int sum = 0;
      boolean foundStartValue = false;
  
      for (int value : values) {
          
          if (foundStartValue) {
              sum += value; 
              continue;
          }
          if (value == startValue) {
              foundStartValue = true;
          }
      }
  
  
      return sum;
    }
  }
  
// getSum(new int[] {1, 2, 3}, 1); // 2 + 3 = 5
// getSum(new int[] {10, 2, 50, 3, 4, 0}, 50); // 3 + 4 + 0 = 7
// getSum(new int[] {10, 2, 50, 3, 4, 0}, -100); // 0 (бо в масиві немає значення -100)
// getSum(new int[] {10}, 10); // 0
