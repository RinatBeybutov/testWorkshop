package org.example;


import java.util.Date;

/**
 * Класс для
 *
 * @author Gaben 12.08.2025
 */
public class TodoItem {

  private Integer id;
  private String title;
  private boolean isCompleted;
  private Date date;

  public TodoItem(Integer id, String title, boolean isCompleted, Date date) {
    this.id = id;
    this.title = title;
    this.isCompleted = isCompleted;
    this.date = date;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isCompleted() {
    return isCompleted;
  }

  public void setCompleted(boolean completed) {
    isCompleted = completed;
  }
}
