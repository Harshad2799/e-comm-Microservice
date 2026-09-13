# e-comm-Microservice
e-com project using microservices architecture and kafka for event driven system end to end flow 


# E-Commerce Microservices

An e-commerce backend project built using **Microservices Architecture** with **Spring Boot**, **Apache Kafka**, **PostgreSQL**, **Redis**, and **JWT-based authentication**.

The project is designed to demonstrate an end-to-end e-commerce workflow using event-driven communication, authentication, distributed services, caching, and CI/CD.

## Architecture

The application is divided into multiple independent microservices, where each service is responsible for a specific business capability.

### Planned Services

* Authentication Service
* Product Service
* Order Service
* Inventory Service
* Payment Service
* Delivery Service
* Notification Service

## Authentication Service

The Authentication Service is responsible for user registration, login, authentication, and authorization.

### Technologies & Features

* **Spring Security** for authentication and authorization
* **JWT** for stateless authentication
* **Private/Public Key Cryptography** for signing and validating JWTs
* **BCryptPasswordEncoder** for secure password hashing
* **PostgreSQL** for storing user information
* **Redis** for temporary/common data and token-related use cases

### Authentication Flow

Client
   |
   | Login
   v
Authentication Service
   |
   | Validate credentials
   v
PostgreSQL
   |
   | User authenticated
   v
Generate JWT
   |
   v
Client

For protected requests:

Client
   |
   | Authorization: Bearer <JWT>
   v
API Gateway / Service
   |
   v
JWT Authentication Filter
   |
   | Validate JWT
   v
Spring Security Context
   |
   v
Controller

## Event-Driven Architecture

**Apache Kafka** is used for asynchronous communication between microservices.

Services publish and consume business events rather than directly coupling every service through synchronous API calls.

Example:

Order Service
      |
      | ORDER_CREATED
      v
    Kafka
      |
      +-------------> Inventory Service
      |
      +-------------> Payment Service

Possible events include:

* `ORDER_CREATED`
* `INVENTORY_RESERVED`
* `INVENTORY_RESERVATION_FAILED`
* `PAYMENT_SUCCESS`
* `PAYMENT_FAILED`
* `ORDER_CONFIRMED`
* `ORDER_CANCELLED`
* `DELIVERY_CREATED`
* `ORDER_SHIPPED`
* `ORDER_DELIVERED`

## Database

Each microservice will follow the **Database-per-Service** approach.

Authentication Service -> PostgreSQL
Order Service          -> PostgreSQL
Payment Service        -> PostgreSQL
Inventory Service      -> PostgreSQL
Delivery Service       -> PostgreSQL
Product Service        -> MongoDb

Services should own their respective data and should not directly access another service's database.

## Redis

Redis will be used for use cases such as:

* Caching frequently accessed data
* Cart data
* Refresh-token/session-related data
* Idempotency keys
* Rate limiting
* Other temporary/common data

## Logging

**SLF4J + Logback** will be used for application logging.

The project will also use correlation/request IDs to help trace requests across multiple microservices.

## CI/CD

**GitHub Actions** will be used to build the CI/CD pipeline.

Planned pipeline:

Git Push
   |
   v
GitHub Actions
   |
   +--> Build
   |
   +--> Unit Tests
   |
   +--> Integration Tests
   |
   +--> Docker Build
   |
   +--> Push Docker Image
   |
   v
AWS Deployment

## Observability

Planned observability stack:

* Spring Boot Actuator

## Reliability & Distributed Systems

The project will also explore production-oriented microservice patterns such as:

* Saga Pattern
* Transactional Outbox Pattern
* Kafka retries
* Dead Letter Topics
* Idempotent message processing
* Circuit Breaker
* Retry and Timeout
* Distributed tracing

## Project Goal

The goal of this project is to build and understand a **production-style e-commerce microservices backend** from end to end, including:

Authentication
      ↓
API Gateway
      ↓
Microservices
      ↓
Kafka Event-Driven Communication
      ↓
Redis Caching
      ↓
PostgreSQL
      ↓
Docker
      ↓
GitHub Actions CI/CD
      ↓
AWS Deployment
      ↓
Monitoring & Observability
