package org.spring.cert.db.products.ds;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private int quantity;
    private float price;
    private boolean available;

    @SuppressWarnings("unused")
    public Product() {
    }

    public Product(int id, String name, int quantity, float price, boolean available) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", available=" + available +
                '}';
    }
}
