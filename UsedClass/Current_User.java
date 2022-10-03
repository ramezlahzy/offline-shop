package com.example.offlineshopmain.data.UsedClass;

import android.content.Context;

import com.example.offlineshopmain.data.NewAllData;

import java.util.List;

public class Current_User {
    private String id;
    private String first_name;
    private String last_name;
    private String age;
    private String city;
    private List<String> watched_list_ids;
    private List<String> fav_Products_ids;
    private String imageURL;
    private boolean female;
    private double longitude;
    private double latitude;
    private String password;
    private String email;
    private String phone;

    public Current_User() {
    }


    public Current_User(String first_name, String last_name, String age, String city, List<String> watched_list_ids, String imageURL, boolean female, double longitude, double latitude, String password, String email, String phone
    ,List<String> fav) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.city = city;
        this.watched_list_ids = watched_list_ids;
        this.imageURL = imageURL;
        this.female = female;
        this.longitude = longitude;
        this.latitude = latitude;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.fav_Products_ids=fav;
    }

    public List<String> getFav_Products_ids() {
        return fav_Products_ids;
    }

    public void setFav_Products_ids(List<String> fav_Products_ids) {
        this.fav_Products_ids = fav_Products_ids;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    public void addToFireStore(Context context){
        NewAllData.addCurrent_User(this,context);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getWatched_list_ids() {
        return watched_list_ids;
    }

    public void setWatched_list_ids(List<String> watched_list_ids) {
        this.watched_list_ids = watched_list_ids;
    }
    public void addToFireStore(Context context,String id){
        NewAllData.addUser(this,context,id);
    }
}
