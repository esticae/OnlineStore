package com.pluralsight;

public class Product {
        private String id;
        private String Name;
        private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.Name = name;
        this.price = price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
        @Override
        public String toString() {
            return "Product{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        }
}

