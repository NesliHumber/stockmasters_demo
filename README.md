# StockMasters: Inventory Management System

## Project Description
**StockMasters** is a robust E-Commerce Inventory Management Platform designed for businesses operating with **multi-location warehouses**. Developed using a **Spring Boot + Thymeleaf + JPA** system, the platform addresses real-world needs like accurate stock counts, seamless transfers between locations, and detailed movement tracking. 

The platform provides a centralized dashboard for monitoring Key Performance Indicators (KPIs) and managing distribution centers across regional hubs.

Key Features

**KPI Dashboard**: Four high-level cards displaying Total Products, Total Warehouses, Low Stock Items, and Total Stock Value.
**Data Visualization**: Graphical charts for warehouse inventory levels and 30-day stock movement trends.
Multi-Location Management: Regional overview of centers with capacity monitoring and manager metadata.
**Inventory Control**: A structured grid for tracking SKU, product health, and performing in-line stock transfers.
**Product Catalog**: Card-based system featuring dynamic search by name, SKU, or brand.

---

## 👥 Meet the Team
* **Veevek Auckloo**: Focuses on Java logic implementation and core feature planning.
* **Aakarshan Sharma**: UI design, CRUD page implementation, and backend integration support.
* **Neslihan Ustaoglu**: UI design, backend development support, and Quality Assurance (QA) testing.
* **Xia Wang**: Database structure, creation, and connection management.

---

## 📂 Project Structure
```bash
my-spring-app/
├── 📁 src/
│   ├── 📁 main/
│   │   ├── 📁 java/com/example/project/
│   │   │   ├── 📄 ProjectApplication.java   # Entry point
│   │   │   ├── 📁 controller/               # API Endpoints
│   │   │   ├── 📁 service/                  # Business Logic
│   │   │   ├── 📁 repository/               # Data Access
│   │   │   ├── 📁 model/                    # Entities & DTOs
│   │   │   └── 📁 config/                   # Configuration Beans
│   │   └── 📁 resources/
│   │       ├── 📁 static/                   # CSS/JS/Images
│   │       ├── 📁 templates/                # HTML Templates
│   │       └── 📄 application.yml           # App Config
│   └── 📁 test/                             # Unit & Integration Tests
├── 📄 pom.xml                               # Maven Dependencies
└── 📄 README.md                             # Documentation
```

---

## 🚀 Key Features
* **KPI Dashboard**: Four high-level cards displaying Total Products, Total Warehouses, Low Stock Items, and Total Stock Value.
* **Data Visualization**: Graphical charts for warehouse inventory levels and 30-day stock movement trends.
* **Multi-Location Management**: Regional overview of centers with capacity monitoring and manager metadata.
* **Inventory Control**: A structured grid for tracking SKU, product health, and performing in-line stock transfers.
* **Product Catalog**: Card-based system featuring dynamic search by name, SKU, or brand.

---

## 🛠 Technical Stack
* **Backend**: Java (Spring Boot)
* **Frontend**: Thymeleaf
* **Database**: JPA / Relational Database

---

## ⚙️ How to Run the Project

### Prerequisites
* **JDK 17 or higher**
* **Maven**
* **Database** (MySQL, PostgreSQL, or H2 as configured in JPA)

### Installation & Launch
1. **Clone the repository:**
   ```bash
   git clone https://github.com/NesliHumber/stockmasters_demo.git
   cd stockmasters

2. **Build the Project: Use the Maven wrapper to install dependencies and compile the code**
   ```bash
   ./mvnw clean install

3. **Run the Application: Start the Spring Boot server:**
   ```bash
   ./mvnw spring-boot:run

4. **Access the Dashboard: Once the terminal shows "Started ProjectApplication," open your browser and navigate to:**
   ```bash
   http://localhost:8080
