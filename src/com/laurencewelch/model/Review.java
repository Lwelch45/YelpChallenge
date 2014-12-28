package com.laurencewelch.model;

import java.util.Date;

/**
 * Created by laurencewelch on 12/27/14.
 */
public class Review {
    private String business_id, review_id, user_id;

    private int funny,useful, cool;
    private Double stars;
    private Date date;
    private String text;

    public int getFunny(){
        return funny;
    }
    public Review setFunny(int funny){
        this.funny = funny;
        return this;
    }

    public int getUseful(){
        return useful;
    }
    public Review setUseful(int useful){
        this.useful = useful;
        return this;
    }

    public int getCool(){
        return cool;
    }
    public Review setCool(int cool){
        this.cool = cool;
        return this;
    }

    public String getText(){
        return text;
    }
    public Review setText(String text){
        this.text = text;
        return this;
    }

    public Double getStars(){
        return stars;
    }
    public Review setStars(double stars){
        this.stars = stars;
        return this;
    }

    public Date getDate(){
        return date;
    }
    public Review setDate(Date date){
        this.date = date;
        return this;
    }

    public String getBusiness(){
        return business_id;
    }
    public Review setBusiness(String business){
        this.business_id = business;
        return this;
    }

    public String getReview(){
        return review_id;
    }
    public Review setReview(String review){
        this.review_id = review;
        return this;
    }

    public String getUser(){
        return user_id;
    }
    public Review setUser(String user){
        this.user_id = user;
        return this;
    }
}

