# 🤝 Contributing to Accenture Coding Prep

Thank you for your interest in contributing to the **Accenture Coding Prep** repository! This project helps students prepare for **Accenture Placement Drives (2027 Batch)** targeting **Associate Software Engineer (ASE)** (~₹4.5 LPA) and **Advanced Associate Software Engineer (AASE)** (~₹6.5 LPA) roles using historical questions from 2020–2026 and pattern-based practice.

---

## 📌 How to Add New Questions

Before adding a new coding question, please read our complete step-by-step guide in [`ADD-QUESTIONS.md`](ADD-QUESTIONS.md).

Every coding problem in this repository requires **two mandatory files** in the exact same subtopic directory:

```text
01-Arrays/01-Traversal/
├── Q01BasicTraversal.java        # Problem description + Java implementation skeleton
└── Q01BasicTraversal.tests.json   # Visible and hidden test cases for automated execution
```

---

## 🏷️ File Naming Conventions

To maintain consistency and ensure the automated PowerShell test runner (`scripts/run-test.ps1`) works seamlessly, adhere to the following naming conventions:

- **Java Files:** `QXXQuestionName.java` (e.g., `Q05ProductSmallestPair.java`)
  - Class name must match the filename: `public class Q05ProductSmallestPair`
- **Test Files:** `QXXQuestionName.tests.json` or `QXX-QuestionName.tests.json` (e.g., `Q05ProductSmallestPair.tests.json`)
- **Question IDs:** Format as `ACC-[TOPIC_CODE]-[E/M/H][ID]` (e.g., `ACC-ARR-E05` for Array Easy 05).

---

## 📦 Required Files Per Question

Each question MUST include both files:

1. **Java Source File (`.java`):**
   - Comment block at top containing: Problem Title, Category, Difficulty, Historical Drive info (e.g., 2020-2026), Problem Description, Input/Output specification, and Sample Cases.
   - Standard Java class reading from `System.in` (using `java.util.Scanner` or `java.io.BufferedReader`) and printing result to `System.out`.

2. **Test File (`.tests.json`):**
   - JSON structure with `"question_id"`, `"title"`, `"visible"` test cases, and `"hidden"` test cases.
   ```json
   {
     "question_id": "ACC-ARR-E01",
     "title": "Array Sum",
     "visible": [
       {
         "name": "Test 1 - Basic",
         "input": "5\n1 2 3 4 5",
         "expected": "15"
       }
     ],
     "hidden": [
       {
         "name": "Hidden Test 1 - Edge Case",
         "input": "0",
         "expected": "-1"
       }
     ]
   }
   ```

---

## 💻 Code Style Guidelines

- **Standard Java Only:** Use core Java JDK features (`java.util.*`, `java.io.*`).
- **Zero External Dependencies:** Do NOT import third-party libraries (e.g., Jackson, Guava, Apache Commons).
- **Standard I/O:** Solutions must read input from `System.in` and output results to `System.out`.
- **Edge Case Protection:** Always implement null checks, empty array checks, integer overflow prevention (use `long` for large sums), and exact return codes (e.g., `-1` vs `0`).
- **Clean Methods:** Separate core logic into clean, readable static helper functions or a designated `calculate()` method.

---

## 📥 Reporting Recent Accenture Questions

If you recently attended an Accenture campus drive (2020–2026/2027 batch) and encountered a coding problem:

1. Open a GitHub Issue or Pull Request with label `question-report`.
2. Provide:
   - Drive date and role targeted (ASE / AASE).
   - Reconstructed problem description and input/output formats.
   - Example test cases and edge cases specified during the test.
   - Approximate time and memory constraints.
3. Our maintainers will verify the question, categorize it (S-Tier / A-Tier), and create the standardized `.java` and `.tests.json` pair.

---

## 🔀 Pull Request Process

1. **Fork the Repository:** Create a personal fork on GitHub (`Geet-Prince/accenture-coding-practice`).
2. **Create a Feature Branch:** `git checkout -b feat/add-q05-product-pair`
3. **Write Code & Test Cases:** Add your `.java` and `.tests.json` files to the appropriate topic directory.
4. **Run Local Verification:** Open VS Code, press **`Ctrl + Shift + B`** (or run `scripts/run-test.ps1`), and verify all test cases **PASS**.
5. **Update Documentation:** Add the new question entry to [`QUESTION_INDEX.md`](QUESTION_INDEX.md).
6. **Commit & Push:** Write descriptive commit messages (e.g., `feat(arrays): add Q05 Product Smallest Pair with test suite`).
7. **Submit PR:** Open a Pull Request against the `main` branch. Describe the changes and confirm all local tests pass.

---

[← Back to README](README.md)
