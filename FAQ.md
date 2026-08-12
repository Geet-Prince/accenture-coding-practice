# ❓ Frequently Asked Questions (FAQ) — Accenture Coding Prep 2027

> Essential guidance for candidates preparing for the **Accenture placement drive (2027 Batch)** for **Associate Software Engineer (ASE)** and **Advanced Associate Software Engineer (AASE)** roles. Answers are derived from verified candidate placement data from 2020 to 2026.

---

## What is the Accenture ASE coding round pattern for 2027?

For the **2027 batch campus placement drive**, Accenture's selection process typically follows a multi-stage elimination pipeline:

1. **Stage 1: Cognitive & Technical Assessment (90 minutes, 90 MCQs)** — *Elimination Stage*
   - Includes English Ability (17 Qs), Critical Reasoning (18 Qs), Abstract Reasoning (15 Qs), **Pseudocode** (18 Qs - heavy filter on bitwise operators & loops), MS Office (12 Qs), and Cloud/Networking (10 Qs).
2. **Stage 2: Coding Assessment (45–60 minutes, 2 to 3 coding questions)** — *Elimination Stage*
   - Unlocked immediately upon clearing Stage 1 cutoffs. Evaluates logic implementation, edge case handling, and optimal time/space complexity.
3. **Stage 3: Communication Assessment (20 minutes, AI Automated)** — *Non-eliminatory / Score used for final weighting*
   - Evaluates pronunciation, fluency, vocabulary, and sentence construction.
4. **Stage 4: Technical & HR Interview** — *Final Selection*

---

## How many questions are asked in the Accenture coding assessment?

Accenture asks **2 to 3 coding questions** in their assessment round:
- **Standard Drives (45 minutes):** 2 coding questions (1 Easy/Fundamental, 1 Medium/Logic-heavy).
- **Expanded Drives (60 minutes):** 3 coding questions (1 Easy, 1 Medium, 1 Moderate/Pattern-based).

Candidates must aim for 100% test case coverage on all questions to qualify for higher-tier roles like AASE.

---

## What programming languages are allowed in Accenture coding rounds?

Accenture's assessment platforms (such as HackerRank, HirePro, CoCubes, or Mettl) support major programming languages including:
- **Java** (Recommended & Primary focus of this repository)
- **C**
- **C++**
- **Python 3**
- **JavaScript / Node.js**

*Note:* This repository uses a **Java-first, zero-dependency architecture** (`java.util.*` and standard IO) to ensure seamless offline practice and matching execution constraints.

---

## Is Dynamic Programming asked in Accenture placements?

**No.** Dynamic Programming (DP), Graph algorithms, and complex Tree structures are **rarely or never asked** in Accenture's 45–60 minute coding rounds for ASE or AASE roles. 

Accenture coding assessments focus on high-speed problem-solving involving:
- Arrays & Subarray manipulation
- String parsing & frequency counts
- Mathematical formulas, divisibility & base conversion
- Bitwise operations and basic recursion

Advanced DP and Graph algorithms are categorized under the **"Do Not Study"** list in our syllabus to maximize preparation efficiency.

---

## What is the salary for Accenture ASE 2027?

For the **2027 placement batch**, Accenture offers competitive compensation packages categorized by role and performance in the coding round:

| Role | Designation | Salary Package (CTC) | Coding Round Requirement |
| :--- | :--- | :--- | :--- |
| **ASE** | Associate Software Engineer | **~₹4.5 LPA** | Solve 1 question fully + 1 partially |
| **AASE** | Advanced Associate Software Engineer | **~₹6.5 LPA** | Solve BOTH questions fully (100% pass) |
| **AEH / FSE** | Full Stack Engineer / Analyst | **~₹9.8 LPA** | 100% test cases + optimal time/space complexity |

---

## What is the difference between ASE and AASE at Accenture?

Both **ASE (Associate Software Engineer)** and **AASE (Advanced Associate Software Engineer)** appear for the **exact same initial coding assessment**. Differentiation occurs based on test performance:

- **ASE (~₹4.5 LPA):** Candidates who pass the cutoff by solving at least one coding question fully and demonstrating basic logic.
- **AASE (~₹6.5 LPA):** High-performing candidates who achieve 100% test-case pass rates on all questions within time limits using optimal data structures and clean code without memory/time overflows.

---

## How do I run the automated test cases offline?

This repository includes a built-in automated PowerShell test runner integrated into VS Code:

1. Open the repository root folder in **VS Code**.
2. Open any `.java` problem file (e.g., `01-Arrays/01-Traversal/Q01BasicTraversal.java`).
3. Write your solution inside the `calculate()` method.
4. Press **`Ctrl + Shift + B`** (or mapped shortcut `Ctrl + Alt + T`).

The test runner will compile your code into `.build/`, load the hidden test cases from the corresponding `.tests.json` file, execute them via `stdin`, and print a color-coded **PASS / FAIL** summary with timing metrics.

---

## How long is the Accenture coding assessment?

The coding assessment section is allocated **45 minutes** (for 2 questions) or **60 minutes** (for 3 questions). Candidates are advised to spend no more than 15–20 minutes per problem to leave sufficient time for debugging hidden edge cases.

---

## What topics should I focus on for Accenture coding rounds?

Based on empirical data from 2020 to 2026 drives, target your preparation according to these priority tiers:

- **S-Tier (Highest Priority - 70% of questions):**
  - **Arrays:** Traversal, indexing, max/min pairs, sliding windows, prefix sums.
  - **Strings:** Vowel/consonant counts, character replacements, substring logic, anagrams.
  - **Math & Numbers:** Base conversions (Decimal to N-Base), divisibility rules, digit sums, exponentiation.
  - **Hashing & Frequency:** Counting occurrences, finding unique elements, mapping frequencies.

- **A-Tier (Stage 1 MCQs & Fundamentals):**
  - **Pseudocode & Bitwise:** Bitwise XOR/AND/OR logic, loop execution tracking, conditional execution.

---

## Can I use this repository on Mac or Linux?

**Yes.** While the default execution task uses PowerShell, PowerShell Core (`pwsh`) is cross-platform:

1. Install **PowerShell Core (`pwsh`)** and **Java JDK 17+** (or JDK 8+) on your Mac/Linux machine.
2. Clone the repository and open it in VS Code.
3. Run test cases via terminal using:
   ```bash
   pwsh ./scripts/run-test.ps1 ./01-Arrays/01-Traversal/Q01BasicTraversal.java
   ```
4. Alternatively, update `.vscode/tasks.json` to point `command` to `pwsh`.

---

[← Back to README](README.md)
