package com.example.vizsga1;

public class Todo {
    private int id;
    private int user_id;
    private int category_id;
    private long end_date;
    private String todo;
    private boolean done;
    private boolean important;
    private long deadline;

    public Todo(int id, int user_id, int category_id, long end_date, String todo, boolean done, boolean important, long deadline) {
        this.id = id;
        this.user_id = user_id;
        this.category_id = category_id;
        this.end_date = end_date;
        this.todo = todo;
        this.done = done;
        this.important = important;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public long getEnd_date() {
        return end_date;
    }

    public String getTodo() {
        return todo;
    }

    public boolean isDone() {
        return done;
    }

    public boolean isImportant() {
        return important;
    }

    public long getDeadline() {
        return deadline;
    }
}
