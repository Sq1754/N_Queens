# N-Queens Problem Solver

This Java program solves the N-Queens problem, which aims to place N queens on an NxN chessboard such that no two queens threaten each other.

## Description

The `N_Queens.java` program implements a backtracking algorithm to find all solutions where queens can be placed safely on the chessboard. It checks for each position whether it is safe to place a queen there, considering the current state of the board. If a valid solution is found, it saves the board configuration. 

## Example

For example, for a 4x4 chessboard, the program will output the following list of all possible solutions:
```
[[.Q.., ...Q, Q..., ..Q.], [..Q., Q..., ...Q, .Q..]]
