public class RemoveOddChars {
    public static String removeOddChars(String originalString) {
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < originalString.length(); i++) {
          if (i % 2 == 0) {
              result.append(originalString.charAt(i));
          }
      }
      return result.toString();
    }
  }
  