# Dog Matcher 🐾

## About the Project
The **Dog Matcher** project is an interactive, Java-backed application designed to streamline the process of connecting potential pet owners with compatible dogs. By evaluating specific traits, preferences, or criteria, the system helps match users with dogs that fit their lifestyle, living situation, or specific requirements.

In addition to its robust Java backend, the project integrates lightweight web assets (`.html` and `.css`) to deliver an engaging user interface complete with visual styling and multimedia support.

---

## Project Architecture & File Structure

The project is organized into clean backend logic and frontend presentation components:

* **`Dog.java`**: Acts as the core data model. This class defines the attributes of an individual dog profile (such as age, breed, temperament, or size) and includes inner classes/methods (`dog$Actions`) to handle specific behavioral rules or profile states.
* **`DogFinder.java`**: The core algorithmic and search engine of the application. It processes user queries, iterates through available dog records, computes compatibility, and outputs the optimal matches.
* **`styles.css`**: Provides the aesthetic framework for the web-facing parts of the application, ensuring a clean, responsive, and visually appealing user experience.
---

## Key Features
* **Object-Oriented Profile Management:** Leverages Java classes to manage individual animal profiles and behaviors seamlessly.
* **Custom Search & Filtering Logic:** Built-in engine to filter and sort through records to find optimal pairings. 
* **Multimedia Integration:** Includes web pages and styling to support video displays and interactive browsing.

---

## Getting Started & Installation

### Prerequisites
* Ensure you have the **Java Development Kit (JDK)** installed on your machine.

### Compilation and Execution
1. Open your terminal or command line interface and navigate to the directory containing your project source files.
2. Compile the Java source files using the Java compiler:
   ```bash
   javac Dog.java DogFinder.java
