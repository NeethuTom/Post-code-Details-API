package com.myPoC.postCodeDetails.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import com.myPoC.postCodeDetails.model.PostCodeDetails;
import com.myPoC.postCodeDetails.repository.PostCodeDetailsRepository;

/**
 * PostCodeDetailsController
 * 
 * @author ntom
 */
@RequestMapping("/v1/postcodeDetails")
@RestController
public class PostCodeDetailsController {

	private Logger logger = LoggerFactory.getLogger(PostCodeDetailsController.class);

	@Autowired
	private PostCodeDetailsRepository postCodeDetailsRepository;

    /**
     * Add postcode details to Mongo Db
     * 
     * @param postCodeDetails
     * @return
     * @throws RestClientException
     */
    @PostMapping(value = "/addPostcodeDetails")
    // @Secured("ROLE_USER")
    public PostCodeDetails addPostCodeDetails(@RequestBody PostCodeDetails postCodeDetails)
            throws RestClientException {
        return addPostcodeDetailsWithHttpInfo(postCodeDetails);


	}

    /**
     * Add the new post code details to the system
     * 
     * @param postCodeDetails
     * @return
     * @throws RestClientException
     */
    private PostCodeDetails addPostcodeDetailsWithHttpInfo(PostCodeDetails postCodeDetails)
            throws RestClientException {
        logger.info("Saving postCodeDetails.");
        // verify the required parameter 'body' is set
        if (postCodeDetails == null) {
            throw new HttpClientErrorException(
                    HttpStatus.BAD_REQUEST,
                    "Missing the required parameter 'body' when calling addPostcodeDetails");
        }
        return postCodeDetailsRepository.save(postCodeDetails);

    }

    /**
     * Finds Suburbs by Postcode Fetch suburb for a postcode
     * <p>
     * <b>200</b> - successful operation
     * <p>
     * <b>400</b> - Invalid status value
     * 
     * @param postcode
     *            Postcode (required)
     * @return java.util.List&lt;PostcodeDetails&gt;
     * @throws RestClientException
     *             if an error occurs while attempting to invoke the API
     */
    @GetMapping(value = "/searchBySuburb/{suburb}")
    public java.util.List<PostCodeDetails> findPostcodeDetailsBySuburb(@PathVariable String suburb)
            throws RestClientException {
        return findPostcodeDetailsBySuburbWithHttpInfo(suburb);
    }

    /**
     * Finds Suburbs by Postcode Fetch suburb for a postcode
     * <p>
     * <b>200</b> - successful operation
     * <p>
     * <b>400</b> - Invalid status value
     * 
     * @param postcode
     *            Postcode (required)
     * @return ResponseEntity&lt;java.util.List&lt;PostcodeDetails&gt;&gt;
     * @throws RestClientException
     *             if an error occurs while attempting to invoke the API
     */
    public java.util.List<PostCodeDetails> findPostcodeDetailsBySuburbWithHttpInfo(String suburb)
            throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'suburb' is set
        if (suburb == null) {
            throw new HttpClientErrorException(
                    HttpStatus.BAD_REQUEST,
                    "Missing the required parameter 'postCode' when calling findPPostcodeDetailsBySuburb");
        }

        return postCodeDetailsRepository.findPostCodeDetailsBySuburb(suburb);
    }



    /**
     * Finds Suburbs by Postcode Fetch suburb for a postcode
     * <p>
     * <b>200</b> - successful operation
     * <p>
     * <b>400</b> - Invalid status value
     * 
     * @param postcode
     *            Postcode (required)
     * @return java.util.List&lt;PostcodeDetails&gt;
     * @throws RestClientException
     *             if an error occurs while attempting to invoke the API
     */
    @GetMapping(value = "/searchByPostCode/{postCode}")
    public java.util.List<PostCodeDetails> findPostcodeDetailsByPostCode(@PathVariable String postCode)
            throws RestClientException {
        return findPostcodeDetailsByPostCodeWithHttpInfo(postCode);
    }

    /**
     * Finds Suburbs by Postcode Fetch suburb for a postcode
     * <p>
     * <b>200</b> - successful operation
     * <p>
     * <b>400</b> - Invalid status value
     * 
     * @param postcode
     *            Postcode (required)
     * @return ResponseEntity&lt;java.util.List&lt;PostcodeDetails&gt;&gt;
     * @throws RestClientException
     *             if an error occurs while attempting to invoke the API
     */
    public java.util.List<PostCodeDetails> findPostcodeDetailsByPostCodeWithHttpInfo(String postCode)
            throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'suburb' is set
        if (postCode == null) {
            throw new HttpClientErrorException(
                    HttpStatus.BAD_REQUEST,
                    "Missing the required parameter 'postCode' when calling findPPostcodeDetailsBySuburb");
        }

        return postCodeDetailsRepository.findPostCodeDetailsByPostCode(postCode);
    }


}
