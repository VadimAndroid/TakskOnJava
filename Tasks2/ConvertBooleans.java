package Tasks2;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertBooleans {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of values: ");
    int count = scanner.nextInt();
    boolean[] values = new boolean[count];
    for(int i = 0; i < count; i++){
      System.out.println("Enter a value (true/false): ");
      values[i] = scanner.nextBoolean();
    }
    String[] result = getStringArray(values);
    System.out.println(Arrays.toString(result));

}
    public static String[] getStringArray(boolean[] values) {
      String[] result = new String[values.length];
      for (int i = 0; i < values.length; i++) {
        result[i] = values[i] ? "Yes" : "No";
      }
      return result;
    }
  }