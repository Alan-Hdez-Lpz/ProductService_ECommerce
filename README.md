# ProductService_ECommerce
Project: Building a Microservices-Based E-Commerce Application - Product Service

How to set up the project:
Update the DataBase configuration properties in the application.properties file

How to run the application:
1. Create the DB in MySQL
2. Verify the properties of this microservice in the config-repo
3. Run the config-server and eureka-server
4. Run this microservice project

NOTE: The server port will change according server port value in the config-repo properties

API endpoints and sample requests for testing:

For ROLES:
CREATE:
 - POST -> http://localhost:8081/products
 - BodyRequest:
{
  "name": "Wireless Mouse",
  "description": "Ergonomic wireless mouse with USB receiver",
  "price": 25.99,
  "stock": 100
}


READ:
- GET ->  http://localhost:8081/products/1 (get product by ID)
- GET -> http://localhost:8081/products/ (get all products)
- GET -> http://localhost:8081/products/isAvailable/1 (verify if a product by id is available in stock, it returns true or false) 

UPDATE:
- PUT -> http://localhost:8081/products/1
 - BodyRequest:
{
  "name": "Wireless Mouse",
  "description": "Ergonomic wireless mouse with USB receiver",
  "price": 25.99,
  "stock": 102
}

DELETE:
- DELETE -> http://localhost:8081/products/1
