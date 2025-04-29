# 🧮 Operators in Java

In Java, **operators** are symbols that instruct the compiler to perform specific operations on variables and values.


## 📌 Example
```java
sum = a + b;
// a, b are operands
// + is an operator
```

## 🔢 Types of Operators

- Arithmetic Operators (Binary / Unary)
- Relational Operators
- Logical Operators
- Bitwise Operators
- Assignment Operators

## ➕ Arithmetic Operators

### Binary Operators
| Operator | Description       | Example    |
|----------|-------------------|------------|
| `+`      | Addition           | `a + b`    |
| `-`      | Subtraction        | `a - b`    |
| `*`      | Multiplication     | `a * b`    |
| `/`      | Division           | `a / b`    |
| `%`      | Modulus (Remainder)| `a % b`    |

### Unary Operators
| Operator | Description               | Example      |
|----------|---------------------------|--------------|
| `++`     | Increment (Pre/Post)      | `++a`, `a++` |
| `--`     | Decrement (Pre/Post)      | `--a`, `a--` |

#### 🔼 Increment Operator
- `++a`: Pre-increment → value changes, then used
- `a++`: Post-increment → value used, then changes

#### 🔽 Decrement Operator
- `--a`: Pre-decrement → value changes, then used
- `a--`: Post-decrement → value used, then changes

## 🔁 Relational Operators

| Operator | Description                | Example       |
|----------|----------------------------|---------------|
| `==`     | Equal to                   | `a == b`      |
| `!=`     | Not equal to               | `a != b`      |
| `>`      | Greater than               | `a > b`       |
| `<`      | Less than                  | `a < b`       |
| `>=`     | Greater than or equal to   | `a >= b`      |
| `<=`     | Less than or equal to      | `a <= b`      |

## 🔀 Logical Operators

| Operator | Description   | Example         |
|----------|---------------|-----------------|
| `&&`     | Logical AND    | `a > 5 && b < 10` |
| `||`     | Logical OR     | `a > 5 || b < 10` |
| `!`      | Logical NOT    | `!isTrue`       |

### && (Logical AND)
| Statement 1 | Statement 2 | Result |
|-------------|-------------|--------|
| T           | T           | T      |
| T           | F           | F      |
| F           | T           | F      |
| F           | F           | F      |

### || (Logical OR)
| Statement 1 | Statement 2 | Result |
|-------------|-------------|--------|
| T           | T           | T      |
| T           | F           | T      |
| F           | T           | T      |
| F           | F           | F      |

### ! (Logical NOT)
| Statement | Result |
|-----------|--------|
| T         | F      |
| F         | T      |

## 📝 Assignment Operators

| Operator | Description             | Example     |
|----------|-------------------------|-------------|
| `=`      | Assignment               | `a = b`     |
| `+=`     | Add and assign           | `a += b`    |
| `-=`     | Subtract and assign      | `a -= b`    |
| `*=`     | Multiply and assign      | `a *= b`    |
| `/=`     | Divide and assign        | `a /= b`    |
| `%=`     | Modulus and assign       | `a %= b`    |
