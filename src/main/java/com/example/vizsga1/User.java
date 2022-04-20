package com.example.vizsga1;

public class User {
    private Integer id;
    private String username;
    private String email;
    private String first_name;
    private String last_name;
    private long born_date;
    private long register_date;
    private boolean admin;

    public User(int id, String username, String email, String first_name, String last_name, long born_date, long register_date, boolean admin) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.born_date = born_date;
        this.register_date = register_date;
        this.admin = admin;
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

    public boolean getAdmin() {return admin;}

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setBorn_date(long born_date) {
        this.born_date = born_date;
    }

    public void setRegister_date(long register_date) {
        this.register_date = register_date;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}

