# 🎯 Accenture Coding Practice & Placement Preparation (2020–2026)

> **The ultimate evidence-based Java coding practice environment** for the **Accenture Coding Round**. 
> Fully loaded with historically verified Accenture assessment questions, LeetCode-style local testing in VS Code, and structured roadmaps for the **ASE (~₹4.5 LPA)** and **Advanced ASE (~₹9.8 LPA)** roles.
> 
> *Keywords: Accenture Practice, Accenture Coding Questions, Accenture Placement Preparation, Accenture Previous Year Questions, Accenture Mock Tests, Accenture Off-Campus Drive.*

---

## 📌 Purpose

This repository is **not** a generic DSA collection.  
Every question, topic priority, and roadmap step is backed by real candidate reports and placement data from 2020–2026.

---

## 🎯 Target Roles & Packages

| Role | Package |
|------|---------|
| Associate Software Engineer (ASE) | ~₹4.5–5.4 LPA |
| Advanced Associate Software Engineer (AASE) | ~₹6.5–9.8 LPA |
| Advanced Application Engineer | ~₹9.8 LPA |

**The ₹9.8 LPA insight:** The coding questions are the *same* as ₹4.5 LPA. The difference is the **evaluation threshold** — you must pass 100% of all hidden test cases with optimal complexity.

---

## 📂 Repository Structure

```
Accenture-Coding-Prep/
├── 01-Arrays/               ← S-PRIORITY: MUST MASTER
├── 02-Strings/              ← S-PRIORITY: MUST MASTER
├── 03-Math-Numbers/         ← S-PRIORITY: MUST MASTER
├── 04-Hashing-Frequency/    ← A-PRIORITY: HIGH
├── 05-Pseudocode-Bitwise/   ← A-PRIORITY: HIGH (Stage 1 filter)
├── 06-Linked-List/          ← C-PRIORITY: LOW (rare, optional)
├── 13-Mixed-Accenture/      ← Full mixed practice
├── 14-Mock-Tests/           ← 10 realistic timed mocks
└── solutions/               ← Solutions (open ONLY after attempting)
```

> ⚠️ Graphs, DP, and advanced Trees are **NOT included** — zero historical evidence of them in Accenture fresher rounds.

---

## 🚀 How to Start

1. Open [`START-HERE.md`](START-HERE.md)
2. Follow [`ROADMAP.md`](ROADMAP.md)
3. Solve problems in topic folders **without** peeking at `solutions/`
4. Track progress in [`PROGRESS.md`](PROGRESS.md)

---

## ☕ Java Version

**Java 17+** required. All files compile independently with standard `javac`.

---

## 🔖 Difficulty System

| Label | Time Budget |
|-------|------------|
| EASY | 10–15 min |
| EASY-MEDIUM | 15–20 min |
| MEDIUM | 20–25 min |
| MEDIUM-HARD | 25–35 min |
| HARD | 35–45 min |

---

## 🏷️ Historical Evidence Labels

| Label | Meaning |
|-------|---------|
| CONFIRMED | Strong direct evidence from candidate reports |
| PROBABLE | Credible but incomplete evidence |
| UNVERIFIED | Single weak source |
| PRACTICE VARIANT | Pattern-based, NOT a historical question |

---

## 📋 Key Files

| File | Purpose |
|------|---------|
| [START-HERE.md](START-HERE.md) | Begin here on Day 1 |
| [ROADMAP.md](ROADMAP.md) | 30-day study plan |
| [SYLLABUS.md](SYLLABUS.md) | Evidence-based topic priorities |
| [QUESTION_INDEX.md](QUESTION_INDEX.md) | Master searchable question list |
| [PROGRESS.md](PROGRESS.md) | Track your solved questions |
| [RESEARCH.md](RESEARCH.md) | Full research findings 2020–2026 |
| [SOURCES.md](SOURCES.md) | All sources and URLs |

---

## 🧪 LeetCode-Style Testing System

This repository includes a **built-in testing system** — no web app, no manual input.

### Quick Start
```
1. Open any Q01-Something.java file
2. Write your solution
3. Press Ctrl+Shift+T to test and run the code
4. See PASS/FAIL with expected vs actual output
```

> [!IMPORTANT]
> **Keyboard Shortcuts Not Working? (For Beginners)**  
> If pressing `Ctrl+Shift+T` or `Ctrl+Shift+C` does **not** work for you, you can manually trigger them from the command palette at any time. We highly recommend this if you run into shortcut conflicts:
> 1. Press **`Ctrl+Shift+P`** to open the Command Palette.
> 2. Type and search for **`Tasks: Run Task`** and hit Enter.
> 3. Select **`Accenture: Compile Current Question`** or **`Accenture: Run Current Question`** from the dropdown list.
> 
> *It's that simple! This ensures you can always run or compile your code.*
>
> 💡 **Encountered an Error?** Check out [`run_error.md`](run_error.md) for a detailed troubleshooting guide. It provides a specialized prompt you can copy-paste to an AI to instantly fix your problem!

### VS Code Tasks
| Shortcut | Action |
|----------|--------|
| **`Ctrl+Shift+T`** | Run visible tests on current file |
| **`Ctrl+Shift+A`** | Run all tests (visible + hidden) |
| **`Ctrl+Shift+C`** | Compile only |
| `Ctrl+Shift+P` → `Tasks: Run Task` | Fallback: See all available tasks |

