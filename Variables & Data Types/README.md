# Variables & Data Types

## Java Boilerplate Code
Every Java program must have a class and a `main` method. Here's the basic structure:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

### Java Output Example:
```
Hello, Java!
```

## Output in Java
```java
System.out.print("Hello World!");
```
- `print` is a **method** used to display output.
- `;` is a **statement terminator**.
- `"Hello World!"` is a **string literal**.
- Output: `Hello World!`

## Print Methods
| No. | Method    | Example                                | Description        |
|-----|-----------|----------------------------------------|-----------------------------|
| 1   | `print`   | `System.out.print("Hello World!");` | Prints text **on the same line** |
| 2   | `println` | `System.out.println("Hello World!");` | Prints text and **moves to the next line** |
| 3   | `\n`      | `System.out.print("Hello\nWorld!");` | Adds a **new line** inside the string |


## Variables
In Java, a variable is a container that holds data that can be changed during the execution of a program. It must be declared with a data type.

**Syntax:**
```java
dataType variableName = value;
```

**Example:**
```java
int age = 25;
String name = "Alice";
double height = 5.7;
boolean isStudent = true;
```

### Consider this expression:
```
a = 10, b = 5
2 * (a + b)
```

- `2` is a **literal** (a constant value).
- `a` and `b` are **variables** (they store values).

```java
int a = 10;
int b = 5;

// 'a' and 'b' are variable names
// '10' and '5' are variable values (literals)
```

### Identifiers in Java
Identifiers are the names used for classes, variables, methods, and more. They are user-defined names.

Examples of identifiers:

```java
a, b, c           // variable names
Main              // class name
main, print, println  // method names
```

**Rules for Identifiers:**
- Must begin with a letter (A–Z or a–z), `$`, or `_`
- Cannot start with a digit
- Cannot use Java keywords (like `class`, `int`, `public`, etc.)
- Are case-sensitive (`age` and `Age` are different variables).

```java
int number = 100;      // 'number' is an identifier
String message = "Hi"; // 'message' is an identifier
```

## Data Types
Java has two main types of data:

### 1. **Primitive Data Types**
These are the most basic data types in Java.

| Data Type | Size    | Description                   | Example         |
|-----------|---------|-------------------------------|-----------------|
| `byte`    | 1 byte  | Whole numbers from -128 to 127 | `byte b = 100;` |
| `short`   | 2 bytes | Whole numbers from -32K to 32K | `short s = 5000;` |
| `int`     | 4 bytes | Whole numbers                 | `int i = 100000;` |
| `long`    | 8 bytes | Very large whole numbers      | `long l = 100000L;` |
| `float`   | 4 bytes | Decimal numbers               | `float f = 5.75f;` |
| `double`  | 8 bytes | More precise decimal numbers  | `double d = 19.99;` |
| `char`    | 2 bytes | Single character              | `char c = 'A';` |
| `boolean` | 1 bit   | True or false                 | `boolean b = true;` |

### 2. **Non-Primitive (Reference) Data Types**
These are used to store objects and include classes, arrays, strings and Interface.
**Examples:**
```java
String greeting = "Hello, World!";
int[] numbers = {1, 2, 3, 4, 5};
```

## Variable Declaration Tips:
- Variable names should be meaningful.
- They must start with a letter, `$`, or `_`, but not with a digit.
- Java is case-sensitive (`age` and `Age` are different variables).

## Input in Java

### Java Input with Scanner

This example demonstrates how to take user input in Java using the `Scanner` class from `java.util`.

### Sample Code
```java
import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking an integer input
        int num = sc.nextInt();
        System.out.println(num); // prints the integer input

        sc.close();
    }
}
```

### Common Scanner Methods

