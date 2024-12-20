package com.quimpo.sgma_javafx;

import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private SimpleStringProperty name;
    private SimpleStringProperty id;

    public Student(String name) {
        this.name = new SimpleStringProperty(name);
        this.id = new SimpleStringProperty("S" + (int)(Math.random() * 10000)); // Random ID for demo
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getId() {
        return id.get();
    }

    // Getters for properties (JavaFX Property API)
    public SimpleStringProperty nameProperty() {
        return name;
    }

    public SimpleStringProperty idProperty() {
        return id;
    }
}
