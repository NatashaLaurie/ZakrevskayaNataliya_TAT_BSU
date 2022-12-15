package model;

import java.util.Objects;

public class Product {
    private String name;
    private String price;
    private String size;
    private String color;

    public Product(String name, String price, String size, String color) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.color = color;
    }

    public Product(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price) && Objects.equals(size, product.size) && Objects.equals(color, product.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, size, color);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
