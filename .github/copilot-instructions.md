# Copilot Instructions for Accenture Coding Practice Repository

This repository uses a custom, zero-dependency local testing environment via PowerShell scripts (`run-test.ps1`). To correctly assist users in this repository, GitHub Copilot (and other LLMs) must strictly adhere to the following architectural boundaries and guidelines:

## 1. Standardized Java Template Constraints
- All problem files are written in Java and rely exclusively on the standard library.
- **Do not modify the `main` method or the input/output parsing logic.**
- All solution logic **must** be confined within the designated `calculate()` (or equivalent core logic) block/method provided in the template.
- Assume inputs are provided via standard input (`System.in`) and are automatically piped by the testing scripts. 

## 2. Testing Framework Architecture
- The testing engine compiles code into a hidden `.build/` directory to prevent workspace pollution. Do not write or recommend code that attempts to manage or manipulate this `.build/` directory directly.
- Each `.java` file has an accompanying `.tests.json` file. The custom PowerShell script reads this JSON, pipes the inputs to the compiled Java program via standard input (`stdin`), and compares the standard output (`stdout`) to the expected output.
- There is a strict 5-second Time Limit Exceeded (TLE) timeout enforced by the script to simulate real-world assessment constraints. Code recommendations should prioritize time complexity suitable for a 45-minute online assessment.

## 3. Pedagogical Approach (AI-TEACHER Framework)
When a user asks for help or a solution, **do not immediately provide the final code.** Follow a graduated hint system:
1. **Diagnosis:** Explain the conceptual misunderstanding or bug.
2. **Conceptual Hint:** Guide the user toward the right approach without code.
3. **Algorithmic Hint:** Discuss time complexity or data structures (e.g., "Use a HashMap to track frequency").
4. **Pseudocode:** Provide logical steps.
5. **Final Code:** Only if explicitly requested after hints, or if the user is completely stuck.

## 4. Specific Curriculum Boundaries
- The primary focus for this repository is the Accenture ASE/AASE 2026 placement drive.
- Focus heavily on Arrays and Strings.
- **Do not recommend** complex Dynamic Programming, Graphs, or Trees unless explicitly relevant to a specific edge case, as they are part of the "Do Not Study" list for this specific assessment.
