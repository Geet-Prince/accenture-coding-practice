# 🚀 Accenture Coding Prep

> A research-based, Java-first coding preparation repository for the 2026 Accenture placement assessments (ASE & AASE).

[![GitHub Stars](https://img.shields.io/github/stars/Geet-Prince/accenture-coding-practice?style=social)](https://github.com/Geet-Prince/accenture-coding-practice)
[![Java](https://img.shields.io/badge/Java-Zero%20Dependency-orange.svg)](https://java.com)
[![Accenture Hiring](https://img.shields.io/badge/Accenture_Hiring-2026_Batch-blue.svg)](#)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

---

## 🎯 Goal

Prepare systematically for Accenture coding assessments by practicing historically reported questions and the patterns behind them.

---

## 📖 About

This standalone repository is designed for students preparing for Accenture coding assessments. It operates as a fully automated local LeetCode-style environment. 

It contains:
- Accenture historical coding questions
- Pattern-based practice questions
- Java solutions
- Automated test cases
- Custom VS Code test runner
- Topic-wise syllabus
- Progress tracking
- 10 Mock tests
- 30-Day Study roadmap

---

## 👥 Who Is This For?

This repository is highly specific and useful for:
- Accenture placement preparation (2026 season)
- Associate Software Engineer (ASE) preparation
- Advanced Associate Software Engineer (AASE) preparation
- Students preparing for the Stage 1 Cognitive & Technical filter
- Students wanting structured, offline Java coding practice

---

## ✨ Features

- 📚 **Research-based Accenture question bank:** Highly requested historical questions like *Rat Count House*, *Difference of Sum*, etc.
- ☕ **Java-first practice:** Zero-dependency Java architecture.
- 🧪 **Automatic test-case execution:** PowerShell scripts evaluate your code in milliseconds.
- 🖥️ **VS Code-based workflow:** Fully integrated into your local editor.
- 🎯 **Topic-wise organization:** Targeted specifically at the Accenture assessment structure.
- 📈 **Progress tracking:** Built-in gamified progression matrices.
- 🧠 **AI teacher support:** Graduated hint system for Copilot/ChatGPT.
- ⏱️ **Mock tests:** 10 simulated 45-minute timed sessions.
- 🔍 **Historical question classification:** S-Tier and A-Tier categorization.
- 📝 **Detailed problem statements:** Clear, concise formatting.

---

## 📂 Repository Structure

```text
Accenture-Coding-Prep/
│
├── 01-Arrays/
├── 02-Strings/
├── 03-Math-Numbers/
├── 04-Hashing-Frequency/
├── 05-Pseudocode-Bitwise/
│
├── solutions/
├── hints/
├── scripts/
├── .vscode/
│
├── README.md
├── ROADMAP.md
├── SYLLABUS.md
├── PROGRESS.md
├── QUESTION_INDEX.md
├── ADD-QUESTIONS.md
└── TESTING.md
```

---

## 📚 Syllabus

### S-Tier (High Priority)
- Arrays
- Strings
- Mathematics & Numbers
- Hashing & Frequency

### A-Tier (For Stage 1 Elimination)
- Pseudocode & Bitwise

### The "Do Not Study" List
- Dynamic Programming, Graphs, Trees (Rarely asked in 45-minute rounds).

👉 **[Complete Syllabus](SYLLABUS.md)**

---

## ⚡ Getting Started

### 1. Clone the repository
```bash
git clone https://github.com/Geet-Prince/accenture-coding-practice.git
```

### 2. ⚠️ Open the exact folder in VS Code
Open VS Code, click **File > Open Folder...**, and explicitly select the cloned `accenture-coding-practice` folder. (Do not open a parent downloads folder, or the automated tests will fail to run).

### 3. Start with Arrays
Navigate to `01-Arrays/`

### 4. Open a question
Example:
`01-Arrays/01-Traversal/Q02ArraySum.java`

### 5. Write your solution
Keep all logic within the designated `calculate()` block.

### 6. Run tests
Press: **`Ctrl + Shift + B`** (or your mapped shortcut `Ctrl + Alt + T`).

The test runner automatically:
- compiles the Java file into `.build/`
- loads the hidden JSON test cases
- executes them with a 5-second timeout constraint
- compares expected and actual output
- displays a colorful PASS/FAIL diff

---

## 📋 Requirements

- Java 17+ (or Java 8+)
- VS Code
- PowerShell (Built-in on Windows; installable on macOS/Linux)
- Git

*Recommended:* Extension Pack for Java

---

## 🧪 Automatic Testing

Each question contains two files:
- `Q01ArraySum.java` (Contains the problem and your solution)
- `Q01ArraySum.tests.json` (Contains the hidden test cases)

When you trigger the build task, the test runner automatically compiles your code, loads the tests, pipes them via `stdin`, compares `stdout`, and outputs PASS/FAIL.

👉 **[Testing Guide](TESTING.md)**

---

## 🔍 Example

```text
01-Arrays/
└── 01-Traversal/
    ├── Q01BasicTraversal.java
    └── Q01BasicTraversal.tests.json
```
Open the `.java` file, write your solution, and run the tests.

---

## 📊 Progress Tracking

Use `PROGRESS.md` to track:
- Questions attempted and solved
- Time taken per question
- Weak topics vs. Mastered topics

👉 **[Progress Tracker](PROGRESS.md)**

---

## 🗺️ Study Roadmap

The recommended 30-day progression is:
Arrays → Strings → Math & Numbers → Hashing → Pseudocode & Bitwise → Mixed Practice → Mock Tests

👉 **[Study Roadmap](ROADMAP.md)**

---

## ➕ Adding New Questions

Want to add a question? Every question normally consists of:
```text
Question.java
Question.tests.json
```
This prevents contributors from randomly dumping files into the repository. 

👉 **[Adding Questions Guide](ADD-QUESTIONS.md)**

---

## 🤖 AI Teacher

You can use an AI coding teacher (ChatGPT, Copilot, Gemini) to:
- understand the problem conceptually
- receive progressive hints
- debug your code without being handed the direct answer
- analyze time/space complexity

👉 **[AI Teacher Guide](AI-TEACHER.md)**

---

## ⚖️ Historical Question Disclaimer

Questions marked as historical are based on publicly available candidate reports and online sources. Historical wording may be reconstructed or paraphrased. Questions marked as `Practice Variant` are created for preparation and should not be considered actual exact Accenture questions. 

---

## 🔬 Research

The repository's syllabus and historical question classification are based on publicly available sources and candidate experiences.

👉 **[Research](RESEARCH.md)**
👉 **[Sources](SOURCES.md)**

---

## 🤝 Contributing

Contributions are welcome. Before adding a question:
1. Check for duplicates.
2. Use the correct topic folder.
3. Add the `.java` file and matching `.tests.json`.
4. Verify the question using the test runner.

---

## 📄 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

**Prince Raj**
GitHub: [Geet-Prince](https://github.com/Geet-Prince)