| Method         | Description                             | Example                        |
|----------------|-----------------------------------------|--------------------------------|
| `next()`       | Reads a single word                     | `String word = sc.next();`     |
| `nextLine()`   | Reads a full line (sentence)            | `String line = sc.nextLine();` |
| `nextInt()`    | Reads an integer                        | `int num = sc.nextInt();`      |
| `nextByte()`   | Reads a byte                            | `byte b = sc.nextByte();`      |
| `nextFloat()`  | Reads a float                           | `float f = sc.nextFloat();`    |
| `nextDouble()` | Reads a double                          | `double d = sc.nextDouble();`  |
| `nextBoolean()`| Reads a boolean                         | `boolean b = sc.nextBoolean();`|
| `nextShort()`  | Reads a short                           | `short s = sc.nextShort();`    |
| `nextLong()`   | Reads a long                            | `long l = sc.nextLong();`      |

#### Notes
- Use `.next()` for single words.
- Use `.nextLine()` for full sentences.
- Always close the scanner with `sc.close();` to avoid memory leaks.

## Java Type Conversion (Implicit / Widening)
This example demonstrates **Type Conversion** in Java, where a smaller data type is automatically converted into a larger compatible type.

### Notes
- Conversion happens when:
  1. Types are **compatible**
  2. **Destination type > Source type**
- **Implicit Conversion** (also called **Widening** or **Type Conversion**) is done automatically by Java.

### Widening Conversion Order:
```
byte → short → int → long → float → double
```

No data is lost in widening conversions.

## Java Narrowing (Explicit) Type Casting

**Narrowing Conversion** is when a larger data type is converted to a smaller one, requiring an explicit cast.

### Example:
```java
public class TypeCasting {
    public static void main(String[] args) {
        float a = 25.12f;
        int b = (int) a;  // float → int (truncates decimal)
        System.out.println(b); // Output: 25

        char ch = 'a';
        int number = ch;  // char → int (ASCII value)
        System.out.println(number); // Output: 97
    }
}
```

#### Key Notes:
- Requires **explicit cast** `(int)`.
- **Truncates** decimal part in `float → int`.
- **ASCII value** for `char → int`.

## Type Promotion in Expressions
1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
2. If one oparand is long, flost or double the whole expression is promoted to long, float, or double respectively.


### Example 1: Char Promotion
```java
public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a'; // ASCII = 97
        char b = 'b'; // ASCII = 98

        System.out.println((int) b);   // 98
        System.out.println((int) a);   // 97
        System.out.println(b - a);     // 1 → promoted to int
    }
}
```

#### Explanation:
- `b - a` → `'b' - 'a'` → `98 - 97` → **1**
- Both `char` values are promoted to `int` before subtraction.

### Example 2: Mixed Types
```java
public class TypePromotion2 {
    public static void main(String[] args) {
        byte x = 10;
        byte y = 20;
        int result = x * y; // both bytes promoted to int
        System.out.println(result); // Output: 200

        float f = 10.5f;
        int i = 2;
        float res = f * i; // int promoted to float
        System.out.println(res); // Output: 21.0
    }
}
```
#### Rules Recap:
1. `byte`, `short`, `char` → **promoted to `int`** in expressions.
2. If one operand is `long`, `float`, or `double` → whole expression becomes that type.

## Type Promotion with Byte in Java

In Java, arithmetic operations on `byte`, `short`, and `char` are **promoted to `int`** automatically.

### ❌ Wrong:
```java
byte b = 5;
b = b * 2; // Error: result is int, cannot assign to byte directly
```

### ✅ Correct:
```java
byte b = 5;
b = (byte) (b * 2); // Explicit cast required
```

#### Why?
- `b * 2` promotes `b` to `int`
- Result is `int`, and Java doesn’t auto-convert `int` back to `byte`
- You must cast it manually using `(byte)`

✅ Always cast manually when assigning arithmetic results back to `byte`, `short`, or `char`.

## How Java Code Runs
1. **Write** code in a `.java` file.
2. **Compile** using `javac` to convert it into **bytecode** (`.class` file).
3. **Run** the bytecode with the **Java Virtual Machine (JVM)** using `java`.

### 🔁 Flow:
```
.java → [javac] → .class → [JVM] → Output
```

#### Tools:
- `javac` → Java Compiler
- `java` → Java Interpreter (runs on JVM)

✅ JVM makes Java **platform-independent**.
