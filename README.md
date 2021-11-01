# olingo-spring-example

## Blog 

Whole step by step description of the blog can be found here
- First part: https://blogs.sap.com/2021/10/29/building-an-odata-service-with-a-spring-java-application-using-olingo-part-i/


## How to run this application

What you find here is a working example of an olingo spring application.

You can run this app locally by executing the command 'mvn spring-boot:run' in the terminal of the project folder.

Using Postman you can then call the URL localhost:8080/odata/$metadata to fetch the metadata:

![image](https://user-images.githubusercontent.com/19994604/138900236-f6ba4cca-c3e4-49ea-97c3-e80e5835aa7d.png)


## Entity Relation Model
The entity relation model I use for the example is a simple one:

![2021-10-18_10-26-06](https://user-images.githubusercontent.com/19994604/138327882-76404655-f383-46e6-82af-677560b5ccee.png)
