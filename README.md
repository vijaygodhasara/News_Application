# News Application

## Overview

The News Application is a full-stack web application that allows users to browse, add, update, and manage news articles. The backend is built with Spring Boot (Java) and the frontend is developed using React with TypeScript.

## Features

- **View News**: Display a list of the latest news articles.
- **Add News**: Provide a form to add new news articles.
- **Update News**: Modify existing news articles.
- **Delete News**: Remove news articles.
- **Responsive UI**: Accessible on both desktop and mobile devices.
- **REST API**: Backend APIs built with Spring Boot.

## Technologies Used

### Backend

- **Java 11**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Lombok**
- **Maven**

### Frontend

- **React**
- **TypeScript**
- **Axios**
- **Twind**
- **Bootstrap**
- **Create React App**

## Project Structure

### Backend

- `src/main/java/com/example/newsapp`: Java code including controllers, services, and repository classes.
- `src/main/resources`: Application properties and static resources.
- `src/test/java/com/example/newsapp`: Unit and integration tests.

### Frontend

- `src/components`: React components like `NewsList`, `NewsItem`, `AddNews`.
- `src/services`: Service files for API interactions.
- `src/App.tsx`: Main React component.
- `src/index.tsx`: Entry point for the React application.
- `public`: Static files.

## Prerequisites

- **Java 11** or higher
- **Node.js** (v14.x or later) and **npm** (v6.x or later)
- **PostgreSQL** database
- **Maven**

