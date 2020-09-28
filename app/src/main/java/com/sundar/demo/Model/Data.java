package com.sundar.demo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("banner")
    @Expose
    private List<Banner> banner = null;
    @SerializedName("categroy")
    @Expose
    private List<Categroy> categroy = null;
    @SerializedName("topItems")
    @Expose
    private List<TopItem> topItems = null;
    @SerializedName("topSelling")
    @Expose
    private List<TopSelling> topSelling = null;

    public List<Banner> getBanner() {
        return banner;
    }

    public void setBanner(List<Banner> banner) {
        this.banner = banner;
    }

    public List<Categroy> getCategroy() {
        return categroy;
    }

    public void setCategroy(List<Categroy> categroy) {
        this.categroy = categroy;
    }

    public List<TopItem> getTopItems() {
        return topItems;
    }

    public void setTopItems(List<TopItem> topItems) {
        this.topItems = topItems;
    }

    public List<TopSelling> getTopSelling() {
        return topSelling;
    }

    public void setTopSelling(List<TopSelling> topSelling) {
        this.topSelling = topSelling;
    }

}

/*public class Data {
    public List<Banner> banner;
    public List<Categroy> categroy;
    public TopItem[] topItems;
    public List<TopSelling> topSelling;

    public Data(List<Banner> banner, List<Categroy> categroy, List<TopSelling> topSelling) {
        this.banner = banner;
        this.categroy = categroy;
        this.topSelling = topSelling;
    }

    public List<Banner> getBanner() {
        return banner;
    }

    public void setBanner(List<Banner> banner) {
        this.banner = banner;
    }

    public List<Categroy> getCategroy() {
        return categroy;
    }

    public void setCategroy(List<Categroy> categroy) {
        this.categroy = categroy;
    }

    public List<TopSelling> getTopSelling() {
        return topSelling;
    }

    public void setTopSelling(List<TopSelling> topSelling) {
        this.topSelling = topSelling;
    }
}*/
