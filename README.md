# Accenture 2027 ASE/AASE Java Coding Practice + Offline Test Sandbox

A curated Java coding practice repository for **Accenture 2027 ASE/AASE placements**, featuring topic-wise problems sourced from **2020–2026 drives**, mock practice tracks, and an **automated offline testing sandbox** for fast local validation.

If you're preparing for Accenture coding rounds, this repo helps you practice consistently with structured DSA sets, repeatable test workflows, and placement-focused progression.

[![GitHub Stars](https://img.shields.io/github/stars/Geet-Prince/accenture-coding-practice?style=social)](https://github.com/Geet-Prince/accenture-coding-practice)
[![Java](https://img.shields.io/badge/Java-Zero%20Dependency-orange.svg)](https://java.com)
[![Accenture Hiring](https://img.shields.io/badge/Accenture_Hiring-2027_Batch-blue.svg)](#)
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![Last Commit](https://img.shields.io/github/last-commit/Geet-Prince/accenture-coding-practice)](https://github.com/Geet-Prince/accenture-coding-practice/commits/main)

---

## 👥 Who Is This For?

- Students preparing for **Accenture ASE coding questions 2027**
- Students targeting **Accenture AASE Java practice** rounds
- Anyone looking for an **offline Java test runner for placement prep**
- Students who want to clear the **Stage 1 Cognitive & Technical filter**
- Anyone preparing for **Accenture off-campus and on-campus drives**

---

## ✨ Features

| Feature | Description |
| :--- | :--- |
| 📚 **Research-based question bank** | 76+ problems from Accenture drives (2020–2026), including *Rat Count House*, *Difference of Sum*, *Password Checker* |
| ☕ **Java-first practice** | Zero-dependency Java architecture (no Maven, no Gradle) |
| 🧪 **Automatic test execution** | PowerShell scripts compile, run, and validate your code in milliseconds |
| 🖥️ **VS Code integration** | Press `Ctrl+Shift+B` and see instant PASS/FAIL results |
| 🎯 **Topic-wise organization** | 14 directories mapped to the Accenture assessment structure |
| 📈 **Progress tracking** | Gamified tracking (Attempted / Solved / Mastered) |
| 🧠 **AI Teacher** | Graduated hint system for ChatGPT/Copilot/Gemini |
| ⏱️ **10 Mock tests** | Timed 45-minute simulations mirroring the real exam |
| 🗺️ **30-Day roadmap** | Structured plan + 7-Day Emergency Plan |
| 🔍 **S-Tier / A-Tier classification** | Know exactly what to study and what to skip |

---

## ⚡ Quick Start

### 1. Clone the repository
```bash
git clone https://github.com/Geet-Prince/accenture-coding-practice.git
```

### 2. Open the exact folder in VS Code
> [!WARNING]
> **Do NOT** open a parent directory. Open VS Code → **File > Open Folder...** → select the cloned `accenture-coding-practice` folder directly. The `.vscode` folder must be at the workspace root for automation to work.

### 3. Install PowerShell (if not on Windows)
- **Ubuntu/Debian:** `sudo snap install powershell --classic`
- **macOS:** `brew install --cask powershell`
- **Windows:** Already built-in.

### 4. Open a question and run tests
```
Open: 01-Arrays/01-Traversal/Q02-ArraySum.java
Press: Ctrl + Shift + B
```
The test runner automatically compiles your code, pipes hidden test cases via `stdin`, and displays a colorful PASS/FAIL diff.

👉 **[Detailed Testing Guide](TESTING.md)** · **[Offline Sandbox Architecture](JAVA-OFFLINE-TEST-SANDBOX.md)**

---

## 📋 Problem Index (Top Confirmed Questions)

| ID | Question | Year | Topic | Difficulty | Priority | File |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| ACC-ARR-H01 | Rat Count House | 2020–2024 | Arrays | EASY | S | [`Q01-RatCountHouse.java`](01-Arrays/14-Accenture-Previous-Questions/Q01-RatCountHouse.java) |
| ACC-ARR-H02 | Product Smallest Pair | 2020–2025 | Arrays | EASY | S | [`Q02-ProductSmallestPair.java`](01-Arrays/14-Accenture-Previous-Questions/Q02-ProductSmallestPair.java) |
| ACC-ARR-K01 | Maximum Subarray (Kadane) | 2022–2024 | Arrays | MEDIUM | S | [`Q01-MaximumSubarray.java`](01-Arrays/06-Kadanes-Algorithm/Q01-MaximumSubarray.java) |
| ACC-STR-H01 | Password Checker | 2021–2024 | Strings | MEDIUM | S | [`Q01-PasswordChecker.java`](02-Strings/10-Accenture-Previous-Questions/Q01-PasswordChecker.java) |
| ACC-STR-H02 | Operations Binary String | 2020–2024 | Strings | MEDIUM | S | [`Q02-OperationsBinaryString.java`](02-Strings/10-Accenture-Previous-Questions/Q02-OperationsBinaryString.java) |
| ACC-MATH-H01 | Difference of Sum | 2020–2026 | Math | EASY | S | [`Q01-DifferenceOfSum.java`](03-Math-Numbers/10-Accenture-Previous-Questions/Q01-DifferenceOfSum.java) |
| ACC-HASH-H01 | Autobiographical Number | 2022–2024 | Hashing | MEDIUM | S | [`Q01-AutobiographicalNumber.java`](04-Hashing-Frequency/07-Accenture-Previous-Questions/Q01-AutobiographicalNumber.java) |
| ACC-PSEUDO-H01 | Bitwise Operations Trace | 2021–2024 | Pseudocode | MEDIUM | S | [`Q01-BitwiseOperationsTrace.java`](05-Pseudocode-Bitwise/07-Accenture-Previous-Questions/Q01-BitwiseOperationsTrace.java) |

👉 **[Full Question Index (41+ problems)](QUESTION_INDEX.md)**

---

## 📂 Repository Structure

```text
Accenture-Coding-Prep/
│
├── .build/                 # Hidden compiled output (auto-managed)
├── .vscode/                # VS Code tasks.json for test automation
│
├── 01-Arrays/              # S-Tier — High Priority
├── 02-Strings/             # S-Tier — High Priority
├── 03-Math-Numbers/        # S-Tier — High Priority
├── 04-Hashing-Frequency/   # S-Tier — High Priority
├── 05-Pseudocode-Bitwise/  # A-Tier — Stage 1 filter
├── 06-Linked-List/
├── 07-Stack-Queue/
├── 08-Recursion/
├── 09-Greedy/
├── 10-Trees/
├── 11-Graphs/
├── 12-Dynamic-Programming/
├── 13-Mixed-Accenture/
├── 14-Mock-Tests/          # 10 timed 45-min mock exams
│
├── hints/                  # Logic hints
├── img/                    # Documentation assets
├── scripts/                # PowerShell runners (run-test.ps1)
├── solutions/              # Master solutions
│
├── README.md               # You are here
├── START-HERE.md            # First-time setup guide
├── SYLLABUS.md              # Complete syllabus breakdown
├── ROADMAP.md               # 30-Day study plan
├── QUESTION_INDEX.md        # Master problem list
├── PROGRESS.md              # Progress tracker
├── TESTING.md               # Testing system docs
├── AI-TEACHER.md            # AI tutor prompts
├── ADD-QUESTIONS.md         # How to contribute questions
├── RESEARCH.md              # Accenture hiring research
├── SOURCES.md               # Research sources
├── FAQ.md                   # Frequently asked questions
├── CONTRIBUTING.md          # Contribution guidelines
├── CHANGELOG.md             # Version history
└── LICENSE                  # MIT License
```

---

## 📚 Accenture 2027 Syllabus Summary

### S-Tier (Must Master)
- **Arrays** — Traversal, Kadane's, Equilibrium Index, Prefix Sum
- **Strings** — Parsing, validation, frequency, manipulation
- **Math & Numbers** — Divisibility, digit extraction, base conversion
- **Hashing & Frequency** — Counting, anagram detection

### A-Tier (Stage 1 Cognitive & Technical Filter)
- **Pseudocode & Bitwise** — Output tracing, XOR, operator precedence

### Do Not Study (Skip These)
- ❌ Dynamic Programming · ❌ Graphs · ❌ Trees

👉 **[Complete Syllabus](SYLLABUS.md)**

---

## 🗺️ Accenture 2027 Preparation Roadmap

**30-Day Plan:** Arrays → Strings → Math → Hashing → Pseudocode → Mixed → Mock Tests

**7-Day Emergency Plan** also included for last-minute preparation.

👉 **[30-Day Roadmap](ROADMAP.md)** · **[ASE/AASE 2027 Roadmap](ACCENTURE-ASE-AASE-2027-ROADMAP.md)**

---

## 🧪 How the Automated Testing Works

Each question has two files:
```text
Q01-RatCountHouse.java        ← Your solution
Q01-RatCountHouse.tests.json  ← Hidden test cases
```

Press **`Ctrl+Shift+B`** → the PowerShell runner compiles your code into `.build/`, pipes test inputs via `stdin`, enforces a 5-second TLE timeout, and displays PASS/FAIL with expected vs. actual diff.

👉 **[Testing Guide](TESTING.md)** · **[Offline Sandbox Details](JAVA-OFFLINE-TEST-SANDBOX.md)**

---

## 📋 Requirements

- Java 17+ (or Java 8+)
- VS Code
- PowerShell (built-in on Windows)
- Git

*Recommended:* [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

---

## 📊 Progress Tracking

Track your status per question: **Attempted → Solved → Mastered**, with time spent and hints used.

👉 **[Progress Tracker](PROGRESS.md)**

---

## 🤖 AI Teacher

Use the built-in AI Teacher prompt with ChatGPT, Copilot, or Gemini to receive **graduated hints** (Diagnosis → Conceptual → Algorithmic → Pseudocode → Solution) instead of raw answers.

👉 **[AI Teacher Guide](AI-TEACHER.md)**

---

## ❓ Frequently Asked Questions

Common questions like *"What topics are asked in Accenture coding rounds?"*, *"Is DP asked?"*, *"How long is the assessment?"* are answered in:

👉 **[FAQ](FAQ.md)**

---

## ➕ Adding New Questions

Every question consists of a `.java` file and a matching `.tests.json` file. Follow the naming convention and folder structure.

👉 **[Adding Questions Guide](ADD-QUESTIONS.md)** · **[Contributing Guidelines](CONTRIBUTING.md)**

---

## ⚖️ Historical Question Disclaimer

Questions marked as historical are based on publicly available candidate reports and online sources. Historical wording may be reconstructed or paraphrased. Questions marked as `Practice Variant` are created for preparation and should not be considered exact Accenture questions.

---

## 🔬 Research & Sources

👉 **[Research](RESEARCH.md)** · **[Sources](SOURCES.md)**

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

## 👨‍💻 Author

**Prince Raj**
GitHub: [Geet-Prince](https://github.com/Geet-Prince)

---

If this automated sandbox helped your Accenture preparation, please consider giving the repository a ⭐ to help other students discover it.
