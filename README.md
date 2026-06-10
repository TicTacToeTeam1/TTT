# 🎮 Tic Tac Toe

Representation of the classic **Tic Tac Toe** game built with Java and displayed through the terminal.  
Team project developed using **Mob Programming** methodology at **FemCoders Bootcamp 2026**.

---

## 📋 About

Two players (**X** and **O**) compete on a 3x3 grid. Player X always goes first. The first player to align three marks horizontally, vertically, or diagonally wins. If the board fills up with no winner, the game ends in a draw.

---

## 🛠️ Tech Stack

| Technology / Tool | Version |
|-------------------|---------|
| Java | 25 |
| JUnit | 5.x |
| Visual Studio Code | Latest stable |
| Git / GitHub | — |
| Jira | — |

> 🔗 **Jira Board:** [TTT Backlog](https://fabileoruf.atlassian.net/jira/software/projects/TTT/boards/35/backlog)  
> 🔗 **Repository:** [TicTacToeTeam1/TTT](https://github.com/TicTacToeTeam1/TTT)

---

## 🚀 How to Run

**Clone the repository**

```bash
git clone https://github.com/TicTacToeTeam1/TTT.git
cd TTT
```

**Compile**

```bash
javac -d out src/main/java/*.java
```

**Run**

```bash
java -cp out Main
```

---

## 🧪 How to Run Tests

**With Maven**

```bash
mvn test
```

**With Gradle**

```bash
gradle test
```

---

## 🌳 Project Tree

```
TTT/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── Board.java        # Board logic
│   │       ├── Game.java         # Game flow control
│   │       ├── Player.java       # Player model
│   │       ├── Display.java      # Terminal display
│   │       └── Main.java         # Entry point
│   └── test/
│       └── java/
│           ├── BoardTest.java
│           └── GameTest.java
└── README.md
```

---

## ✅ Functional Requirements

- **MUST** display an empty board at the start of the game.
- **MUST** display the current board state after each move.
- **MUST** allow players to take turns — X first, then O.
- **MUST** accept moves by row and column number input.
- **MUST** verify the selected cell is empty before placing a mark, and show an error if it is already taken.
- **MUST** check for a winner after every move.
- **MUST** check for a winner or a draw when the board is full.
- **MUST** display a message announcing the winner or a draw.

---

## ⚙️ Non-Functional Requirements

- Terminal-only interface.
- Minimum memory usage; clean code following Java conventions.
- Clear naming for classes, attributes, and methods.
- Unit tests with JUnit.
- Single Responsibility Principle (S from SOLID).

---

## 🎯 Demo

```
 _ | _ | _
 _ | _ | _
 _ | _ | _

Player X's turn
Enter row (0-2): 1
Enter column (0-2): 1

 _ | _ | _
 _ | X | _
 _ | _ | _

Player O's turn
Enter row (0-2): 0
Enter column (0-2): 0

 O | _ | _
 _ | X | _
 _ | _ | _

...

🎉 Player X wins!
```

---

## 📅 Planning

| Phase | Description |
|-------|-------------|
| 1 | Class modeling and project structure |
| 2 | Board implementation and game logic |
| 3 | Input validation and winner/draw detection |
| 4 | Terminal display |
| 5 | Unit tests |
| 6 | Code review and presentation |

---

## 👩‍💻 Mob Programming Methodology

The team worked using **Mob Programming**, rotating roles every 15 minutes:

| Role | Responsibility |
|------|---------------|
| 🖊️ **Driver** | Writes the code at the keyboard |
| 🧭 **Navigators** | Guide, propose ideas, and review without touching the keyboard |
| ⏱️ **Timekeeper** | Controls time and coordinates role changes |

---

## 👥 Authors

| Name | Role | GitHub |
|------|------|--------|
| Fabiana Leonardo | Scrum Master & Developer | [@fabileoruf](https://github.com/fabileoruf) |
| Chiara Di Maio | Product Owner & Developer | [@Kressala](https://github.com/Kressala) |
| Ivanna Caraccio Ayala | Developer | [@IvannaRCA](https://github.com/IvannaRCA) |
| Nira Mantilla | Developer | [@nmantilla12](https://github.com/nmantilla12) |
| Nayeli Córdova Mendoza | Developer | [@nagicome03](https://github.com/nagicome03) |

---

## 📄 License

This project was developed for educational purposes within the **FemCoders Bootcamp 2026**.
