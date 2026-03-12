-- Création de la base de données
CREATE DATABASE todo_db;

-- Se connecter à la base
\c todo_db;

-- Création de la table tasks
CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50)
);

-- Insertion de quelques données de test
INSERT INTO tasks (title, description, status) VALUES
('Apprendre Spring Boot', 'Comprendre le CRUD avec Spring Boot', 'IN_PROGRESS'),
('Faire le projet', 'Terminer le projet pour le cours', 'IN_PROGRESS'),
('Tester l API', 'Tester les endpoints avec Swagger', 'PENDING');

-- Voir les données
SELECT * FROM tasks;
