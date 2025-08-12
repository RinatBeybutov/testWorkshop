package org.example;


import java.util.HashMap;
import java.util.Map;

/**
 * Реализация
 *
 * @author Gaben 12.08.2025
 */
public class TodoManagerImpl implements TodoManager {

  private Map<Integer, TodoItem> idToTask = new HashMap<>();

  private int counter = 0;

  @Override
  public void create(String title, boolean isCompleted) {
    TodoItem task = new TodoItem(counter, title, isCompleted);
    idToTask.put(counter++, task);
    System.out.printf("Создана задача %s", title);
  }

  @Override
  public void delete(Integer id) {
    if (!idToTask.containsKey(id)) {
      throw new RuntimeException("Задача не найдена!");
    }
    idToTask.remove(id);
    System.out.printf("Удалена задача с id = %s", id);
  }
}
