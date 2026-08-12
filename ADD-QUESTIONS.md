# Adding New Questions

> A complete guide for students and AI agents to add clean, testable Java coding questions to the Accenture Coding Prep repository.

## Section 1 — Quick Start

To add one new practice question, simply follow these steps:

1. **Choose the correct topic folder:** (e.g., `01-Arrays/`)
2. **Choose the correct subtopic folder:** (e.g., `01-Traversal/`)
3. **Find the next available question number:** (e.g., if `Q03CountEvenOdd.java` is the last one, use `Q04...`)
4. **Create the Java question file:** `Q04NewQuestion.java`
5. **Create the matching `.tests.json` file:** `Q04NewQuestion.tests.json`
6. **Add the problem statement and metadata:** Add this inside comments at the top of the `.java` file, followed by the actual Java class and method skeleton.
7. **Add visible and hidden test cases:** Structure them properly in the `.tests.json` file.
8. **Run the VS Code test task:** Open the `.java` file and press `Ctrl+Shift+B` (or run the "Accenture: Run Current Question" task).
9. **Verify PASS/FAIL output:** Ensure the test cases run correctly in your terminal.
10. **Update the index/progress files:** Update `QUESTION_INDEX.md` and `PROGRESS.md` if necessary.

**Example:**
If you want to add a new "Prefix Sum" question:
1. Navigate to `01-Arrays/04-Prefix-Sum/`
2. Create `Q01PrefixSum.java`
3. Create `Q01PrefixSum.tests.json`

---

## Section 2 — Repository Structure

This repository uses a specific structure to categorize topics and isolate test environments. 

```text
Accenture-Coding-Prep/
│
├── .vscode/
│   ├── tasks.json           # Defines the Ctrl+Shift+B task used to run tests
│   └── keybindings.json     # Custom keyboard shortcuts
│
├── scripts/
│   ├── run-test.ps1         # The main test runner script triggered by tasks.json
│   ├── run-all-tests.ps1    # Script for running all tests in the repository
│   └── compile.ps1          # Standalone compilation script
│
├── 01-Arrays/               # Topic folder
│   ├── 01-Traversal/        # Subtopic folder containing the actual questions
│   │   ├── Q01BasicTraversal.java
│   │   └── Q01-BasicTraversal.tests.json
│   ├── 02-Indexing/
│   ├── 03-Min-Max/
│   └── ...
│
├── 02-Strings/
├── 03-Math-Numbers/
├── 04-Hashing-Frequency/
├── 05-Pseudocode-Bitwise/
├── ...
├── 14-Mock-Tests/
│
├── solutions/               # Completed solutions, separated from practice files
├── hints/                   # Hints for AI-TEACHER.md or manual reading
├── .build/                  # Temporary folder used by run-test.ps1 for compiled .class files and temp output (DO NOT commit)
└── documentation files      # README.md, PROGRESS.md, QUESTION_INDEX.md, etc.
```

### Directory Purposes
* **`.vscode/`:** Contains local workspace settings. Do not modify these unless adding new global testing tasks.
* **`scripts/`:** Contains PowerShell scripts that pipe JSON test cases into compiled Java `.class` files. Do not modify these.
* **Topic Folders (e.g., `01-Arrays/`):** Each top-level folder contains subtopic folders. These subfolders hold the `.java` and `.tests.json` files for practice. **No tests or code should go directly in the root.**
* **`.build/`:** Automatically generated folder for storing `.class` and temporary test files. Ignored by git.
* **`solutions/` & `hints/`:** For reference materials. They do not trigger the automated test runner.

---

## Section 3 — The Golden Rule

# Every Question Has Two Important Files

```text
QXXQuestionName.java
QXXQuestionName.tests.json
```

For the automated test runner (`scripts/run-test.ps1`) to work perfectly, your question file and test file must be linked by their filename.

**Preferred Standard (Exact Match):**
* Java File: `Q02ArraySum.java` (Class name should be `Q02ArraySum`)
* Test File: `Q02ArraySum.tests.json`

**Fallback Behavior (Hyphenated Tests):**
The PowerShell test runner ignores hyphens when attempting to link a Java file to a test file. Therefore, if you prefer hyphenating the JSON file, the following is also perfectly valid and currently used in the repository:
* Java File: `Q02ArraySum.java`
* Test File: `Q02-ArraySum.tests.json`

Regardless of whether you use the exact match or the hyphenated fallback, **both files must reside in the exact same subfolder**.

### The `.tests.json` Structure
When creating a test file, use the following structure:
```json
{
  "question_id": "ACC-ARR-E01",
  "title": "Title of the Question",
  "visible": [
    {
      "name": "Test 1 - Basic Case",
      "input": "5\n1 2 3 4 5",
      "expected": "15"
    }
  ],
  "hidden": [
    {
      "name": "Hidden Test 1",
      "input": "2\n10 20",
      "expected": "30"
    }
  ]
}
```
*Note: Make sure your Java class reads from `System.in` (e.g., using `Scanner`) and prints to `System.out`.*

---

## Section 4 — The AI Generation Prompt

To make adding questions incredibly fast, copy and paste the prompt below into any AI (ChatGPT, Claude, Gemini, Antigravity, etc.). The AI will ask you what question you want to add and then perfectly generate the required files for this repository.

**Copy this prompt:**

> **System Prompt: Accenture Coding Prep Repository Assistant**
> 
> Act as an Expert Java Developer and Open Source Maintainer. I want to add a new coding practice question to my local Accenture Coding Prep repository. 
> 
> **Your Task:**
> 1. First, ask me: "What topic and problem statement would you like to add?"
> 2. Wait for my response.
> 3. Once I provide the problem, generate TWO files for me using the exact conventions of my repository.
> 
> **Repository Conventions:**
> - **File 1 (Java):** `QXXQuestionName.java`. Must include the problem statement in comments at the top, a `public class QXXQuestionName`, and use `Scanner` to read from `System.in` and `System.out.println()` to print output.
> - **File 2 (Tests):** `QXX-QuestionName.tests.json` OR `QXXQuestionName.tests.json`. Must contain a JSON object with `"question_id"`, `"title"`, `"visible"` (array of test cases with `"name"`, `"input"`, `"expected"`), and `"hidden"` (array of test cases).
> 
> Do not generate anything until you ask me what problem I want to add!
