package ss20.b10;

import java.time.LocalDate;

public class Task {
    private int id;
    private String title;
    private User assignedTo;
    private LocalDate dueDate;
    private boolean completed;

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Task(int id, String title, User assignedTo, LocalDate dueDate, boolean completed) {
        this.assignedTo = assignedTo;
        this.completed = completed;
        this.dueDate = dueDate;
        this.id = id;
        this.title = title;
    }

    public Task() {
    }

    public void printTask(){
        System.out.println("Task id: " + id + " title: " + title + " assignedTo: " + assignedTo);
    }
}
