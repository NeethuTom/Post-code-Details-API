package com.myPoC.postCodeDetails.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PostCodeDetails {

    /**
     * unique id
     */
    @Id
    private String id;

    /**
     * post code
     */
    private String postCode;

    /**
     * sub urb
     */
    private String suburb;

    /**
     * get the post code
     * 
     * @return post code
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * set the post code
     * 
     * @param postCode
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * get the suburb
     * 
     * @return suburb
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     * set the suburb
     * 
     * @param suburb
     */
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    /**
     * PostCodeDetails
     */
    public PostCodeDetails() {
	}

    /**
     * get Id
     * 
     * @return Id
     */
	public String getId() {
		return id;
	}

    /**
     * set the id
     * 
     * @param id
     */
	public void setId(String id) {
		this.id = id;
	}

}
