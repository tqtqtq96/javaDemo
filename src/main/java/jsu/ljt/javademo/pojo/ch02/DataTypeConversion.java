package jsu.ljt.javademo.pojo.ch02;

public class DataTypeConversion {
  public static String convert(String input, String fromType, String toType) {
    try {
      switch (fromType) {
        case "String":
          return convertFromString(input, toType);
        case "int":
          return convertFromInt(Integer.parseInt(input), toType);
        case "double":
          return convertFromDouble(Double.parseDouble(input), toType);
        // 添加更多数据类型转换
        default:
          return "Unsupported fromType";
      }
    } catch (Exception e) {
      return "Conversion error: " + e.getMessage();
    }
  }

  private static String convertFromString(String input, String toType) {
    switch (toType) {
      case "String":
        return input;
      case "int":
        return String.valueOf(Integer.parseInt(input));
      case "double":
        return String.valueOf(Double.parseDouble(input));
      // 添加更多数据类型转换
      default:
        return "Unsupported toType";
    }
  }

  private static String convertFromInt(int input, String toType) {
    switch (toType) {
      case "String":
        return String.valueOf(input);
      case "int":
        return String.valueOf(input);
      case "double":
        return String.valueOf((double) input);
      // 添加更多数据类型转换
      default:
        return "Unsupported toType";
    }
  }

  private static String convertFromDouble(double input, String toType) {
    switch (toType) {
      case "String":
        return String.valueOf(input);
      case "int":
        return String.valueOf((int) input);
      case "double":
        return String.valueOf(input);
      // 添加更多数据类型转换
      default:
        return "Unsupported toType";
    }
  }
}

