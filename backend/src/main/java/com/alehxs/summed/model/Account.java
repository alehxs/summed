package com.alehxs.summed.model;

public class Account {
    final String id;
    final String name;
    final String type;
    final String institution;

    public Account(String id, String name, String type, String institution) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.institution = institution;
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public String getType() { return type; }

    public String getInstitution() { return institution; }

    public String toString() {
        return "Account{id='" + id + "', name='" + name + ", type='" + type + ", institution='" + institution + "'}";
    }
}
