# Dance School Backend

This project was created as a backend to the website, providing features as APIs.

## Getting Started

These guidelines aims to instruct on how to have the project up and running on your local machine for development and
 testing purposes.

### Tech Stack

- Java 8
- Maven
- SpringBoot
- PostgreSQL

### Development

1. To start the development, it is necessary to clone the GitHub project in a directory of your choice:
   
    - **SSH**
    ```
    cd "directory of your choice"
    git clone git@github.com:fvv-vasquez/dance-school-backend.git
    cd dance-school-backend
    ```
       
    - or **HTML**
    ```
    cd "directory of your choice"
    git clone https://github.com/fvv-vasquez/dance-school-backend.git
    cd dance-school-backend
    ```
   
1. Download the project website in [here](https://github.com/fvv-vasquez/study-website-danceschool.git)

1. Get the scripts on the [scprit folder](db-scripts/danceschooldb.sql), then execute it on PostgreSQL database
, assuming that you already have installed on your machine, otherwise, first install the database

1. Run in the command line:
    ```
    mvn spring-boot:run
    ```

### APIs

* To list all current available classes offered by the school 

```
GET /dance-types
```

Request: No payload or query parameters required

Sample response:

```
  [
    {
        "id": 1,
        "title": "Ballet",
        "description": "Sua linguagem desenvolvida em séculos..."
    },
    {
        "id": 2,
        "title": "Contemporâneo",
        "description": "A dança contemporânea é multidisciplinar..."
    },
  ]
```

Response code: `200 OK`

* To register a new contact from the website, therefore the school can contact later

```
POST /saveContact
```

Request Body:
```
{
    "name": "<insert the name of the contact>",
    "email": "<insert the email of the contact>",
    "address": "<insert the address of the contact>",
    "cellphone": "<insert the cellphone of the contact>",
    "danceType": "<insert the dance type of interest>",
    "schedule": "<insert the schedule of interest>",
    "age": "<insert the age of the student>",
    "level": "<insert the level of the student>",
    "comment": "<insert a comment>"
}
```

Sample response:
```
{
    "name": "user",
    "email": "user@gmail.com",
    "address": "abc street",
    "cellphone": "11974536798",
    "danceType": "jazz",
    "schedule": "night",
    "age": 25,
    "level": "begginner",
    "comment": "I want more information about the jazz class."
}
```

Response code: `200 OK`
