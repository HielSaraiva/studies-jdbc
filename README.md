# Java Database Connectivity (JDBC) Studies

## Table of Contents

1. [General Objective](#general-objective)
2. [Studies Overview](#studies-overview)
   1. [JDBC](#jdbc)
   2. [DAO](#dao)
3. [Folders Overview](#folders-overview)
4. [Tips & Tricks](#tips--tricks)
5. [Tools](#tools-macos)
   1. [Downloads](#downloads-macos)
   2. [Adding the MySQL to path](#adding-the-mysql-to-path-macos)

---

## General Objective

* Know the main features of [**JDBC**](https://www.ibm.com/docs/en/cics-ts/6.1?topic=server-java-database-connectivity-jdbc) in theory and practice.
* Develop the basic structure of a project with **JDBC**.
* Implement the [**DAO Pattern**](https://www.geeksforgeeks.org/data-access-object-pattern/) (Data Access Object) manually with **JDBC**.

---

## Studies Overview

### **JDBC** 

* Java's standard API for data access

<img src="/assets/imgs/jdbc.png" alt="JDBC" width="600">

### **DAO:**

* Data Access Object Pattern or DAO pattern is a way of organizing code to handle the communication between your program and a database. It helps keep your code clean and separates the logic for interacting with data from the rest of your application.

<img src="/assets/imgs/dao.png" alt="DAO" width="600">

---

## Folders Overview

```bash
📦 studies-jdbc
┣ assets          # Some images
┣ jdbc_dao        # Implementing some advanced methods
┣ jdbc_v1         # Connecting to MySQL database using JDBC
┣ jdbc_v2         # Recovering data from MySQL database
┣ jdbc_v3         # Inserting data at MySQL database
┣ jdbc_v4         # Updating data from MySQL database
┣ jdbc_v5         # Deleting data from MySQL database
┣ jdbc_v6         # Carrying out transactions using JDBC
```

---

## Tips & Tricks

- Use PreparedStatement and its Set methods instead of Statement to avoid SQL Injection.

---

## Tools (MacOS)

### Downloads (MacOS)

* [MySQL Community Server](https://dev.mysql.com/downloads/mysql/)
* [MySQL Workbench](https://dev.mysql.com/downloads/workbench/)
* [MySQL Java Connector](https://dev.mysql.com/downloads/connector/j/) - Select __*Platform Independent*__ 

### Adding the MySQL to PATH (MacOS)

1. At the Terminal, type:

        open .zshrc


2. At the new zshrc tab, type:

        # MySQL Path.
        export PATH=${PATH}:/usr/local/mysql-8.0.37-macos14-arm64/bin


Now, save and close the tab.


