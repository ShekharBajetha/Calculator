

# Calculator Project

A simple calculator application that performs basic arithmetic operations such as addition, subtraction, multiplication, and division. This project demonstrates the use of Java for creating a command-line calculator and includes unit tests to ensure functionality.

## Features
- Addition
- Subtraction
- Multiplication
- Division

## Technologies Used
- Java
- Maven (for build management)
- JUnit (for testing)
- Jenkins (for Continuous Integration)

## Getting Started

### Prerequisites
- Java JDK 11 or higher
- Maven (for building and running the project)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/Calculator.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Calculator
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

## Usage
To use the calculator, you can run the main class:
```bash
java -cp target/calculator-1.0-SNAPSHOT.jar org.example.Calculator
```

## Running Tests
You can run the unit tests using Maven:
```bash
mvn test
```

## Continuous Integration

This project uses Jenkins for Continuous Integration (CI) to automate the build, testing, and deployment processes. The CI pipeline helps ensure that code changes are consistently tested and integrated, enhancing project quality and reliability.

### Jenkins Setup

1. **Installation**: Ensure that Jenkins is installed and running on your server or local machine. Download from [the official Jenkins website](https://www.jenkins.io/download/).

2. **Plugins**: Install essential plugins in Jenkins:
   - **Maven Integration Plugin**
   - **Git Plugin**
   - **Pipeline Plugin** (optional)

3. **Create a New Job**:
   - Go to the Jenkins dashboard and click on "New Item."
   - Choose "Freestyle project" (or "Pipeline") and name your job (e.g., `Calculator CI`).

4. **Configure Source Control**:
   - Under "Source Code Management," select "Git" and enter the URL of your GitHub repository.

5. **Build Triggers**:
   - Set up triggers to run the build automatically. Options include polling SCM or GitHub webhooks.

6. **Build Environment**:
   - Add a build step to "Invoke top-level Maven targets" and specify goals such as `clean install`.

### Running Tests
During the CI process, unit tests are executed automatically. Ensure your tests are defined in the `tests` directory and configured to run with Maven.

### Viewing Build Results
After each build, Jenkins provides feedback:
- View build status and detailed logs on the Jenkins dashboard.

### Notifications
Configure notifications to alert the team about build results via email or chat services like Slack.


## Acknowledgments
- [JUnit](https://junit.org) for the testing framework.

