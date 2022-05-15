# A Java OData Service Example

## Blog 

Whole step by step description from the blog can be found here
- [Building an OData Service with a Spring Java Application using Olingo – Part I](https://blogs.sap.com/2021/10/29/building-an-odata-service-with-a-spring-java-application-using-olingo-part-i/)
- [Building an OData Service with a Spring Java Application using Olingo – Part II](https://blogs.sap.com/2022/01/17/building-an-odata-service-with-a-spring-java-application-using-olingo-part-ii/)


## How to run this application

What you find here is a working example of an olingo spring application.

You can run this app locally by executing the command **'mvn spring-boot:run'** in the terminal of the project folder.

Using Postman you can then call the URL localhost:8080/odata/$metadata to fetch the metadata:

![image](https://user-images.githubusercontent.com/19994604/138900236-f6ba4cca-c3e4-49ea-97c3-e80e5835aa7d.png)


## Entity Relation Model
The entity relation model I use for the example is a simple one:

![2021-10-18_10-26-06](https://user-images.githubusercontent.com/19994604/138327882-76404655-f383-46e6-82af-677560b5ccee.png)


## Payloads

It's important that you send the payload in the correct format:

<img width="1015" alt="image" src="https://user-images.githubusercontent.com/19994604/167310946-febc1bc1-e898-4d31-aa94-efb423e69d1d.png">

if you then call the Mothers(1) entity, you'll also get a positive result back:

<img width="1015" alt="image" src="https://user-images.githubusercontent.com/19994604/167310988-142c61c2-49ab-487d-927e-0f6edd1e6376.png">

