package com.example.vizsga1;

public class User {
    private int id;
    private String username;
    private String email;
    private String first_name;
    private String last_name;
    private long born_date;
    private long register_date;

    public User(int id, String username, String email, String first_name, String last_name, long born_date, long register_date) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.born_date = born_date;
        this.register_date = register_date;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public long getBorn_date() {
        return born_date;
    }

    public long getRegister_date() {
        return register_date;
    }
}
