# Matrix Layer Rotation

## Problem
Rotate the elements of a matrix layer by layer in a counterclockwise direction.

## Solution Approach
The solution extracts each concentric layer of the matrix into a separate list, rotates each layer by the specified amount, and then reconstructs the matrix.

## Key Features
- Optimizes rotations using modulo to avoid unnecessary full rotations
- Processes each layer independently
- Time complexity is optimized for complex test cases

## Input Parameters
- `matrix`: 2D array of integers
- `r`: Number of rotations
- `m`: Number of rows
- `n`: Number of columns
