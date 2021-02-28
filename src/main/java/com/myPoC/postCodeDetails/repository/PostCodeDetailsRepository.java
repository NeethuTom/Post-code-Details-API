package com.myPoC.postCodeDetails.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.myPoC.postCodeDetails.model.PostCodeDetails;

/**
 * PostCodeDetailsRepository
 * 
 * @author ntom The interface with MongoRepository extend
 */

public interface PostCodeDetailsRepository extends MongoRepository<PostCodeDetails, String> {

    /**
     * This method is to fetch postcode details by Suburb
     * 
     * @param suburb
     * @return post code details
     */
    public List<PostCodeDetails> findPostCodeDetailsBySuburb(String suburb);

    /**
     * This metod is for fetching suburb details by post code
     * 
     * @param postCode
     * @return
     */
    public List<PostCodeDetails> findPostCodeDetailsByPostCode(String postCode);

}
