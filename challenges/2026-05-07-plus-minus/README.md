---
title: Plus Minus
source: https://www.hackerrank.com/challenges/plus-minus/problem
difficulty: easy
tags:
  - arrays
  - loops
  - floating point
languages:
  - java
---

Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line.

## Example

Input: arr = [1, 1, 0, -1, -1]

Output:
```
0.400000
0.400000
0.200000
```

Explanation:
- There are 2 positive numbers: 1, 1
- There are 2 negative numbers: -1, -1
- There is 1 zero: 0
- Positive ratio: 2/5 = 0.400000
- Negative ratio: 2/5 = 0.400000
- Zero ratio: 1/5 = 0.200000

## Function Description

Complete the function with the following parameters:

- `arr`: an array of integers

The function should print three lines:
- The ratio of positive numbers in the array
- The ratio of negative numbers in the array
- The ratio of zeros in the array

## Constraints

- 1 ≤ n ≤ 100
- -100 ≤ arr[i] ≤ 100
- arr[i] ≠ 0 (at least one element is non-zero)

## Sample Input

arr = [1, 1, 0, -1, -1]

## Sample Output

```
0.400000
0.400000
0.200000
```

---
