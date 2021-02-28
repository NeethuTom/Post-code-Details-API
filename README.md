# Post-code-details-API
This is an API to add new and fetch  post code/suburb details in the system.


## Project description
This is a simple Demo of using Java8, Spring Boot , Rest API using JSON and MongoDB. Application implements below functionalities:<br/>
  1.Add post code details <br/>
  2.Fetch postcode for given suburb<br/>
  3.Fetch suburbs for given postcode<br/>
  
 ## Tools Used<br/>
  Java 8<br/>
  Spring Boot<br/>
  Maven<br/>
  MongoDB<br/>
  Swagger<br/>
  Postman<br/>
  
  ## Steps to build and run the project
  ### 1.Setting up MongoDB<br/>
  1.Install MongoDB locally.<br/>
  2.Open a command prompt window and direct it to the bin folder inside the MongoDB folder path.<br/>
  3.Create the directory where MongoDB will store its files<br/>
  4.Start the MongoDB daemon by running “mongod” in the Command Prompt<br/>
  5.Open another Command prompt window while the MongoDB daemon is running and type “mongo” to connect to MongoDB using the Mongo Shell.<br/>
  6.Enable access control:In the Mongo shell, type “use db_name”, & add the following access control roles to it.<br/>
    db.createUser({ user: "root",pwd:  "root", roles: [ { role: "readWrite", db: "postCodeDetails" }]})<br/>
  
  ### 2.Building the maven project
    mvn clean package
  
  ### 3.Running 
    java -jar target/postcode-details-api-0.0.1-SNAPSHOT.jar
  
  
  ## How it works?
  This can be tested using PostMan.
  ### 1.Add post code details
      Request URL - POST : http://localhost:8080/v1/postcodeDetails/addPostcodeDetails
      Request Body : 
                    {
                        "postCode":"3000",
                        "suburb": "Melbourne"
                    }
   ### 2.Fetch postcode for given suburb
      Request URL - GET : http://localhost:8080/v1/postcodeDetails/searchBySuburb/Melbourne
      
   ### 3.Fetch suburbs for given postcode
      Request URL - GET : http://localhost:8080/v1/postcodeDetails/searchByPostCode/3000
    

  
  
  
  
  
  
  
  
  
