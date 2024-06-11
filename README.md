# Finance Client - Backend

## Overview

The backend of the Finance Client project is responsible for handling all server-side operations, 

## Technologies Used

- **Spring Boot 3**: A powerful framework for building Java-based applications.
- **Spring Security 6**: Provides authentication and authorization mechanisms for securing the application.
- **JWT Token Authentication**: Ensures secure communication between the client and server.
- **Spring Data JPA**: Simplifies data access and persistence using the Java Persistence API.
- **JSR-303 and Spring Validation**: Enables validation of objects based on annotations.
- **OpenAPI and Swagger UI Documentation**: Generates documentation for the API endpoints.
- **Docker**: Facilitates containerization of the backend application for deployment.

## Setup Instructions

To set up the backend of the Finance Client project, follow these steps:

1. Clone the repository:

```bash
   git clone https://github.com/amenzribi/FinanceClient.git
```

2. Run the docker-compose file

```bash
  docker-compose up -d
```



3. Install dependencies (assuming Maven is installed):

```bash
  mvn clean install
```



5. Access the API documentation using Swagger UI:

Open a web browser and go to `http://localhost:8088/swagger-ui/index.html.

## License

This project is licensed under the Apache License 2.0. See the [LICENSE](LICENSE) file for details.

## Contributors


