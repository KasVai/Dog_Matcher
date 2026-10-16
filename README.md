# Dog Matcher 🐾

## About the Project
The **Dog Matcher** project is an interactive, Java-backed desktop application designed to streamline the process of connecting potential pet owners with compatible dogs. By evaluating specific traits, preferences, and criteria through a graphical user interface (GUI), the system helps match users with dogs that fit their lifestyle.

---

## Project Architecture & File Structure

The project is organized into core backend matching logic, a desktop GUI, and supplementary assets:

- **`Dog.java`**: The primary Java Swing GUI class that builds the application window, layout, buttons, and handles user event interactions.
- **`DogFinder.java`**: The core algorithmic matching engine that processes user choices, evaluates breed criteria, and computes the optimal match
- **`styles.css`**: A stylesheet included in the repository for potential future web implementations.
---

## Key Features
- **Interactive Java Swing GUI:** A clean desktop interface with clickable buttons and real-time choice tracking.
- **Custom Search & Filtering Logic:** A built-in matching engine to filter and compare user selections against a database of dog breeds.
- **Object-Oriented Architecture:** Clean separation of UI rendering (`Dog.java`) and algorithmic matching logic (`DogFinder.java`).

---

## Getting Started & Installation

### Prerequisites
- Ensure you have the **Java Development Kit (JDK)** installed on your machine.

### Compilation and Execution
1. Open your terminal or command line interface and navigate to the directory containing your project source files.
2. Compile the Java source files using the Java compiler
   ```bash
   javac Dog.java DogFinder.java
