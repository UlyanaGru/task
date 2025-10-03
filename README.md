# Success in Probability Theory

## Problem Description

Arkady solves probability problems every day until he achieves "success". According to Arkady, he achieves success when **immediately after an incorrectly solved problem, he manages to solve two problems in a row correctly**.

**Conditions:**
- All problems are different (he never returns to previously attempted problems)
- Probability of solving each problem is `p`
- Events are independent
- `0.25 ≤ p ≤ 0.75` with precision to hundredths

**Required:** Find the mathematical expectation of the number of problems Arkady will solve in a day until achieving success.

## Mathematical Solution

The problem is modeled as a Markov chain with states:

- **S0**: Initial state (or after correct solution outside success pattern)
- **S1**: Just made an error
- **S2**: After error, solved 1 problem correctly
- **S3**: Success (absorbing state)

### System of Equations

Let:
- `E₀` - expected number of problems from S0
- `E₁` - expected number of problems from S1
- `E₂` - expected number of problems from S2

Equations:

E₀ = 1 + pE₀ + (1-p)E₁\
E₁ = 1 + pE₂ + (1-p)E₁\
E₂ = 1 + p·0 + (1-p)E₁\

### Final Formula

**Mathematical expectation of the number of problems:**

E = 1 / [p²(1-p)]

- [x] [Java](https://github.com/UlyanaGru/task/blob/master/task.java)
- [x] [Python](https://github.com/UlyanaGru/task/blob/master/task.py)
- [x] [C++](https://github.com/UlyanaGru/task/blob/master/task.cxx)