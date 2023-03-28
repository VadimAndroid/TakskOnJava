public class ConvertBooleans {
    public static String[] getStringArray(boolean[] values) {
      String[] result = new String[values.length];
      for (int i = 0; i < values.length; i++) {
        result[i] = values[i] ? "Yes" : "No";
      }
      return result;
    }
  }
  