# User-Order-Address-Product

This is the code for User-Order-Address-Product which uses **Many To One Mapping** for relating the database in **Spring Boot**.

This also uses **Relational Data** and **JPA** for data source

- **Many to One Mapping** is a technique which is used to define realation betweeen 2 tables or data. 


## 🚀 About Me
*Hi, My name is Nikhil Sharma*,

I'm a full stack developer trainee at Geekster. I have knowledge of Java, OOPs, Maven, APIs, DSA, SpringBoot.


# Data Flow

## Controller
-   *This section contains 4 classes which uses APIs as mentioned below* :

* ### AddressController Class

    * @PostMapping("addresses")

* ### UserController Class

    * @PostMapping("users")
    * @GetMapping("getUser/{Id}")

* ### ProductController Class

    * @PostMapping("products")
    * @GetMapping("products")
    * @GetMapping("productByCat")
    * @DeleteMapping("products/{Id}")

* ### OrdersController Class

    * @PostMapping("orders")
    * @GetMapping("getOrder/{Id}")

## Services
-  *This section contains 4 classs with functions that helps API to perform their specific tasks* : 

* ### AddressService Class

    * String addAddresses(List<Address> addresses)

* ### UserService Class

    * String addUsers(List<User> users)
    * User getUser(Integer id)

* ### OrdersService Class

    * String addOrder(Orders orders)
    * Orders getOrder(Integer id)

* ### ProductService Class
    
    * String addProducts(List<Product> products)
    * Iterable<Product> getAllProds()
    * List<Product> productByCat(Category category)    

## Model
- *This section contains 4 models as required by project named **User**, **Address**, **Product**, **Orders**. Each have their relative datamembers in them which will be used as columns to store their respective data*.    

##  Repository
- *This section contains 4 **Interfaces** named IUserRepo, IAddressRepo, IProductRepo, IOrdersRepo.*

- *Some of which extends the **CRUDRepository** of JPA, some extends JpaRepository, which defines various funtionality of interface and by extension via object of this interface we can access CRUDRepository and JpaRepository methods to provide funtionality to our project*.


## Database Design
- *In this section we used the models as mentioned in Model section, which are used as a table to store data*.
- *It also uses **Relational Database** and **JPA** to create datastructure*.
- *We use **MYSQL** which is a management system for relational data*

## Data Structure Used

- *We used **Relational database** along with **JPA** as the data source in this project*.

- *Relational Data is stored in form of tables which further can be connected via various types of mappings/relations, such as One to One, One to Many, etc*.

- *This kind of data persists forever and we use **SQL** to manipulate this data via MYSQL.*

- *Here we also used the concept of **Mapping** which uses **Foreign Keys** to define relation between 2 tables.*
## Summary

*This project performs the task of managing Orders with various types of API's like **Get, Post, Put, Delete***.

*This project is also connected to a relational data which is the data source of this project.*

*We used **MVC Architecture** to create this project. 
And this is created in **SpringBoot** using **Maven** and **Java**.*


## 🔗 Links
[![Github](https://img.shields.io/badge/Github-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Nikhil-Sharma-CS)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/nikhil-sharma-cse)
