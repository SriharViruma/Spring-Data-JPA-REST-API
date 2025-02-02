
# Spring Boot REST API with PostgreSQL and Spring Data JPA

This project is a RESTful API built using Spring Boot that allows CRUD operations on a PostgreSQL database using Spring Data JPA.

## Features

- CRUD (Create, Read, Update, Delete) operations on the database.
- PostgreSQL integration with Spring Boot.
- RESTful API endpoints.
- Spring Data JPA for seamless database interaction.

## Technologies Used

- **Spring Boot** (v3.x recommended)
- **Spring Data JPA**
- **PostgreSQL**
- **Maven** (for dependency management)
- **Lombok** (for reducing boilerplate code)

## Prerequisites

Make sure you have the following installed:

- [JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [PostgreSQL](https://www.postgresql.org/download/)
- [Maven](https://maven.apache.org/download.cgi)

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-repo/spring-boot-postgres-api.git
cd spring-boot-postgres-api
```

### 2. Configure Database

Update the `application.properties` or `application.yml` file in `src/main/resources/` with your PostgreSQL credentials.

#### `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
```

### 3. Build and Run the Application

Run the following command to build and start the application.

```bash
mvn spring-boot:run
```

The application should now be running at `http://localhost:8080`.

### Create Entity

```json
POST /products
{
    "name": "Sample Name",
    "quantity": "Sample quantity"
    "price": "Sample price"
}
```


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
