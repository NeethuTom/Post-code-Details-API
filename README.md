# Post-code-details-API
This is an API to add and fetch new post code details in the system.


## Project description
This is a simple Demo of using Java8, Spring Boot , Rest API using JSON and MongoDB. Application implements below functionalities:
  1.Add post code details 
  2.Fetch postcode for given suburb
  3.Fetch suburbs for given postcode
  
 ## Tools Used in this Tutorial
  Java 8
  Spring Boot
  Maven
  MongoDB
  Swagger
  Postman
  
  ## Steps to build and run the project
  ### 1.Setting up Mongo db
  1.Install Mongodb locally.
  2.Open a command prompt window and direct it to the bin folder inside the MongoDB folder path.
  3.Create the directory where MongoDB will store its files
  4.Start the MongoDB daemon by running “mongod” in the Command Prompt
  5.Open another Command prompt window while the MongoDB daemon is running and type “mongo” to connect to MongoDB using the Mongo Shell.
  6.Enable access control:In the Mongo shell, type “use db_name”, & add the following access control roles to it.
    db.createUser({ user: "root",pwd:  "root", roles: [ { role: "readWrite", db: "postCodeDetails" }]})
  
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
    

  
  
  
  
  
  
  
  
  
