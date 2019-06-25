package com.liyan.pojo;

public class Flower {
    private Integer id;
    private String name;
    private Double price;
    private String priduction;

    public Flower() {
    }

    public Flower(Integer id, String name, Double price, String priduction) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.priduction = priduction;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPriduction() {
        return priduction;
    }

    public void setPriduction(String priduction) {
        this.priduction = priduction;
    }
}
