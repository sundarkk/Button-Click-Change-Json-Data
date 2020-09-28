package com.sundar.demo.Model;

public class ProductImage2 {
    public int product_id;
    public String image;

    public ProductImage2(int product_id, String image) {
        this.product_id = product_id;
        this.image = image;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
