package jsu.ljt.javademo.pojo.ch02;


import org.apache.commons.jexl3.*;

public class ExpressionEvaluator {
  private static final JexlEngine jexl = new JexlBuilder().create();

  public static String evaluate(String input) {
    try {
      JexlExpression e = jexl.createExpression(input);
      JexlContext jc = new MapContext();
      Object result = e.evaluate(jc);
      return result != null ? result.toString() : "无结果";
    } catch (Exception e) {
      return "错误: " + e.getMessage();
    }
  }
}


