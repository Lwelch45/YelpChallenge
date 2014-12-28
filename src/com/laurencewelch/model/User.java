package com.laurencewelch.model;

import java.util.Date;

/**
 * Created by laurencewelch on 12/27/14.
 */
public class User {

    private Date yelping_since;
    private int total_funny, total_useful, total_cool, total_reviews;

    private String user_id;
    private float average_stars;
    private int elite;

    public Date getDate(){
        return yelping_since;
    }
    public User setDate(Date date){
        this.yelping_since = date;
        return this;
    }

    public int getFunny(){
        return total_funny;
    }
    public User setFunny(int funny){
        this.total_funny = funny;
        return this;
    }

    public int getUseful(){
        return total_useful;
    }
    public User setUseful(int useful){
        this.total_useful = useful;
        return this;
    }

    public int getCool(){
        return total_cool;
    }
    public User setCool(int cool){
        this.total_cool = cool;
        return this;
    }

    public int getReviews(){
        return total_reviews;
    }
    public User setReviews(int reviews){
        this.total_reviews = reviews;
        return this;
    }

    public String getUser(){
        return user_id;
    }
    public User setUser(String user){
        this.user_id = user;
        return this;
    }

    public float getStars(){
        return average_stars;
    }
    public User setStars(float stars){
        this.average_stars = stars;
        return this;
    }

    public int getElite() {
        return elite;
    }
    public User setElite(int elite){
        this.elite = elite;
        return this;
    }

}
