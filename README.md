# DFA String Acceptance Checker

A simple Java program that simulates a **Deterministic Finite Automaton (DFA)** to check whether a given binary string **ends with `01`**.

---

## 🧠 Objective
Implement and simulate a DFA that accepts binary strings ending in `01`.

---

## ⚙️ Features
- Simulates state transitions of a DFA.
- Validates input to ensure it contains only binary digits (`0` and `1`).
- Prints `Accepted` if the string ends with `01`; otherwise prints `Rejected`.

---

## 📋 DFA Design

| State | Input `0` | Input `1` | Description           |
|--------|------------|------------|------------------------|
| **q0** | q1         | q0         | Start state            |
| **q1** | q1         | q2         | Saw `0`, waiting for `1` |
| **q2** | q1         | q0         | Accepting state (ends with `01`) |

- **Start State:** q0  
- **Accept State:** q2  
- **Language:** Binary strings ending with `01`

---

## 💻 Sample Input/Output

**Input:**
```
1101
```
**Output:**
```
Accepted
```

**Input:**
```
1110
```
**Output:**
```
Rejected
```
