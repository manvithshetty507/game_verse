# Phase 1: Centralized Config Management
Goals:
Set up config-server

Externalize config using Git

Share config across all services

Actions:
Spring Cloud Config Server setup

Create gameverse-config/ Git repo (can be local initially)

Externalize configs of Eureka, Gateway, Auth, etc.

# Phase 2: Service Discovery with Eureka
Goals:
Build eureka-server

Register services dynamically

Enable client-side load balancing

Actions:
Create Eureka server

Enable Eureka client in all services

Test registration using Docker Compose

# Phase 3: API Gateway
Goals:
Set up Spring Cloud Gateway

Route requests to underlying services

Handle CORS, rate-limiting (later)

Actions:
Setup gateway with route config from config-server

Test routing to auth-service, user-service

# Phase 4: Auth Service (JWT)
Goals:
Create basic auth-service

Register/login with JWT token

Secure endpoints using Gateway + JWT filter

Actions:
Setup /register, /login endpoints

Generate JWT on login

Add Gateway JWT validation filter

# Phase 5: User Service
Goals:
Manage user profiles, favorites

Secure routes with JWT

Actions:
Basic CRUD

Store to MySQL

Integrate with Auth Service

# Phase 6: Game Catalog Service
Goals:
Store game data

Search & filter games

Integrate with Elasticsearch

Actions:
Game CRUD

Index into Elasticsearch

Basic search endpoint

# Phase 7: Payment Service
Goals:
Mock payment workflow

Save payment history

Actions:
Mock card/UPI payment

Integrate Kafka to send event

# Phase 8: Notification Service (Kafka)
Goals:
Send emails/alerts (mock)

Consume Kafka events

Actions:
Kafka listener

Send logs/alerts

Integrate Discord webhook

# Phase 9: Observability
Goals:
Integrate Zipkin for tracing

Use Kibana for logs

Add Actuator endpoints

Actions:
Setup Spring Boot Actuator

Integrate Zipkin

Log to Elasticsearch → Kibana

