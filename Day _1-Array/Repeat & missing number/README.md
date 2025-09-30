# 🧮 DSA Problem Solutions

This repository contains my solutions to various **Data Structures & Algorithms (DSA)** problems, solved systematically with clean and organized structure.  
Each problem includes its **description, constraints, and examples** for clarity.  

---

## 📌 Problem: Find Missing and Repeated Values  
**LeetCode 2965** - [Find Missing and Repeated Values](https://leetcode.com/problems/find-missing-and-repeated-values/)  
**Difficulty:** Easy  
**Topic Tags:** Arrays, Hashing, Matrix  

---

### 🔍 Problem Statement  
You are given a 0-indexed **2D integer matrix** `grid` of size `n * n` with values in the range `[1, n²]`.  
Each integer appears exactly **once**, except:  
- One integer `a` appears **twice**.  
- One integer `b` is **missing**.  

Return a 0-indexed integer array `ans` of size 2 where:  
- `ans[0] = a` (repeated value)  
- `ans[1] = b` (missing value)  

---

### ✅ Examples  

**Example 1:**  
```text
Input: grid = [[1,3],[2,2]]
Output: [2,4]
Explanation: Number 2 is repeated and number 4 is missing.

**Example 1:**  
```text
Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
Output: [9,5]
Explanation: Number 9 is repeated and number 5 is missing.

⚙️ Constraints

2 <= n == grid.length == grid[i].length <= 50

1 <= grid[i][j] <= n²

For all integers x in [1, n²]:

Exactly one number appears twice.

Exactly one number is missing.

All other numbers appear once.