### PowerShell Commands
```powershell
.\scripts\run-test.ps1 path\to\Question.java        # Visible tests
.\scripts\run-test.ps1 path\to\Question.java -All    # All tests
.\scripts\compile.ps1 path\to\Question.java          # Compile only
.\scripts\run-all-tests.ps1                          # Test everything
```

📖 Full guide: [TESTING.md](TESTING.md)

---

## ⚙️ How Things Work & Managing Errors (For Beginners)

We designed this repository so you don't have to worry about manual compilation or entering test cases. Here's a behind-the-scenes look at how it works and what to do if you get stuck.

### 1. How Test Cases Run Automatically 🪄
Every question file (e.g., `Q01-BasicTraversal.java`) is linked to a hidden `.tests.json` file in the same folder.
- When you press **`Ctrl+Shift+T`** (or use the Command Palette `Tasks: Run Task`), a PowerShell script (`scripts/run-test.ps1`) wakes up.
- It finds the Java file you currently have open.
- It compiles your code and saves the built file inside the hidden `.build/` folder (to keep your workspace clean).
- It opens the corresponding `.tests.json` file, feeds the test inputs into your code one by one, and compares your code's output to the expected output.
- Finally, it prints a beautiful PASS/FAIL report directly in your VS Code terminal!

### 2. How to Resolve Errors 🛠️
As a beginner, you will encounter errors. Don't panic! Here's how to manage them:

- **"Command not found" or Shortcuts aren't working:**
  Your keyboard might have conflicting shortcuts. Always rely on the manual fallback:
  👉 Press **`Ctrl+Shift+P`** → Type **`Tasks: Run Task`** → Select **`Accenture: Run Current Question`**.
- **"FILE NOT FOUND" / "TEST FILE NOT FOUND":**
  Ensure you are actively clicking inside the `.java` file before running the test. The script needs to know which file you want to test!
- **Compilation Error (`cannot find symbol`, `; expected`):**
  Your Java code has a syntax error. The terminal will tell you the exact line number. Fix the typo, save, and press `Ctrl+Shift+T` again.
- **Execution Policy Error (PowerShell):**
  If VS Code refuses to run the scripts, open a PowerShell terminal as Administrator and run:
  `Set-ExecutionPolicy -Scope CurrentUser -ExecutionPolicy RemoteSigned`

### 3. The Ultimate AI Fallback 🤖
If you are completely stuck and don't understand an error, we have a built-in prompt specifically designed for AIs (ChatGPT/Claude/Gemini).
1. Open the file **[`run_error.md`](run_error.md)**.
2. Copy the prompt template.
3. Paste the template into your AI, along with your code and the error you see in the terminal.
4. The AI will instantly understand how this workspace is structured and tell you exactly how to fix your issue.

---

## 🤖 AI Teacher

Use an AI (Claude, ChatGPT, Gemini) as your personal tutor with the graduated hint system.

📖 See: [AI-TEACHER.md](AI-TEACHER.md)

---

## 📋 Key Files

| File | Purpose |
|------|---------|
| [START-HERE.md](START-HERE.md) | Begin here on Day 1 |
| [ROADMAP.md](ROADMAP.md) | 30-day study plan |
| [SYLLABUS.md](SYLLABUS.md) | Evidence-based topic priorities |
| [QUESTION_INDEX.md](QUESTION_INDEX.md) | Master searchable question list |
| [PROGRESS.md](PROGRESS.md) | Track your solved questions |
| [TESTING.md](TESTING.md) | Testing system guide |
| [AI-TEACHER.md](AI-TEACHER.md) | AI teacher prompt system |
| [RESEARCH.md](RESEARCH.md) | Full research findings 2020–2026 |
| [SOURCES.md](SOURCES.md) | All sources and URLs |

---

## 📂 Full Repository Structure

```
Accenture-Coding-Prep/
├── .vscode/                 ← VS Code tasks & shortcuts
│   ├── tasks.json
│   └── keybindings.json
├── scripts/                 ← Test runner scripts
│   ├── run-test.ps1
│   ├── run-all-tests.ps1
│   └── compile.ps1
├── 01-Arrays/               ← S-PRIORITY: MUST MASTER
├── 02-Strings/              ← S-PRIORITY: MUST MASTER
├── 03-Math-Numbers/         ← S-PRIORITY: MUST MASTER
├── 04-Hashing-Frequency/    ← A-PRIORITY: HIGH
├── 05-Pseudocode-Bitwise/   ← A-PRIORITY: HIGH
├── 06-Linked-List/          ← C-PRIORITY: LOW
├── 07-Stack-Queue/          ← C-PRIORITY: OPTIONAL
├── 08-Recursion/            ← C-PRIORITY: OPTIONAL
├── 09-Greedy/               ← C-PRIORITY: OPTIONAL
├── 10-Trees/                ← LOW (no historical evidence)
├── 11-Graphs/               ← LOW (no historical evidence)
├── 12-Dynamic-Programming/  ← LOW (no historical evidence)
├── 13-Mixed-Accenture/      ← Full mixed practice
├── 14-Mock-Tests/           ← 10 realistic timed mocks
├── solutions/               ← Reference solutions
└── hints/                   ← Graduated hint files
```

---

## 🤝 Contribution Guidelines

- Only add questions with verifiable sources.
- Label historical status accurately.
- One `.java` file per question.
- Solutions go in `solutions/` only.
- Update `QUESTION_INDEX.md` and `PROGRESS.md`.
