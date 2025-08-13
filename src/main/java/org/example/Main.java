package org.example;

import java.util.Date;

public class Main {

  public static void main(String[] args) {
    TodoManager manager = new TodoManagerImpl();

    manager.create("Первая задача", false, new Date());
    manager.delete(1);
  }
}