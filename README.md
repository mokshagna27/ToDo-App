
# To-Do List App ✔️

A simple and clean **Spring Boot MVC** web application that allows users to create, update, and manage their daily tasks.  
Built with a structured backend using **Controller–Service–Repository architecture**, persistent storage using **MySQL**, and a dynamic frontend rendered using **Thymeleaf** templates.

---

## 🚀 Features

- Create, update, and delete to-do tasks  
- Mark tasks as complete/incomplete  
- Server-side rendered UI using **Thymeleaf**  
- Fully persistent using **Spring Data JPA + MySQL**  
- Clean MVC structure for easy maintenance  

---

## 🧰 Tech Stack

**Backend**
- Java  
- Spring Boot (Spring MVC, Spring Data JPA)  

**Frontend**
- HTML  
- CSS  
- Thymeleaf  

**Database**
- MySQL  

**Build Tool**
- Maven  

---

## 📁 Project Structure

```

src/
├─ main/
│   ├─ java/com/example/todo
│   │   ├─ controller/     → Handles HTTP requests
│   │   ├─ service/        → Business logic
│   │   ├─ repository/     → JPA Repositories
│   │   └─ model/          → Entity classes
│   └─ resources/
│       ├─ templates/      → Thymeleaf HTML files
│       ├─ static/         → CSS files
│       └─ application.properties

````

---

## 🗄️ Database Configuration

Update your `application.properties` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
````

---

## ▶️ Running the Application

### 1. Clone the repository

```bash
git clone https://github.com/<your-username>/todo-app.git
cd todo-app
```

### 2. Build & run

```bash
mvn spring-boot:run
```

### 3. Access the app

Open in your browser:

```
http://localhost:8080
```

## 📦 Future Improvements

* Add user authentication
* Add due dates & reminders
* Add task categories & filters
* Add REST API endpoints

---

