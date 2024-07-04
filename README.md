# Java Database Connectivity (JDBC) Studies

## General Objective

* Know the main features of [**JDBC**](https://www.ibm.com/docs/en/cics-ts/6.1?topic=server-java-database-connectivity-jdbc) in theory and practice.
* Develop the basic structure of a project with **JDBC**.
* Implement the [**DAO Pattern**](https://www.geeksforgeeks.org/data-access-object-pattern/) (Data Access Object) manually with **JDBC**.

## Studies Overview

### **JDBC** 

* Java's standard API for data access

<img src="/assets/imgs/jdbc.png" alt="JDBC" width="600">

### **DAO:**

* Data Access Object Pattern or DAO pattern is a way of organizing code to handle the communication between your program and a database. It helps keep your code clean and separates the logic for interacting with data from the rest of your application.

<img src="/assets/imgs/dao.png" alt="DAO" width="600">

## Folders Overview

1. jdbc_v(1, 2, 3, 4, 5, 6) - Setting some fundamentals ideas.
2. jdbc_dao - Implementation of some advanced methods.

<img src="/assets/imgs/overview.png" alt="FOLDERS" width="600">

## Tips & Tricks

- Use PreparedStatement instead of Statement to avoid SQL Injection.

## Installations of the tools (MacOS)

* [MySQL Community Server](https://dev.mysql.com/downloads/mysql/)
* [MySQL Workbench](https://dev.mysql.com/downloads/workbench/)
* [MySQL Java Connector](https://dev.mysql.com/downloads/connector/j/) - Select __*Platform Independent*__ 

## Adding the MySQL to PATH (MacOS)

1. At the Terminal, type:

``````
~% open .zshrc
``````

2. At the new zshrc tab, type:

``````
# MySQL Path.
export PATH=${PATH}:/usr/local/mysql-8.0.37-macos14-arm64/bin
``````

Now, save and close the tab.


