package jsu.ljt.javademo.utils.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 排序工具类，包含泛型方法用于排序
public class SortUtils {

  // 泛型方法，用于对列表进行排序
  public static <T extends Comparable<T>> List<T> sortList(List<T> list) {
    List<T> sortedList = new ArrayList<>(list);
    Collections.sort(sortedList);
    return sortedList;
  }

  // 泛型方法，用于根据比较器对列表进行排序
  public static <T> List<T> sortList(List<T> list, Comparator<T> comparator) {
    List<T> sortedList = new ArrayList<>(list);
    sortedList.sort(comparator);
    return sortedList;
  }
}

