# Spring IOC with @Qualifier Annotation

This project demonstrates **Inversion of Control (IoC)** and **Dependency Injection (DI)** using the **Spring Framework**. It includes multiple service implementations (`Airtel`, `Jio`) for the `Sim` interface and uses `@Qualifier` to inject the desired implementation into the `Person` class.

## 📂 Project Structure

```
SpringIOC_Qualifier_Project/
│-- src/main/java/com/jbk/
│   ├── Airtel.java
│   ├── Jio.java
│   ├── Sim.java
│   ├── Person.java
│   ├── Config.java
│   ├── MainApp.java
│-- pom.xml
    |`<!-- Spring Core <version>6.0.17--><!-- Spring Context <version>6.0.17-->

```
## 🛠 Technologies Used

- **Java**
- **Spring Framework (Core Container)**
- **@Autowired, @Qualifier, and @ComponentScan Annotations**
- **Maven** (for dependency management)

