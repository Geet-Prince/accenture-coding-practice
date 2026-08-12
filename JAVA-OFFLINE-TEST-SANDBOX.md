# Java Offline Test Sandbox for Accenture Placement Preparation

> **Automated Local Testing Engine for Accenture 2027 Recruitment Drives (ASE & AASE Roles)**
> Sourced from historical assessment patterns (2020–2026). Zero dependencies. Millisecond execution feedback inside VS Code.

---

## 📌 Executive Summary

The **Java Offline Test Sandbox** is an automated, LeetCode-style local execution engine built directly into this repository. Designed specifically for candidates preparing for **Accenture's 2027 Associate Software Engineer (ASE)** and **Advanced Associate Software Engineer (AASE)** placement assessments, it enables instant offline compilation, test execution, time-limit enforcement, and output diffing directly inside **Visual Studio Code**.

Instead of copying code into browser-based online judges or waiting on slow web IDEs, you can solve Accenture historical coding problems offline with zero network latency, strict test verification, and automated edge-case handling.

---

## 🔍 What is the Offline Test Sandbox?

The Offline Test Sandbox is an automated testing harness powered by custom PowerShell scripts ([`run-test.ps1`](file:///P:/accenture/accenture/Accenture-Coding-Prep/scripts/run-test.ps1)) and native VS Code task integration ([`.vscode/tasks.json`](file:///P:/accenture/accenture/Accenture-Coding-Prep/.vscode/tasks.json)).

It pairs every Java problem file (e.g., `Q01-RatCountHouse.java`) with a structured JSON test matrix (`Q01-RatCountHouse.tests.json`). When invoked, the runner:
1. Compiles your Java source code into an isolated build folder (`.build/`).
2. Loads visible and hidden test case suites.
3. Feeds input via standard input (`stdin`) into your compiled Java process.
4. Captures standard output (`stdout`) and standard error (`stderr`).
5. Enforces a **5-second Time Limit Exceeded (TLE)** cutoff per test case.
6. Performs whitespace and line-ending normalization on output.
7. Produces a color-coded terminal verdict (Accepted, Wrong Answer, Runtime Error, TLE, or Compilation Error).

```
 ┌────────────────┐      ┌─────────────────────────┐      ┌─────────────────────┐
 │ Your Java Code │ ───► │  scripts/run-test.ps1   │ ───► │  Terminal Verdict   │
 │ (Solution.java)│      │  Compiles & Runs Tests  │      │ [PASS] / [FAIL] Diff│
 └────────────────┘      └─────────────────────────┘      └─────────────────────┘
                                      ▲
                                      │ Loads
                         ┌─────────────────────────┐
                         │  Q01-Question.tests.json│
                         │ (Visible + Hidden Cases)│
                         └─────────────────────────┘
```

---

## 💡 Why Offline Testing Matters for Accenture Prep

Preparing for Accenture placement drives using traditional online compilers presents several limitations. Here is why an offline sandbox is essential for 2027 candidate success:

> [!IMPORTANT]
> Accenture assessment platforms (such as HackerRank, HirePro, and CoCubes) strictly evaluate both **visible sample test cases** and **hidden edge test cases**. Failing to handle empty arrays, null inputs, or negative integers results in package downgrade from AASE (~6.5 LPA / 9.8 LPA) to ASE (~4.5 LPA) or outright rejection.

1. **Zero Latency Feedback:** Compiles and executes test cases in milliseconds without queue delays or web timeouts.
2. **100% Offline Capability:** Practice anywhere without requiring an active internet connection.
3. **Local IDE Superpowers:** Full access to VS Code syntax highlighting, auto-completion, line-by-line debugging, and error diagnostics.
4. **Realistic Exam Constraints:** Enforces strict execution time limits (5.0s TLE) and strict output formatting identical to hiring platforms.
5. **Dual Test Suite (Visible + Hidden):** Test your solution against basic sample cases first, then validate against hidden boundary cases (null arrays, large numbers, negative values).
6. **No Workspace Pollution:** All compiled `.class` binaries and temporary execution buffers are contained within `.build/` and ignored by Git.

---

## 🏗️ Technical Architecture: How `run-test.ps1` Works

The heart of the offline test engine is [`scripts/run-test.ps1`](file:///P:/accenture/accenture/Accenture-Coding-Prep/scripts/run-test.ps1). Here is a breakdown of its internal execution pipeline:

```powershell
# Core command signature:
.\scripts\run-test.ps1 <Path-To-Java-File> [-Visible] [-All] [-Hidden] [-Timeout <seconds>]
```

### 1. Isolated Compilation
* The script resolves the path of the target `.java` file.
* It extracts the `public class` name using regular expressions (`public\s+class\s+(\w+)`).
* Copies the file to the `.build/` folder to avoid cluttering source directories.
* Invokes `javac -encoding UTF-8 -d ".build" ".build/ClassName.java"`.
* Filters out benign JVM warnings (e.g., `JAVA_TOOL_OPTIONS`).

### 2. Test Suite Loading & Resolution
* Locates the companion `.tests.json` file in the same folder.
* Parses JSON containing `visible` and `hidden` test objects:
```json
{
  "question_id": "ACC-ARR-H01",
  "title": "Rat Count House",
  "visible": [
    {
      "name": "Basic Case",
      "input": "7\n2\n8\n2 8 3 5 7 4 1 2",
      "expected": "4"
    }
  ],
  "hidden": [
    {
      "name": "Empty Array Edge Case",
      "input": "0\n2\n8",
      "expected": "-1"
    }
  ]
}
```

### 3. Subprocess Execution & `stdin` Piping
* For each test case, input string data is written to a temporary UTF-8 file (`test_input_N.txt`).
* Spawns `java -cp ".build" ClassName < test_input_N.txt` using `System.Diagnostics.Process`.
* Standard output and standard error are redirected asynchronously to prevent buffer deadlocks.

### 4. 5-Second Time Limit Exceeded (TLE) Enforcement
* Uses `$process.WaitForExit(Timeout * 1000)` with a default timeout of **5 seconds**.
* If a solution enters an infinite loop or exceeds time limits, `$process.Kill()` is immediately triggered, logging a `[TLE]` verdict with diagnostic tips.

### 5. Output Normalization & Diff Evaluation
* Strips leading and trailing whitespace.
* Normalizes carriage returns (`\r\n` vs `\n`) across Windows, macOS, and Linux platforms.
* Compares normalized actual output against expected output (`$normalizedActual -ceq $normalizedExpected`).

---

## ⚙️ VS Code Integration (`tasks.json`)

The test runner integrates directly with Visual Studio Code via [`.vscode/tasks.json`](file:///P:/accenture/accenture/Accenture-Coding-Prep/.vscode/tasks.json). This allows you to test your current file with a single keyboard shortcut.

### `.vscode/tasks.json` Configuration
```json
{
    "version": "2.0.0",
    "tasks": [
        {
            "label": "Accenture: Run Current Question",
            "type": "process",
            "windows": { "command": "powershell" },
            "linux": { "command": "pwsh" },
            "osx": { "command": "pwsh" },
            "args": [
                "-NoProfile",
                "-ExecutionPolicy", "Bypass",
                "-File", "${workspaceFolder}/scripts/run-test.ps1",
                "${file}"
            ],
            "group": { "kind": "build", "isDefault": true },
            "presentation": { "reveal": "always", "panel": "dedicated", "clear": true, "focus": true }
        }
    ]
}
```

### Key Keyboard Shortcuts
* **`Ctrl + Shift + B`** (Windows/Linux) or **`Cmd + Shift + B`** (macOS): Runs default build task (`Accenture: Run Current Question`) on the active file.
* **`Ctrl + Shift + }`** (Custom keymap option): Run visible tests instantly.

---

## 🚀 Step-by-Step Setup Instructions

Follow these steps to set up your offline test environment in under 2 minutes:

### Step 1: Install Prerequisites
* **Java Development Kit (JDK):** JDK 17+ (or JDK 8+). Verify by running `java -version` and `javac -version` in your terminal.
* **VS Code:** Installed with the optional *Extension Pack for Java*.
* **PowerShell:** Built into Windows; available via `pwsh` on macOS and Linux.

### Step 2: Clone the Repository
```bash
git clone https://github.com/Geet-Prince/accenture-coding-practice.git
```

### Step 3: Open the Exact Root Directory in VS Code
> [!CAUTION]
> You **must** open the cloned `accenture-coding-practice` (or root `Accenture-Coding-Prep`) folder directly in VS Code (**File > Open Folder...**). Opening a parent folder will cause path resolution scripts to fail.

### Step 4: Open a Question File
Navigate to any question file, such as:
`01-Arrays/14-Accenture-Previous-Questions/Q01-RatCountHouse.java`

### Step 5: Write Solution & Run
Write your solution inside the marked `calculate()` or main execution method, then press **`Ctrl + Shift + B`**.

---

## 🛠️ Troubleshooting Common Errors

| Error Signature | Root Cause | Solution / Fix |
| :--- | :--- | :--- |
| **PowerShell Execution Policy Error** (`cannot be loaded because running scripts is disabled`) | PowerShell default security blocks unsigned local scripts on Windows. | Run PowerShell as Administrator and execute: `Set-ExecutionPolicy -Scope CurrentUser -ExecutionPolicy RemoteSigned` (or rely on VS Code's `-ExecutionPolicy Bypass` task flag). |
| **`FILE NOT FOUND`** | You ran the command on an invalid path or non-existent Java file. | Ensure the currently open file is a valid `.java` file located inside a topic directory. |
| **`TEST FILE NOT FOUND`** | The `.tests.json` file is missing or named incorrectly. | Create `QXX-FileName.tests.json` in the exact same directory as `QXX-FileName.java`. |
| **`COMPILATION ERROR`** | Java syntax error or class name mismatch. | Ensure public class name matches the Java filename. Check syntax and fix red squigglies. |
| **`TIME LIMIT EXCEEDED (5s)`** | Infinite loop or high complexity ($O(N^2)$ / $O(N!)$). | Optimize loop bounds, check termination conditions, and verify array index increments. |
| **`java` / `javac` is not recognized** | JDK is not added to System Environment Variables (`PATH`). | Add JDK `bin` directory (e.g., `C:\Program Files\Java\jdk-17\bin`) to your system `PATH`. |
| **Tasks Not Appearing in VS Code** | VS Code workspace settings haven't reloaded. | Press `Ctrl + Shift + P` -> Select `Developer: Reload Window`. |

---

## 📊 Comparison: Online Judges vs Java Offline Sandbox

| Feature | Online Judges (HackerRank / LeetCode) | Java Offline Test Sandbox |
| :--- | :--- | :--- |
| **Execution Latency** | 2 to 10 seconds (network + queue) | **< 200 milliseconds** (local process) |
| **Internet Requirement** | Mandatory active connection | **100% Offline / No Internet** |
| **Debugging** | Print statements only / Paid debuggers | **Full VS Code Breakpoints & Step Debugging** |
| **Hidden Test Visibility** | Obfuscated / Locked behind submit | **Full visibility control (`-All`, `-Hidden`)** |
| **Custom Test Addition** | Web UI form filling | **Edit local `.tests.json` directly** |
| **Accenture Question Focus** | Generic DSA mix | **100% Accenture Historical (2020–2026)** |
| **Target Role Alignment** | Generic | **ASE (4.5 LPA) & AASE (6.5 / 9.8 LPA)** |

---

## 🔗 Related Documentation & Links

* 📖 **[Main Repository README](README.md)** ([`README.md`](file:///P:/accenture/accenture/Accenture-Coding-Prep/README.md)) — Complete overview & setup guide.
* 🧪 **[Full Testing Guide](TESTING.md)** ([`TESTING.md`](file:///P:/accenture/accenture/Accenture-Coding-Prep/TESTING.md)) — Detailed commands for running topic-wide and repo-wide test suites.
* 📅 **[30-Day Preparation Roadmap](ROADMAP.md)** ([`ROADMAP.md`](file:///P:/accenture/accenture/Accenture-Coding-Prep/ROADMAP.md)) — Step-by-step study schedule.
* 📚 **[Accenture Evidence Syllabus](SYLLABUS.md)** ([`SYLLABUS.md`](file:///P:/accenture/accenture/Accenture-Coding-Prep/SYLLABUS.md)) — S-Tier, A-Tier, and Skip topic breakdown.
* 🔬 **[Accenture Hiring Research](RESEARCH.md)** ([`RESEARCH.md`](file:///P:/accenture/accenture/Accenture-Coding-Prep/RESEARCH.md)) — Deep dive into 2020–2026 question trends.
