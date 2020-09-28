package com.sundar.demo.Model;

import java.util.List;

public class TopItem {
    public int id;
    public String name;
    public String description;
    public int quantity;
    public String unit;
    public int price;
    public int salePrice;
    public String image;
    public String product_category_id;
    public int product_brand_id;
    public int price_off;

    public List<ProductImage> product_images;

    public TopItem(int id, String name, String description, int quantity, String unit, int price,
                   int salePrice, String image, String product_category_id, int product_brand_id, int price_off,
                   List<ProductImage> product_images) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.unit = unit;
        this.price = price;
        this.salePrice = salePrice;
        this.image = image;
        this.product_category_id = product_category_id;
        this.product_brand_id = product_brand_id;
        this.price_off = price_off;
        this.product_images = product_images;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProduct_category_id() {
        return product_category_id;
    }

    public void setProduct_category_id(String product_category_id) {
        this.product_category_id = product_category_id;
    }

    public int getProduct_brand_id() {
        return product_brand_id;
    }

    public void setProduct_brand_id(int product_brand_id) {
        this.product_brand_id = product_brand_id;
    }

    public int getPrice_off() {
        return price_off;
    }

    public void setPrice_off(int price_off) {
        this.price_off = price_off;
    }

    public List<ProductImage> getProduct_images() {
        return product_images;
    }

    public void setProduct_images(List<ProductImage> product_images) {
        this.product_images = product_images;
    }
}
