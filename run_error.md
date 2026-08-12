# 🚨 Testing & Compilation Error Troubleshooting (For AI)

If you ran into an issue while trying to compile or test your code using the built-in system (like pressing `Ctrl+Shift+T`, `Ctrl+Shift+C`, or using `Ctrl+Shift+P` -> `Tasks: Run Task`), don't worry!

You can easily get a solution by copying the template below and pasting it into any AI (ChatGPT, Claude, Gemini, etc.) along with your error message.

This template is specially designed to give the AI all the necessary context about how this repository is built. By understanding the folder structure and the scripts, the AI will be able to analyze your problem and give you the exact fix immediately.

---

## 📋 Copy & Paste This Prompt to Your AI:

```text
I am working on the "Accenture Coding Practice & Placement Preparation" repository in VS Code on Windows.
The repository uses a LeetCode-style local testing system powered by PowerShell scripts.

### Repository Context & File System Structure:
- Java source files (like `Q01-BasicTraversal.java`) are located inside topic folders (e.g., `01-Arrays/01-Traversal/`).
- The testing scripts are located in the `scripts/` directory at the root.
  - `scripts/run-test.ps1`: Tests a specific Java file by comparing its output against expected values.
  - `scripts/compile.ps1`: Compiles a specific Java file.
  - `scripts/run-all-tests.ps1`: Runs all tests across the workspace.
- The `.build/` folder is used by the scripts to store compiled `.class` files.
- VS Code tasks are defined in `.vscode/tasks.json`.
- There are custom keybindings defined in `.vscode/keybindings.json`.
- Users run tests using `Ctrl+Shift+T` (test) or `Ctrl+Shift+C` (compile). 
- If shortcuts fail, users are instructed to use the fallback: `Ctrl+Shift+P` -> `Tasks: Run Task` -> select `Accenture: Compile Current Question` or `Accenture: Run Current Question`.

### The Problem:
I attempted to compile/test my code, but encountered the following error output in the terminal/console:

[PASTE YOUR ERROR MESSAGE HERE]

### My Code:
Here is the code inside my current file:

[PASTE YOUR CODE HERE]

### Request:
Based on the repository's structure, the testing scripts architecture, and my code:
1. Analyze the problem deeply and explain why this error is happening.
2. Provide the best possible solution to fix this error. Tell me exactly what I need to change in my code or how I should run the task differently.
```
