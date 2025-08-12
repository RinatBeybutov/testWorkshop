package org.example;


import java.util.HashMap;
import java.util.Map;

/**
 * Реализация
 *
 * @author Gaben 12.08.2025
 */
public class TodoManagerImpl implements TodoManager {

  private Map<Integer, TodoItem> map = new HashMap<>();

  private int counter = 0;

  @Override
  public void create(String title, boolean isCompleted) {
    TodoItem task = new TodoItem(counter, title, isCompleted);
    map.put(counter++, task);
  }
}
