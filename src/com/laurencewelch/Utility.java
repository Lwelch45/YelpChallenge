package com.laurencewelch;

import com.laurencewelch.model.Business;
import com.laurencewelch.model.Review;
import com.laurencewelch.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
/**
 * Created by laurencewelch on 12/27/14.
 */
public class Utility {

    private final static Logger LOGGER = Logger.getLogger(Utility.class.getName());

    private final static String BUSINESS_FILE = "";
    private final static String REVIEW_FILE = "";
    private final static String USER_FILE = "";

    public static List<Business> get_business_from_master_file(String filename){

    }
    public static List<Review> get_review_from_master_file(String filename){

    }
    public static List<User> get_user_from_master_file(String filename){

    }

    public static List<Review> get_reviews_for_business(List<Review> reviews, Business business){
        List<Review>  to_return = new ArrayList<Review>();
        for (Review review : reviews){
            if (review.getBusiness().compareTo(business.getId()) == 0){ //TODO check the results of compareTo in doc.
                to_return.add((review));
            }
        }
        return to_return;
    }
    public static List<Review> get_reviews_for_user(List<Review> reviews, User user){
        List<Review>  to_return = new ArrayList<Review>();
        for (Review review : reviews){
            if (review.getUser().compareTo(user.getUser()) == 0){ //TODO check the results of compareTo in doc.
                to_return.add((review));
            }
        }
        return to_return;
    }

    public static List<Business> filter_business_under_n_count(List<Business> businesses, int threshold){
        int removed = 0;
        for(int i = businesses.size() - 1 ; i >= 0; i--){
            if(businesses.get(i).getReviewCount() < threshold){
                businesses.remove(i);
            }
        }
        LOGGER.info("removed " + removed + " items from the list of businesses");
        return businesses;
    }

    public static List<Review> filter_review_if_no_business(List<Business> businesses, List<Review> reviews){
        int removed = 0;
        for(int i = reviews.size() - 1; i >= 0; i--){
            if(!business_exists(reviews.get(i).getBusiness(), businesses)){
                reviews.remove(i);
                removed++;
            }
        }
        LOGGER.info("removed " + removed + " items from the list of reviews");
        return reviews;
    }

    public static List<User> filter_user_if_no_review(List<Review> reviews, List<User> users){
        int removed = 0;
        for(int i = users.size() - 1; i >= 0; i--){
            if(!user_exists(users.get(i).getUser(), reviews)){
                reviews.remove(i);
                removed++;
            }
        }
        LOGGER.info("removed " + removed + " items from the list of users");
        return users;
    }

    public static boolean business_exists(String id, List<Business> businesses){
        for(Business business : businesses){
           if (business.getId().compareTo(id) == 0){ //TODO check the results of compareTo in doc.
               return true;
           }
        }
        return false;
    }

    public static boolean user_exists(String id, List<Review> reviews){
        for(Review review : reviews){
            if (review.getUser().compareTo(id) == 0){ //TODO check the results of compareTo in doc.
                return true;
            }
        }
        return false;
    }
}
