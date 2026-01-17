package com.alehxs.summed.model;

public class Category {
    final String id;
    final String name;

    public Category(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Category{id='" + id + "', name='" + name + "'}";
    }
}