# 🧪 Testing Guide

## Overview

This repository includes a complete **LeetCode-style testing system** that runs inside VS Code.

Your workflow:
```
Open .java file → Write code → Press Ctrl+Shift+R → Get verdict
```

No web app. No manual input. No copying test cases.

---

## Quick Start

### 1. Open any question file
```
01-Arrays/14-Accenture-Previous-Questions/Q01-RatCountHouse.java
```

### 2. Write your solution in the marked area

### 3. Run tests using ONE of these methods:

| Method | How |
|--------|-----|
| **Keyboard** | `Ctrl + Shift + R` |
| **VS Code Task** | `Terminal → Run Task → Accenture: Run Current Question` |
| **PowerShell** | `.\scripts\run-test.ps1 path\to\Question.java` |

---

## Commands

### Run Current Question (visible tests only)
```powershell
.\scripts\run-test.ps1 .\01-Arrays\14-Accenture-Previous-Questions\Q01-RatCountHouse.java
```

### Run All Tests (visible + hidden)
```powershell
.\scripts\run-test.ps1 .\01-Arrays\14-Accenture-Previous-Questions\Q01-RatCountHouse.java -All
```

### Run Hidden Tests Only
```powershell
.\scripts\run-test.ps1 .\01-Arrays\14-Accenture-Previous-Questions\Q01-RatCountHouse.java -Hidden
```

### Compile Only (no tests)
```powershell
.\scripts\compile.ps1 .\01-Arrays\14-Accenture-Previous-Questions\Q01-RatCountHouse.java
```

### Run All Repository Questions
```powershell
.\scripts\run-all-tests.ps1
```

### Run All Questions in a Topic
```powershell
.\scripts\run-all-tests.ps1 -Topic "01-Arrays"
```

### Custom Timeout
```powershell
.\scripts\run-test.ps1 path\to\file.java -Timeout 10
```

---

## VS Code Tasks

Available via `Terminal → Run Task`:

| Task | Shortcut | Description |
|------|----------|-------------|
| Accenture: Run Current Question | `Ctrl+Shift+R` | Run visible tests on the currently open file |
| Accenture: Run All Tests | `Ctrl+Alt+A` | Run visible + hidden tests on current file |
| Accenture: Compile Current Question | `Ctrl+Alt+C` | Compile only, no tests |
| Accenture: Run All Repository Tests | — | Test every question in the repo |
| Accenture: Run Topic Tests | — | Test all questions in a selected topic |
| Accenture: Run Visible Tests | — | Run only visible tests |

---

## Test Output Examples

### ✅ All Passed
```
============================================================
ACCENTURE TEST RUNNER
============================================================

Question:  ACC-ARR-H01
Title:     Rat Count House
Mode:      VISIBLE TESTS
Tests:     3

Compiling...
[OK] Compilation successful

Running tests...

[PASS] Test 1 - Basic case
[PASS] Test 2 - Insufficient food
[PASS] Test 3 - Edge empty array

------------------------------------------------------------

============================================================
RESULT: ACCEPTED
============================================================

Passed:   3/3
Accuracy: 100%

============================================================
```

### ❌ Test Failed
```
[FAIL] Test 4 - Negative values

Input:
7
2
8
2 8 3 5 7 4 1 2

Expected:
4

Received:
3

============================================================
RESULT: FAILED
============================================================

Passed:   3/4
Failed:   1/4
```

### 💥 Compilation Error
```
============================================================
COMPILATION ERROR
============================================================

Q01RatCountHouse.java:17
error: cannot find symbol

Fix the compilation error and run the tests again.
```

### ⏱ Timeout
```
============================================================
TIME LIMIT EXCEEDED
============================================================

Test:      5 - Large input
Your program did not finish within: 5 seconds

Possible causes:
  - Infinite loop
  - Excessive complexity
  - Incorrect termination condition
```

### 🔴 Runtime Error
```
============================================================
RUNTIME ERROR
============================================================

Test:      4 - Edge case
Exception: ArrayIndexOutOfBoundsException

Stack trace:
...
```

---

## Test File Format

Each question has a `.tests.json` file alongside it:
```
Q01-RatCountHouse.java
Q01-RatCountHouse.tests.json
```

Test file structure:
```json
{
  "question_id": "ACC-ARR-H01",
  "title": "Rat Count House",
  "visible": [
    {
      "name": "Basic case",
      "input": "7\n2\n8\n2 8 3 5 7 4 1 2",
      "expected": "4"
    }
  ],
  "hidden": [
    {
      "name": "Large input boundary",
      "input": "...",
      "expected": "..."
    }
  ]
}
```

---

## How Test Discovery Works

The runner automatically finds the test file by:
1. Looking for `<filename>.tests.json` in the same directory as the Java file
2. No configuration needed — just follow the naming convention

---

## Adding New Questions

1. Create `Q01-YourQuestion.java` in the appropriate subtopic folder
2. Create `Q01-YourQuestion.tests.json` in the same folder
3. That's it — the test runner will find it automatically

---

## Output Normalization

The tester handles these formatting differences:
- **Trailing whitespace** is trimmed
- **Leading whitespace** is trimmed
- **Line endings** (`\r\n` vs `\n`) are normalized
- **Trailing newlines** are stripped

For whitespace-sensitive problems, the exact format matters within the content.

---

## Compiled Files

Compiled `.class` files go to `.build/` (added to `.gitignore`).
They do NOT pollute your question directories.

---

## Troubleshooting

| Issue | Solution |
|-------|----------|
| "FILE NOT FOUND" | Make sure you have the correct Java file open/selected |
| "TEST FILE NOT FOUND" | Create a `.tests.json` file for this question |
| PowerShell execution policy error | Run: `Set-ExecutionPolicy -Scope CurrentUser -ExecutionPolicy RemoteSigned` |
| Java not found | Ensure `java` and `javac` are in your PATH |
| Tasks not appearing | Reload VS Code window (`Ctrl+Shift+P → Reload Window`) |

---

## Security Notes

- This is a **local development tool**, not a secure sandbox
- Programs are killed after the timeout (default 5 seconds)
- The runner does NOT modify your Java files
- Compiled files are isolated in `.build/`
- No administrator privileges required
- No files are deleted except temporary test I/O files
