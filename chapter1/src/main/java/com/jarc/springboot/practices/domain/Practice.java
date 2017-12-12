package com.jarc.springboot.practices.domain;

public class Practice {

    private int id;
    private String name;
    private String description;

    public Practice(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
