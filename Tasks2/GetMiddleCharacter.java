package Tasks2;

public class GetMiddleCharacter {
  public static String getMiddleString(String originalString) {
    int length = originalString.length();
    if (length == 0) {
        return "";
    }
    int midIndex = length / 2;
    if (length % 2 == 0) {
        // Even length
        return originalString.substring(midIndex - 1, midIndex + 1);
    } else {
        // Odd length
        return originalString.substring(midIndex, midIndex + 1);
    }
  }
}
