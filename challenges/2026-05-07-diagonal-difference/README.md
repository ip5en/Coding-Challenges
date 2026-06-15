---
title: Diagonal Difference
source: https://www.hackerrank.com/challenges/diagonal-difference/problem
difficulty: easy
tags:
  - arrays
  - 2d arrays
  - matrix
languages:
  - java
---

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix arr is:

```
1 2 3
4 5 6
9 8 9
```

The left-to-right diagonal = 1 + 5 + 9 = 15
The right-to-left diagonal = 3 + 5 + 9 = 17
Their absolute difference is |15 - 17| = 2

## Function Description

Complete the function with the following parameters:

- `arr`: a 2D array of integers

Returns
- `int`: the absolute difference between the diagonal sums

## Constraints

- 1 ≤ n ≤ 100
- -100 ≤ arr[i][j] ≤ 100

## Sample Input

```
3
11 2 4
4 5 6
10 8 -12
```

## Sample Output

15

## Explanation

The primary diagonal is:
11
5
-12
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:
4
5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19

Absolute difference: |4 - 19| = 15

---
