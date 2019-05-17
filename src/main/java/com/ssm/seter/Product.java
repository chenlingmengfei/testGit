package com.ssm.seter;

public class Product {
    private String name;
    private Double price;
    private String factory;
    private Category category;

    /*public ProductImpl(String name,Double price,String factory){
        this.name = name;
        this.price = price;
        this.factory = factory;
    }*/

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", factory='" + factory + '\'' +
                ", category=" + category +
                '}';
    }
}
