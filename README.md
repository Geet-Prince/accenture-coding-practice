# Accenture Coding Practice: Automated Placement Sandbox (2026 ASE/AASE)

[![GitHub Stars](https://img.shields.io/github/stars/Geet-Prince/accenture-coding-practice?style=social)](https://github.com/Geet-Prince/accenture-coding-practice)
[![Java](https://img.shields.io/badge/Java-Zero%20Dependency-orange.svg)](https://java.com)
[![Accenture Hiring](https://img.shields.io/badge/Accenture_Hiring-2026_Batch-blue.svg)](#)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Welcome to the ultimate offline testing sandbox for the **2026 Accenture placement coding questions**. This is not a static PDF or generic Markdown dump; it is a fully automated, local LeetCode-style environment powered by a zero-dependency Java architecture and custom PowerShell scripts. Designed explicitly for the Associate Software Engineer (ASE) and Advanced Associate Software Engineer (AASE) roles, this standalone educational software product allows you to master the exact historical curriculum required to clear the Stage 1 Cognitive & Technical assessment and the final coding round.

## Curriculum Strategy & Priority Matrix
Unlike generic DSA guides, this curriculum strictly follows Accenture's historical hiring patterns for the 2026 season. We aggressively prioritize what gets you hired and explicitly tell you what to ignore to save your preparation time.

### S-Tier Priorities (Must Master)
- **Arrays (14 Sub-topics):** Heavy focus on Traversal, Kadane's algorithm, and the Equilibrium Index. 
- **Strings (10 Sub-topics):** Parsing, character validation, and manipulation.
- **Math & Number Properties:** Core divisibility and modulus logic.

### A-Tier Priorities (For Stage 1 Elimination)
- **Pseudocode & Bitwise Operations:** Crucial for beating the time-pressured Stage 1 Cognitive & Technical filter.

### The "Do Not Study" List
Deliberately deprioritize the following topics. They are practically never asked in the 45-minute, 2-question format:
- ❌ Dynamic Programming
- ❌ Graphs
- ❌ Trees

## The Core Testing Engine
This repository operates as a fully fledged testing sandbox. Our custom PowerShell script architecture (`run-test.ps1` and `run-all-tests.ps1`) pipes `.tests.json` inputs via standard input (`stdin`) into your Java code. It enforces a strict 5-second Time Limit Exceeded (TLE) timeout and renders a highly visual, colorful PASS/FAIL diff UI directly in your VS Code terminal.

## VS Code Native Integration
Transform your local VS Code into a fully automated testing environment with zero friction.

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/Geet-Prince/accenture-coding-practice.git
```
*(Open the cloned folder directly in VS Code: **File > Open Folder...**)*

### 2️⃣ Run Your First Test
1. Open any question file (e.g., `01-Arrays/01-Traversal/Q02ArraySum.java`).
2. Press **`Ctrl+Shift+B`**.
3. The system compiles your code into the hidden `.build/` directory and executes it against the test cases instantly!

<div align="center">
  <img src="img/final%20success%20Result.png" alt="Automated Testing Engine Executing Test Cases" width="800"/>
</div>

## High-Frequency Historical Questions Index
The following specific algorithmic problems are heavily recycled in Accenture assessments. 

### Rat Count House
**Category:** Arrays / Basic Logic  
Map directly to the S-Tier Arrays curriculum section. A foundational traversal and summation problem.

### Difference of Sum
**Category:** Math / Number Properties  
A highly searched query that tests basic divisibility logic. Master this in the S-Tier Math section.

### Password Validator / Checker
**Category:** Strings / Character Validation  
Search volume for this specific string parsing question peaks heavily before assessments. Feature prominently in your Strings preparation.

### Binary String Operations
**Category:** Strings / Bitwise  
Bridges string manipulation with cognitive technical requirements. Essential for the Stage 1 Cognitive & Technical assessment.

### Maximum Element and Index
**Category:** Arrays / Traversal  
Utilize this as a baseline example to understand how our standardized `calculate()` block and standard header templates function.

## Architectural Map
To help both you and AI agents understand the repository structure:
- `14-Mock-Tests/`: Contains 10 distinct, 45-minute simulated exam folders recycling questions from the main banks under time pressure.
- `ROADMAP.md`: A 30-day progression plan spanning four weeks, plus a built-in 7-Day Emergency Plan.
- `PROGRESS.md`: A manual checkbox tracking system to monitor your status (Attempted, Solved, Mastered).
- `AI-TEACHER.md`: A graduated hint system for AI LLMs (Copilot, ChatGPT) to provide Conceptual and Algorithmic Hints rather than raw answers.

## 🤝 Contribution & Engagement
If this automated sandbox helped you streamline your preparation and beat the Stage 1 Cognitive & Technical filter, please consider giving the repository a ⭐️ to help other students discover this environment.
