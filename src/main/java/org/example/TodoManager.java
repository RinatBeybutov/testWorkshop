package org.example;


/**
* Интерфейс для менеджера задач
*
* @author Gaben
* 12.08.2025
*/
public interface TodoManager {

  void create(String title, boolean isCompleted);

  void delete(Integer id);
}
