package com.ssm.seter;

public class ProductImpl implements Product {
    private String name;
    private Double price;
    private String factory;

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

    @Override
    public void printInformation() {
        System.out.println("商品名称："+this.name+"\n价格："
                +this.price+"\n地址："+this.factory);
    }
}
