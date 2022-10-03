package com.example.offlineshopmain.data.UsedClass;

import android.content.Context;

import com.example.offlineshopmain.data.NewAllData;

import java.util.List;

public class Shop {
    private String id;
    private String appiontments;
    private String name;
    private String address;
    private String product_Kind;
    private String government;
    private String city;
    private String phone_Number;
    private String email;
    private String password;
    private List<String> productsId;
    private List<String> categories_User_Id;
    private List<String> liked_Users_Id;
    private List<String> disliked_Users_Id;
    private List<String> Reviews_Id;
    private List<String> watched_list_ids;
    private List<String> fav_Products_ids;

    private String imageURL;
    private double longitude;
    private double latitude;

    public Shop() {
    }

    public Shop(String appiontments, String name, String address, String product_Kind, String government, String city, String phone_Number, List<String> productsId, List<String> categories_User_Id, List<String> liked_Users_Id, List<String> disliked_Users_Id, List<String> reviews_Id, String imageURL, double longitude, double latitude
    ,String email,String password,List<String>watched_list_ids,List<String> fav) {
        this.appiontments = appiontments;
        this.name = name;
        this.address = address;
        this.product_Kind = product_Kind;
        this.government = government;
        this.city = city;
        this.phone_Number = phone_Number;
        this.productsId = productsId;
        this.categories_User_Id = categories_User_Id;
        this.liked_Users_Id = liked_Users_Id;
        this.disliked_Users_Id = disliked_Users_Id;
        this.Reviews_Id = reviews_Id;
        this.imageURL = imageURL;
        this.longitude = longitude;
        this.latitude = latitude;
        this.email=email;
        this.password=password;
        this.watched_list_ids=watched_list_ids;
        this.fav_Products_ids=fav;

    }

    public List<String> getFav_Products_ids() {
        return fav_Products_ids;
    }

    public void setFav_Products_ids(List<String> fav_Products_ids) {
        this.fav_Products_ids = fav_Products_ids;
    }

    public List<String> getWatched_list_ids() {
        return watched_list_ids;
    }

    public void setWatched_list_ids(List<String> watched_list_ids) {
        this.watched_list_ids = watched_list_ids;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void addToFireStore(Context context){
        NewAllData.addShop(this,context);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppiontments() {
        return appiontments;
    }

    public void setAppiontments(String appiontments) {
        this.appiontments = appiontments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProduct_Kind() {
        return product_Kind;
    }

    public void setProduct_Kind(String product_Kind) {
        this.product_Kind = product_Kind;
    }

    public String getGovernment() {
        return government;
    }

    public void setGovernment(String government) {
        this.government = government;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    public List<String> getProductsId() {
        return productsId;
    }

    public void setProductsId(List<String> productsId) {
        this.productsId = productsId;
    }

    public List<String> getCategories_User_Id() {
        return categories_User_Id;
    }

    public void setCategories_User_Id(List<String> categories_User_Id) {
        this.categories_User_Id = categories_User_Id;
    }

    public List<String> getLiked_Users_Id() {
        return liked_Users_Id;
    }

    public void setLiked_Users_Id(List<String> liked_Users_Id) {
        this.liked_Users_Id = liked_Users_Id;
    }

    public List<String> getDisliked_Users_Id() {
        return disliked_Users_Id;
    }

    public void setDisliked_Users_Id(List<String> disliked_Users_Id) {
        this.disliked_Users_Id = disliked_Users_Id;
    }

    public List<String> getReviews_Id() {
        return Reviews_Id;
    }

    public void setReviews_Id(List<String> reviews_Id) {
        Reviews_Id = reviews_Id;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }


}
