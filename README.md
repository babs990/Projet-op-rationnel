📋 Todo Application – Spring Boot + PostgreSQL
📌 Description

Cette application est une API REST de gestion de tâches (Todo) développée avec Spring Boot en utilisant une architecture monolithique et en respectant les principes de base de SOLID.

L'application permet de gérer des tâches avec les opérations CRUD suivantes :

Créer une tâche

Voir toutes les tâches

Modifier une tâche

Supprimer une tâche

Le projet inclut également :

Swagger (documentation API)

Gestion globale des erreurs

Architecture propre en couches

Base de données PostgreSQL

🏗 Architecture du projet

Le projet suit une architecture en couches.

src/main/java/com/todoapp

controller
   TaskController

service
   TaskService
   impl/TaskServiceImpl

repository
   TaskRepository

entity
   Task

dto
   TaskDTO

mapper
   TaskMapper

exception
   GlobalExceptionHandler
   ResourceNotFoundException

Description des couches

Controller

Expose les endpoints REST de l’API.

Service

Contient la logique métier.

Repository

Permet l’accès aux données avec Spring Data JPA.

Entity

Représente les tables de la base de données.

DTO

Permet de transférer les données entre les couches.

Mapper

Convertit les objets Entity ↔ DTO.

Exception

Gère les erreurs globales de l'application.

⚙ Technologies utilisées

Java 17

Spring Boot

Spring Web

Spring Data JPA

PostgreSQL

Gradle

Swagger / OpenAPI

🗄 Configuration de la base de données PostgreSQL
1️⃣ Créer la base de données

Dans PostgreSQL :

CREATE DATABASE todo_db;

2️⃣ Configuration dans application.properties

Fichier :

src/main/resources/application.properties

spring.datasource.url=jdbc:postgresql://localhost:5432/todo_db
spring.datasource.username=postgres
spring.datasource.password=postgres

spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

🔐 Informations de connexion PostgreSQL

Configuration par défaut :

Paramètre	Valeur
Host	localhost
Port	5432
Database	todo_db
Username	postgres
Password	postgres
▶ Lancer le projet
1️⃣ Prérequis

Installer :

Java 17+

PostgreSQL

Gradle

Vérifier :

java -version
gradle -v

2️⃣ Lancer l'application

Dans le dossier du projet :

Windows :

.\gradlew bootRun


Linux / Mac :

./gradlew bootRun

🌐 Accès à l'application

L’API fonctionne sur :

http://localhost:8080

📚 Documentation Swagger

Swagger permet de tester les endpoints directement dans le navigateur.

Accéder à :

http://localhost:8080/swagger-ui/index.html

🔗 Endpoints API
Récupérer toutes les tâches
GET /tasks

Créer une tâche
POST /tasks


Body JSON :

{
 "title": "Apprendre Spring Boot",
 "description": "Comprendre le CRUD"
}

Modifier une tâche
PUT /tasks/{id}

Supprimer une tâche
DELETE /tasks/{id}

⚠ Gestion des erreurs

Les erreurs sont gérées globalement via :

GlobalExceptionHandler


Exemple de réponse :

{
 "message": "Tache non trouvée",
 "status": 404,
 "timestamp": "2026-03-12T22:10:00"
}

📌 Principe SOLID appliqué

Le projet applique certaines bonnes pratiques SOLID.

Single Responsibility Principle

Chaque couche a une responsabilité unique :

Controller → API

Service → logique métier

Repository → accès aux données

Dependency Inversion Principle

Les contrôleurs dépendent d’interfaces plutôt que d’implémentations.

👨‍💻 Auteur

Projet réalisé dans le cadre d’un exercice académique sur :

Spring Boot

API REST

Architecture Monolithique

PostgreSQL
