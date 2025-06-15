# QnA-board

A simple Q&A (Question & Answer) web application built with Spring Boot and Thymeleaf.

---

## 📝 About

This project implements a basic Question & Answer board where users can:

- Post questions  
- View a list of questions  
- Read question details and existing answers  
- Add answers to questions  
- Edit and delete their own questions/answers  
- Register, log in, and log out  

Built with Spring Boot (Java) and Thymeleaf templates (HTML) :contentReference[oaicite:0]{index=0}.

---

## 🚀 Features

- **User Authentication**  
  Sign up, log in, and log out using Spring Security.

- **Question Management**  
  Create, read, update, and delete questions.

- **Answer Management**  
  Post and delete answers on any question.

- **Exception Handling**  
  Custom “404 Not Found” pages when a question or answer is missing.

- **Dashboard & Statistics**  
  (Optional) Administrator dashboard showing total questions and top contributors.

---

## 📂 Project Structure
```bash
sbb/ # project Root
├── bin/ # Gradle wrapper scripts
├── build.gradle # Gradle build configuration
├── gradle/ # Gradle wrapper files
├── HELP.md # Project help notes
├── README.md # (You are here)
├── settings.gradle # Gradle configuration
└── src/
├── main/
│ ├── java/
│ │ └── com.mysite.sbb/ # 기본 패키지
│ │ ├── commonUtil.java # 공통 유틸 클래스
│ │ ├── HelloController.java
│ │ ├── HelloLombok.java
│ │ ├── MainController.java
│ │ ├── SbbApplication.java # 스프링 부트 진입점
│ │ ├── SecurityConfig.java # Spring Security 설정
│ │ ├── answer/
│ │ │ ├── Answer.java
│ │ │ ├── AnswerController.java
│ │ │ ├── AnswerForm.java
│ │ │ ├── AnswerRepository.java
│ │ │ └── AnswerService.java
│ │ ├── question/
│ │ │ ├── Question.java
│ │ │ ├── QuestionController.java
│ │ │ ├── QuestionForm.java
│ │ │ ├── QuestionRepository.java
│ │ │ └── QuestionService.java
│ │ ├── user/
│ │ │ ├── SiteUser.java
│ │ │ ├── UserController.java
│ │ │ ├── UserCreateForm.java
│ │ │ ├── UserRepository.java
│ │ │ ├── UserRole.java
│ │ │ ├── UserSecurityService.java
│ │ │ └── UserService.java
│ │ └── error/
│ │ │ ├── DataNotFoundException.java
│ │ │ └── GlobalExceptionHandler.java
│ └── resources/
│ ├── application.properties # 설정 파일
│ └── templates/ # Thymeleaf 템플릿
│ │ ├── *.html
└── test # 테스트 코드
```
---

## ⚙️ Prerequisites

- Java 11 or higher  
- Gradle 7.x (wrapper included)  
- (Optional) MySQL/MariaDB or H2 for development  

---

## 🔧 Installation & Running

1. **Clone the repo**  
   ```bash
   git clone https://github.com/HGarim/QnA-board.git
   cd QnA-board
   ```
   
2. **Configure database**
Edit src/main/resources/application.yml to point to your database. By default it uses an in-memory H2.

3. **Build & run**
   ```bash
   ./gradlew bootRun
   ```
   The app will start on http://localhost:8080.
   
4. **Access the application**

Browse to http://localhost:8080/questions to view the question list.
Sign up / log in via the “Login” link in the navbar.
