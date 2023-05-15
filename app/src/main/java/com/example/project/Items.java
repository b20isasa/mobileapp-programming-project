package com.example.project;

public class Items {

    private String ID;
    private String name;
    private String location;
    private String Login;

    public Items(String ID, String name, String location, String category) {
        this.ID = ID;
        this.name = name;
        this.location = location;
        this.Login = Login;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }
}
