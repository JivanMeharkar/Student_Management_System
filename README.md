
# 🎓 Student Management System – Spring Boot Web App

A full-stack web application built using **Spring Boot + Thymeleaf + MySQL** that allows managing student data (First Name, Last Name, Email) with full **CRUD operations**, clean UI, and modular backend layers (Controller, Service, Repository).

---

## 📌 Key Features

✅ Add, update, view & delete students  
✅ MySQL database integration with JPA  
✅ Thymeleaf-based responsive UI  
✅ Clean layered architecture (MVC)  
✅ Bootstrap 5 based layout  
✅ Auto form validation & alert messages  
✅ RESTful API-friendly structure

---

## 🧱 Database Entity: `Student`

```java
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="first_name")
    private String firstname;

    @Column(name="last_name")
    private String lastname;

    private String email;
}


Folder Structure
src/
├── main/
│   ├── java/com/demo/
│   │   ├── controller/       # Web & API endpoints
│   │   ├── service/          # Business logic layer
│   │   ├── repository/       # JPA Repository
│   │   └── entity/           # Student.java
│   └── resources/
│       ├── templates/        # Thymeleaf HTML files
│       ├── static/           # CSS, JS, Images
│       └── application.properties
└── test/                     # JUnit test cases (optional)


 Application.properties
properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8080
## 🔗 REST Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| GET | `/students` | List students |
| POST | `/students/save` | Create student |
| GET | `/students/edit/{id}` | View edit form |
| POST | `/students/update/{id}` | Update student |
| GET | `/students/delete/{id}` | Delete student |

## 🚀 Running Locally

```bash
git clone https://github.com/JivanMeharkar/student-management-system.git
cd student-management-system
./mvnw spring-boot:run
```

Ensure MySQL database `studentdb` is running and credentials are set in `application.properties`.

## 👤 Author

**Jivan Meharkar** — MSc CS | Java & Spring Boot Developer


