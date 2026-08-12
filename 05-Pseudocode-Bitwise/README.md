# 05 — Pseudocode & Bitwise

## Priority: A — HIGH (Critical for Stage 1!)

## Historical Importance
Stage 1 of Accenture assessment has 18 DEDICATED pseudocode questions.
This section is a heavy elimination filter — many candidates fail Stage 1 even with good coding skills.

## What to Focus On
- Bitwise XOR (^), AND (&), OR (|) — frequently tested in loops
- Pre-increment (++i) vs Post-increment (i++) inside expressions
- Nested loop output prediction (count iterations)
- Recursion return value tracing

## Classic Pattern (Memorize)
```
a = a ^ b;
b = b ^ a;
a = a ^ b;
```
This swaps a and b without a temp variable.
Trace it manually: if a=5, b=3 → after: a=3, b=5

## Study: Output Prediction
Given code → predict the printed output. Practice by running code mentally line by line.
