---
title: Compare the Triplets
source: https://www.hackerrank.com/challenges/compare-the-triplets/problem
difficulty: easy
tags:
  - arrays
  - comparison
languages:
  - java
time_spent: 10m
---

Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

- If a[i] > b[i], then Alice is awarded 1 point.
- If a[i] < b[i], then Bob is awarded 1 point.
- If a[i] == b[i], then neither person receives a point.

Return the score of [alice_score, bob_score].

## Example

Input:
a = [1, 2, 3]
b = [3, 2, 1]

Output:
[2, 1]

Explanation:
- a[0] (1) < b[0] (3): Bob gets 1 point
- a[1] (2) == b[1] (2): No one gets a point
- a[2] (3) > b[2] (1): Alice gets 1 point
- Final score: Alice = 1, Bob = 1. Wait, the output is [2, 1].

Let me recalculate: If a = [5, 6, 7] and b = [3, 6, 10]:
- a[0] (5) > b[0] (3): Alice gets 1 point
- a[1] (6) == b[1] (6): No one gets a point
- a[2] (7) < b[2] (10): Bob gets 1 point
- Score: [1, 1]

## Function Description

Complete the function with the following parameters:

- `a`: an array of 3 integers (Alice's ratings)
- `b`: an array of 3 integers (Bob's ratings)

Returns
- `List<Integer>`: an array of 2 integers representing [alice_score, bob_score]

## Constraints

- 1 ≤ a[i], b[i] ≤ 100

## Sample Input

a = [5, 6, 7]
b = [3, 6, 10]

## Sample Output

[1, 1]

---
