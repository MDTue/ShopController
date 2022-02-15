package de.neuefischefirstspringbootproject.productdatabase;

import java.util.UUID;

public class Product {
    private final String id;
    private String name;

    public Product() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
