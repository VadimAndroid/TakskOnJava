public class CombineArrays {
    public static int[] getCombinedArray(int[] firstArray, int[] secondArray) {
      int[] result = new int[firstArray.length + secondArray.length];
      int index = 0;
      for (int element : firstArray) {
        result[index] = element;
        index++;
      }
      for (int element : secondArray) {
        result[index] = element;
        index++;
      }
      return result;
    }
  }
  