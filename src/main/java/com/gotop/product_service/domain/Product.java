package com.gotop.product_service.domain;

import java.io.Serializable;

public class Product implements Serializable {

    private int id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格，分为单位
     */
    private int price;

    /**
     * 库存
     */
    private int store;

    public Product() {
    }

    public Product(int id, String name, int price, int store) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStore() {
        return store;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStore(int store) {
        this.store = store;
    }
}
