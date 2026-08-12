# 🔬 Research Findings — Accenture Assessment (2020–2026)

> Compiled from 4 parallel research agents covering Reddit, GFG, PrepInsta, FacePrep, GitHub, Glassdoor, LeetCode Discuss, AmbitionBox, Medium, Scribd, Unstop.

---

## Assessment Evolution

| Year | Platform | Questions | Time | Difficulty | Key Change |
|------|----------|-----------|------|------------|------------|
| 2020 | CoCubes / HackerRank / Mettl | 2 | 45 min | Easy-Medium | COVID → virtual SEB |
| 2021 | HirePro / Superset | 2 | 45 min | Easy-Medium | HirePro introduced |
| 2022 | HirePro / Superset | 2 (some: 3) | 45–60 min | Easy-Medium | Stricter edge cases |
| 2023 | HackerRank / CoCubes | 2 | 45 min | Easy-Medium | Performance → role mapping |
| 2024 | HackerRank / Superset | 2 | 45 min | Easy-Medium | ₹9.8 LPA mapping introduced |
| 2025 | HackerRank / CoCubes | 2–3 | 45–60 min | Medium | 3Q/60min in select drives |
| 2026 | HackerRank (updated) | 3 | 60 min | Medium | Standardizing 3Q format |

---

## Assessment Pipeline (Stage 1 + 2)

```
Stage 1: Cognitive & Technical (90 min, 90 MCQs) — ELIMINATION
  ├── English Ability (17 Qs)
  ├── Critical Reasoning (18 Qs)
  ├── Abstract Reasoning (15 Qs)
  ├── PSEUDOCODE (18 Qs) ← Heavy filter, bitwise/loops
  ├── MS Office (12 Qs)
  └── Networking/Cloud (10 Qs)
          ↓ (must clear ALL sectional cutoffs)
Stage 2: Coding Assessment (45–60 min, 2–3 Qs) — ELIMINATION
          ↓
Stage 3: Communication Assessment (AI automated)
          ↓
Stage 4: Technical + HR Interview
```

---

## ~₹9.8 LPA Role Analysis

**CONFIRMED finding (Tier 2 sources — Reddit, AmbitionBox):**
- The ₹9.8 LPA role is: Advanced Application Engineering Analyst / FSE
- Package structure: ~₹7.9 LPA fixed + variable + joining bonus
- **The coding questions are IDENTICAL to the ₹4.5 LPA round**
- Differentiation is purely by performance threshold:

| Role | Package | Coding Threshold |
|------|---------|-----------------|
| ASE | ₹4.5 LPA | Solve 1 fully, 1 partially |
| AASE | ₹6.5 LPA | Solve BOTH fully (100% test cases) |
| AEH/FSE | ₹9.8 LPA | 100% ALL questions + optimal complexity |

---

## Historical Questions (Evidence Summary)

| Question | Year(s) | Evidence | Repeat Count |
|---------|---------|----------|-------------|
| Rat Count House | 2020, 2022, 2023, 2024 | CONFIRMED | 4 |
| Password Checker | 2021, 2022, 2023, 2024 | CONFIRMED | 4 |
| Large Small Sum | 2021, 2022, 2023 | CONFIRMED | 3 |
| Difference of Sum | 2020, 2022, 2024, 2026 | CONFIRMED | 4 |
| Operations Binary String | 2020, 2022, 2024 | CONFIRMED | 3 |
| Product Smallest Pair | 2020, 2023, 2025 | CONFIRMED | 3 |
| Move Hyphen to Front | 2021, 2022, 2024 | CONFIRMED | 3 |
| Max Exponent of 2 | 2021, 2023, 2025 | CONFIRMED | 3 |
| Decimal to N-Base | 2022, 2023 | CONFIRMED | 2 |
| Replace Character | 2022, 2023, 2026 | CONFIRMED | 3 |
| Autobiographical Number | 2022, 2023, 2024 | CONFIRMED | 3 |
| Superior Array Elements | 2025 | PROBABLE | 1 |
| Equilibrium Index | 2026 | PROBABLE | 1 |
| Number of Carry Ops | 2022, 2023 | CONFIRMED | 2 |
| Most Frequent Vowel | 2022, 2023, 2024 | PROBABLE | 3 |
| Linked List Alt. Nodes | 2022 | PROBABLE | 1 |

---

## Accenture Traps (Cause of Package Drop)

1. **Missing null check:** `if (arr == null || arr.length == 0) return -1;`
2. **Wrong return code:** Returning `0` vs `-1` — read the exact problem spec
3. **Java `==` vs `.equals()`:** Use `.equals()` for String comparisons
4. **int overflow:** Use `long` when summing large arrays
5. **ASCII confusion:** `char c = (char)(rem + '0')` vs `(char)(rem - 10 + 'A')`
6. **1-indexed vs 0-indexed output:** Some questions want house count (1-based index +1)
7. **Edge: n <= 3:** LargeSmallSum returns 0 if array length <= 3
8. **Case sensitivity:** Uppercase vs lowercase checks in string problems

---

## Source Quality Tiers

| Tier | Type | Examples |
|------|------|---------|
| A | Official | Accenture.com, HirePro.in |
| B | Direct candidate | GitHub repos, Reddit r/developersIndia |
| C | Multiple reports | GFG interview experiences, Glassdoor |
| D | Prep site (cross-verified) | PrepInsta, FacePrep, GFG |
| E | Blog/aggregator | Medium, Scribd |
| F | SEO/AI-generated | Avoid — often fabricated |

> ⚠️ Many sites label generic DSA as "Accenture previous year." Only questions found in candidate reports or GitHub exam logs are marked CONFIRMED.
