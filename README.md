# Conway's Game of Life

A simple Java implementation of Conway's Game of Life using a terminal-based grid display.

## Features

- User-defined grid size
- Custom alive cell positions
- Multiple generations simulation
- Terminal visualization using:
  - `█` for alive cells
  - `░` for dead cells

## Rules

1. A live cell with fewer than 2 neighbors dies.
2. A live cell with 2 or 3 neighbors survives.
3. A live cell with more than 3 neighbors dies.
4. A dead cell with exactly 3 neighbors becomes alive.

## Compile and Run

```bash
javac Main.java
java Main
