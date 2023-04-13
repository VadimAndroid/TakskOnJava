package Tasks2;

import java.util.Arrays;
import java.util.Scanner;

public class CountTheMonkeys {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num of monkeys: ");
        int a = scanner.nextInt();
        int[] result = countTheMonkeys(a);
        System.out.println("The monkeys are: " + Arrays.toString(result));
    }
    public static int[] countTheMonkeys(int count) {
       int[] result = new int[count];
      for (int i = 0; i < count; i++) {
          result[i] = i + 1;
      }
      return result;
    }
  }
  