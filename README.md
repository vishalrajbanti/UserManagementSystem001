
# User Management System

## Table of content 
   - [Frameworks and Language Used](#frameworks-and-language-used)
- [Data Flow](#data-flow)
  - [1. Controller](#1-controller)

- [API Reference](#API-Reference)
- [Data Structures Used ](#Data-Structures-Used)
 - [Key Features](#Key-Features)
   - [1. User CRUD Operations](#1-User-CRUD-Operations)
   - [2. Key Features](#2-Key-Features)
   - [3. Customizable and Extendable](#3-Customizable-and-Extendable)
- [Project Summary](#project-summary)
- [Acknowledgments](#Acknowledgments)
- [Support](#Support)



## Frameworks and Language Used
- Spring Boot
- Java
- Maven

## Data Flow

### 1. Controller
- Controller handles incoming HTTP requests.
- It defines endpoints for adding, retrieving, updating, and deleting user information.






## API Reference

#### Post user

```http
  POST user
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
|`Request body`  | `user object` | **Required**. list to add. |

#### Get all users

```http
  GET users
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| ``      | `` | **Required**. list to  fetch |

#### GET  a user
```http
  Get user/id/userid/{Id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `pathVariable`      | `id` | **Required**. list to  fetch |

#### Update a user

```http
  Put user/number/{id}/num
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `pathVariable,RequestParam`      | `Integer,String` | **Required**. list to  update. |

#### Delete a user

```http
  Delete user/del/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `pathVariable`      | `Integer` | **Required**. list to  remove. |




## Data Structures Used

In the User Management System project, the following data structures are used:


- **UserId**: A unique identifier for each user. This serves as the primary key in the database table.

- **Name**: Field to store the name of the user.

- **UserName**: Field to store the username of the user. Used for login and identification.

- **Address**: Field to store the user's address information.

- **Phone Number**: Field to store the user's phone number.

## Key Features

The User Management System is designed to provide efficient user management capabilities. Here are the key features of this application:

### 1. User CRUD Operations

- **Add User**: Create new user profiles by providing essential details, including name, username, address, and phone number.

- **Get User by UserId**: Retrieve user information by specifying a unique user ID.

- **Get All Users**: Retrieve a list of all users in the system.

- **Update User Information**: Modify user information, including their name, username, address, and phone number.

- **Delete User**: Permanently remove user profiles from the system.

### 2. Scalable and Maintainable Architecture

- Utilizes the Spring Boot framework for building robust and scalable applications.

- Follows a well-structured layered architecture, separating concerns between controllers, services, and repositories, ensuring maintainability and testability.



### 3. Customizable and Extendable

- Easily extensible to add more features or attributes to the user profile.


## Project Summary
This project is a User Management System built using Spring Boot. It provides a set of RESTful API endpoints for managing user information, including adding, retrieving, updating, and deleting user records. The project follows a layered architecture with controllers handling HTTP requests, services containing business logic, and a repository for database operations. User data is stored in a database table with attributes UserId, Name, UserName, Address, and Phone Number.




## Acknowledgments

We would like to express our gratitude to the following individuals and projects for their contributions and support to the User Management System:

- **[Vishal Raj]**: Lead developer and project coordinator.
- **[Mainak Ghosh]**: Contributor to the project, helping with [SpringBoot to complete this project].
- **[maven]**: We utilized [maven] for [dependencies] in our project.
- **Stack Overflow Community**: For their invaluable assistance in resolving technical challenges.
- **Spring Framework**: For providing a robust and efficient platform for building our application.


We appreciate the  effort and support that made this project possible.



## Support

For support, email vishalrajbanti@gmail.com.

## thank you.