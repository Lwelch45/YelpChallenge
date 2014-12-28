package com.laurencewelch.model;

/**
 * Created by laurencewelch on 12/27/14.
 */
public class Business {
    private String business_id;
    private int busines_review_count;
    private String business_name;
    private Double business_star_count;

    public int getReviewCount(){
        return busines_review_count;
    }
    public Business setReviewCount(int review){
        this.busines_review_count = review;
        return this;
    }

    public double getStars(){
        return business_star_count;
    }
    public Business setStars(double stars){
        this.business_star_count = stars;
        return this;
    }

    public String getId(){
        return business_id;
    }
    public Business setId(String id){
        this.business_id = id;
        return this;
    }

    public String getName(){
        return business_name;
    }
    public Business setName(String name){
        this.business_name = name;
        return this;
    }
}
