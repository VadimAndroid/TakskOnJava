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
  