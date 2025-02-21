Smart AI Research Assistance

📌 Project Overview

Smart AI Research Assistance is an intelligent tool designed to summarize a selected number of texts efficiently. It leverages Spring Boot and Spring AI to provide high-performance AI-driven text summarization.

🚀 Features

AI-powered text summarization

RESTful API built with Spring Boot

Integration with Spring AI for natural language processing

Scalable and efficient backend architecture

🛠️ Technologies Used

Java 17

Spring Boot

Spring AI

WebClient (for API calls)

Maven (for dependency management)

PostgreSQL/MySQL (optional for persistence)

🔧 Installation & Setup

Clone the repository:

git clone git@github.com:musa347/Smart-AI-Research-Assistance.git
cd Smart-AI-Research-Assistance

Ensure you have Java 17+ and Maven installed.

Configure your application properties:

spring.application.name=research-assistant
gemini.api.url=https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=
gemini.api.key=${GEMINI_API_KEY}

Build and run the project:

mvn clean install
mvn spring-boot:run

📡 API Endpoints

Method

Endpoint

Description

POST

api/research/process

Summarizes the provided text

Example request:

{
  "content": "Artificial Intelligence is transforming industries...",
  "operation": "summarize"
}

🤝 Contributing

Contributions are welcome! Feel free to open an issue or submit a pull request.

📄 License

This project is licensed under the MIT License.

📩 Contact

For questions or suggestions, contact musaibrahim0028@yahoo.com.

