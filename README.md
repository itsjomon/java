# Java – Programming & DSA Notes
Welcome to the **Java Programming & Data Structures/Algorithms** repository!  
This repo is a complete collection of concepts, code, and problem-solving notes created while learning **Java** as the primary language.

## About Java
Java is a high-level, object-oriented programming language designed to have as few implementation dependencies as possible. It's known for:

- Platform Independence – *Write Once, Run Anywhere (WORA)*
- Strong Object-Oriented Design
- Rich standard libraries and APIs
- Use in web, desktop, mobile, and enterprise applications

## Setting Up Java Locally
### 1. Install Java (JDK)
To compile and run Java programs, install the Java Development Kit (JDK).

- Download:
  - [Oracle JDK](https://www.oracle.com/java/)
  - [OpenJDK](https://openjdk.org/)

- Verify installation:
```bash
java -version
javac -version
```

### 2. Set JAVA_HOME Environment Variable (Optional)
**Windows:**
- Set `JAVA_HOME` and update `PATH` to include `JAVA_HOME/bin`

**macOS/Linux:**
```bash
export JAVA_HOME=/path/to/jdk
export PATH=$JAVA_HOME/bin:$PATH
```

## Creating and Running Java Programs

### Option 1: From Command Line
```bash
cd /path/to/your/file
javac Main.java       # Compiles the Java file
java Main             # Runs the compiled class
```

### Option 2: Using an IDE
Supported IDEs:
- IntelliJ IDEA
- Eclipse
- Visual Studio Code (with Java extensions)

**For VS Code:**
1. Install **Java Extension Pack**
2. Press `Ctrl + Shift + P` → "Create Java Project"
3. Choose `No Build Tools`
4. Select folder and name the project
5. Add code to `App.java` or create new files

## Java Boilerplate Code
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

**Output:**
```
Hello, Java!
```

## Java Language Features
- Object-Oriented Programming (OOP)
- Multithreading Support
- Automatic Garbage Collection
- Security and Exception Handling
- Platform Independence via JVM
- Robust API and Frameworks (Spring, JavaFX, etc.)

## Repository Structure
This repository is organized by topics and DSA practice folders:

```text
java/
│
├── Flowcharts & Pseudocodes/
│
├── Variables & Data Types
│   ├── Area.java                # Calculate area of a circle using user input
│   └── Sum.java                 # Sum of a & b
│
├── Operators/
│   └── LogicalOperator.java     # Logical AND, OR, NOT examples
└── ...
```

> Each topic is organized into its own subfolder (e.g., Operators/, Loops/, Arrays/) containing .java files that cover the concept in depth.
> Each .java file is named to reflect the specific concept or example it implements (e.g., Area.java, LogicalOperator.java), making it easy to navigate and understand.

## Notes
This repository is built progressively as a learning companion through a structured course on **Java Programming and DSA**. It includes:

- Code samples
- Study notes
- DSA problems & solutions
- DSA Practice Sessions, etc

## Repository Overview
> Continue adding entries as new topics are added to the repository.

| Topics Covered                                    |
|---------------------------------------------------|
| [Flowcharts & Pseudocodes](./Flowcharts%20%26%20Pseudocodes) |
| [Variables & Data Types](./Variables%20%26%20Data%20Types) |
| [Operators](./Operators) |

## License
This repository is licensed under the [MIT License](./LICENSE).

## ⭐ Support
If you find this helpful, give it a ⭐ on GitHub and feel free to fork it for your own learning journey!
