# Accenture Coding Questions & Placement Preparation 2026 (ASE & AASE)

[![GitHub Stars](https://img.shields.io/github/stars/Geet-Prince/accenture-coding-practice?style=social)](https://github.com/Geet-Prince/accenture-coding-practice)
[![Java](https://img.shields.io/badge/Java-17%2B-orange.svg)](https://java.com)
[![Accenture Hiring](https://img.shields.io/badge/Accenture_Hiring-2026_Batch-blue.svg)](#)

The ultimate, fully automated local preparation environment for **Accenture Off-Campus Drives** and On-Campus placements for the **2025/2026 batches**. 

Designed specifically for the **Custom Software Engineer (ASE - Associate Software Engineer)** and **AASE (Advanced Application Engineering)** roles. This repository doesn't just give you the answers; it simulates the actual Accenture assessment platform locally using custom PowerShell testing architecture.

## 🚀 Why This Repository?
Unlike generic DSA guides, this curriculum strictly follows the **updated Accenture Syllabus and Test Pattern for 2026**. Generic DSA (like complex Dynamic Programming, Graphs, and Trees) is rarely asked. We focus entirely on what gets you hired:

1. **Arrays & Strings** (High Priority - Pattern Matching & Traversal)
2. **Math & Number Properties** (High Priority)
3. **Hashing & Frequency** (Medium Priority)
4. **Pseudocode & Bitwise** (Crucial for clearing the Stage 1 Cognitive & Technical Assessment filter)

## 📁 Repository Architecture & Features
* **76+ Actual Accenture Coding Questions:** Covering historically repeated questions (e.g., *Rat Count House*, *Password Checker*, *Large Small Sum*).
* **Automated Local LeetCode Environment:** Built-in PowerShell scripts (`run-test.ps1`) compile and run your Java code against both **visible and hidden test cases** (`.tests.json`).
* **10 Full-Length Mock Tests:** Timed, 45-minute simulations combining Easy, Medium, and Advanced questions from previous recruitment drives.
* **Graduated AI Hints:** A built-in framework (`AI-TEACHER.md`) to guide you from conceptual understanding to full pseudocode before revealing the final solution.
* **30-Day Master Roadmap:** From basic syntax to advanced historical replicas. Includes a 7-Day Emergency Prep Plan.

## 📝 Updated Accenture Exam Syllabus & Pattern (2026)
The latest Accenture selection process consists of 3 rounds and 5 sections (125 Questions in 175 minutes):

| Assessment Round | Details | Questions | Time |
| :--- | :--- | :--- | :--- |
| **1. Behavioral Assessment** | Psychometric evaluation | 54 | 20 mins |
| **2. Cognitive Assessment** | Gamified logical reasoning | 3 | 20 mins |
| **3. Technical Assessment** | Pseudocode, Fundamentals, Networking, Cloud MCQs | 45 | 45 mins |
| **4. Coding Assessment** | 2-3 Coding Questions (C/C++/Java/Python) | 3 | 60 mins |
| **5. Communication Test** | Reading, Listening, Speaking evaluation | 20-25 | 30 mins |

*Note: You must clear the Technical & Cognitive cutoff to have your Coding Assessment evaluated!*

## 🚀 3-Minute Quick Start

**Transform your local VS Code into a fully automated, LeetCode-style testing environment!** No more manual compilation or copying test cases—just write code and see instant results.

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/Geet-Prince/accenture-coding-practice.git
```

### 2️⃣ ⚠️ CRITICAL: Open the Exact Folder
> [!WARNING]
> **The "Nested Folder" Trap:** DO NOT open a parent directory (e.g., a general Downloads or Clone Repos folder) that contains the repository. 
> VS Code will only detect the automated test scripts if the `.vscode` folder is at the very root of your workspace.
> 
> **Do this instead:** Open VS Code, click **File > Open Folder...**, and explicitly select the cloned `accenture-coding-practice` folder.

### 3️⃣ Install the Testing Engine (PowerShell)
The local testing engine is built on PowerShell.
* **Ubuntu/Debian:**
  ```bash
  sudo snap install powershell --classic
  ```
* **macOS:**
  ```bash
  brew install --cask powershell
  ```
* **Windows:** You're all set! (Built-in by default)

### 4️⃣ Run Your First Test (The "Aha!" Moment) 🪄
1. Open any question file in the editor (e.g., `01-Arrays/01-Traversal/Q02ArraySum.java`).
2. Press **`Ctrl+Shift+B`** (VS Code's native Build shortcut).
3. **Watch the magic happen!** The system will automatically compile your Java file, pipe the hidden test cases into your code, and output a colorful **PASS/FAIL** UI directly in the terminal!

<div align="center">
  <img src="img/final%20success%20Result.png" alt="Test Success Result" width="800"/>
</div>

---

## 🛠️ Testing System & Error Management (For Beginners)

We designed this repository so you don't have to worry about manual compilation or entering test cases. Here's how it works and what to do if you get stuck.

### How Test Cases Run Automatically 🪄
Every question file (e.g., `Q01-BasicTraversal.java`) is linked to a hidden `.tests.json` file in the same folder.
- When you press **`Ctrl+Shift+}`**, a script wakes up, compiles your code into a hidden `.build/` folder, feeds the inputs from the JSON file into your code, and checks your output!

<div align="center">
  <img src="img/1failedtestcase.png" alt="Failed Test Output" width="800"/>
</div>

> [!IMPORTANT]
> **Keyboard Shortcuts Not Working?**  
> If pressing `Ctrl+Shift+}` does **not** work for you, you can always manually trigger the tests using the Command Palette:
> 1. Press **`Ctrl+Shift+P`** to open the Command Palette.
> 2. Type and search for **`Tasks: Run Task`** and hit Enter.
> 3. Select **`Accenture: Run Current Question`** from the dropdown list.
> 
> *This ensures you can always run or compile your code, even if keyboard shortcuts conflict!*

### How to Resolve Common Errors 🛠️
As a beginner, you will encounter errors. Don't panic! Here's how to manage them:

- **"FILE NOT FOUND" / "TEST FILE NOT FOUND":**
  Ensure you are actively clicking inside the `.java` file before running the test.
- **Compilation Error (`cannot find symbol`, `; expected`):**
  Your Java code has a syntax error. The terminal will tell you the exact line number. Fix it and run the task again.
- **Execution Policy Error (PowerShell):**
  If VS Code refuses to run the scripts, open a PowerShell terminal as Administrator and run:
  `Set-ExecutionPolicy -Scope CurrentUser -ExecutionPolicy RemoteSigned`

### The Ultimate AI Fallback 🤖
If you are completely stuck and don't understand an error:
1. Open the file **[`run_error.md`](run_error.md)**.
2. Copy the prompt template provided.
3. Paste the template into your AI (ChatGPT/Claude/Gemini) along with your code and the terminal error.
4. The AI will understand the exact structure of this workspace and tell you exactly how to fix your issue.

### Custom Keybinding Setup (Optional)
If you prefer to run tests using `Ctrl+Shift+}` instead of the default build menu, you must add it to your global VS Code settings:
1. Open VS Code and press `Ctrl+K Ctrl+S` to open Keyboard Shortcuts.
2. Click the small "Open Keyboard Shortcuts (JSON)" file icon in the top right corner.
3. Paste this block into your keybindings array:
    {
        "key": "ctrl+shift+}",
        "command": "workbench.action.tasks.runTask",
        "args": "Accenture: Run Current Question"
    }

---

## 📚 Master Question Index
Here are a few of the highest-frequency confirmed questions available in this repo. Check `QUESTION_INDEX.md` for the full list of 41+ core patterns.

- **ACC-ARR-H01:** Rat Count House (EASY)
- **ACC-ARR-I03:** Large Small Sum (EASY-MED)
- **ACC-STR-H01:** Password Checker (MEDIUM)
- **ACC-MATH-H01:** Difference of Sum (EASY)
- **ACC-HASH-H01:** Autobiographical Number (MEDIUM)

## 🤝 Contribution & Progress Tracking
Track your daily completion status using the manual checkbox tables in `PROGRESS.md`. If you have a recent Accenture interview experience or a new coding question from a 2026 drive, please submit a Pull Request!
