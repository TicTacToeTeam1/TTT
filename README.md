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
│   │       ├── App.java        # Game flow control
│   │       ├── Board.java         # Board logic
│   │       ├── Player.java       # Player model
│   └── test/
│       └── java/
│           ├── BoardTest.java
│           └── PlayerTest.java
└── README.md
```


## 🎯 Demo

```
Juguemos tic tac toe
Objetivo: en un tablero de 3x3, debes completar con 3 símbolos (X o O) una fila, columna o diagonal para ganar el juego.
Introduce un nombre para la primera jugadora: holi
Introduce un nombre para la segunda jugadora: adios
Jugadora holi eres X
Jugadora adios eres O
 _  _  _
 _  _  _
 _  _  _

Turno de: holi
Selecciona una fila y columna (1-3): 1 2
 _  X  _
 _  _  _
 _  _  _

Turno de: adios
Selecciona una fila y columna (1-3): 2 2

 _  X  _
 _  O  _
 _  _  _

...

¡holi ha ganado la partida!
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
