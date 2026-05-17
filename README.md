<div align="center">

# 🧮 Matrix Multiplication (Java)  
### ⚡ Interactive CLI program to multiply two matrices using classic \(O(n^3)\) algorithm

<img alt="Java" src="https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk&logoColor=white"/>
<img alt="CLI" src="https://img.shields.io/badge/Type-CLI-blue?style=for-the-badge"/>
<img alt="Status" src="https://img.shields.io/badge/Build-Passing-brightgreen?style=for-the-badge"/>

<br/>

**A simple, educational Java project that:** 
- ✅ takes Matrix **A** and **B** from user input  
- ✅ validates multiply-ability (**cols(A) == rows(B)**)  
- ✅ prints the resulting matrix **C = A × B**  

</div>

---

## 🌟 Preview (What it does)

### 🧾 Example Input/Output

> **Example:** A is \(2 \times 3\), B is \(3 \times 2\)

**Input**
```text
====== Matrix Multiplication ===========

==Create Matrix A |  Enter True Value
 Enter Row:
2
Enter Column:
3
| Enter Elements:
A[1][1]::1
A[1][2]::2
A[1][3]::3
A[2][1]::4
A[2][2]::5
A[2][3]::6

 ==Create Matrix B | Enter True Value
 Enter Row:
3
Enter Column:
2
Enter Elements:
B[1][1]::7
B[1][2]::8
B[2][1]::9
B[2][2]::10
B[3][1]::11
B[3][2]::12
```

**Output**
```text
Result Mmultiply Matrix A * B:
58  64  
139  154  
```
---
<div align="center">


## 🧠 How Matrix Multiplication Works
</div>
Given:

- \(A\) with size \(r_A \times c_A\)
- \(B\) with size \(r_B \times c_B\)

Matrix multiplication is possible only if:

\[
c_A = r_B
\]

Then the output matrix \(C\) will have size:

\[
C: r_A \times c_B
\]

And each element is computed by:

\[
C[i][j] = \sum_{k=0}^{c_A - 1} A[i][k] \cdot B[k][j]
\]

---

## ✅ Features

- 🧩 **Interactive CLI input** (rows, columns, elements)
- 🛡️ **Validation**
  - checks for null/empty matrices
  - checks dimension rule \(c_A = r_B\)
- 🖨️ **Formatted printing** of result matrix
- 📚 **Beginner-friendly structure** (great for learning loops + 2D arrays)

---

## 🏗️ Project Structure

```text
src/
└── Main/
    └── Main.java
```
<div align= center>
> Main class: `Main.class`
</div>


---

## 🚀 Getting Started

### ✅ Requirements
- ☕ Java **8+** (recommended: Java 17+)
- Any IDE (IntelliJ / Eclipse / NetBeans) or terminal

---

## ▶️ Run (Terminal)

### 1) Compile
```bash
javac -d out src/Main/Main.java
```

### 2) Run
```bash
java -cp out Main.Main
```

---

## 💻 Run (IntelliJ IDEA)

1. Open the project folder  
2. Ensure `src` is marked as **Sources Root**
3. Run the class:  
   `Main.Main`

---

## 🧪 Notes & Edge Cases

### ❌ If matrices cannot multiply
If **cols(A) != rows(B)**, program prints:
```text
These Matrix Cant Multiply Beacus colA != rowB
```

### ⚠️ Input must be valid integers
The program uses `Scanner.nextInt()` so non-integer input will throw an exception.

---

## 🛠️ Possible Improvements (Roadmap) 🚧

- ✨ Better output formatting (aligned columns)
- ✅ Re-prompt user on invalid dimensions instead of exit
- 🔢 Support `double` matrices (fractional values)
- 📦 Separate concerns:
  - `MatrixIO` (input/output)
  - `MatrixMath` (multiplication)
- 🧾 Add unit tests (JUnit)
- ♻️ Remove unused `ArrayList<Integer> Int` (currently unused)



---

## 🤝 Contributing

Contributions are welcome! 🧑‍💻  
If you want to improve formatting, validation, or add tests:

1. 🍴 Fork the repo
2. 🌿 Create a branch: `feature/your-feature`
3. ✅ Commit changes
4. 🔁 Open a Pull Request

---

## 📜 License

Choose one:
- Apache-2.0



---

## 🙌 Author

#### Made with **Edi**

- [GitHub](https://github.com/xedi1)
- [Linkedin](https://www.linkedin.com/in/edii1)
- [Reddit](https://www.reddit.com/user/PromotionLivid9151)
- Project: **Matrix Multiplication CLI**

---

<div align="center">

### ⭐ If you like this project, consider starring the repo!

</div>
