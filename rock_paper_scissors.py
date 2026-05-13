"""
PSEUDOCODE:
1. Ask Player 1 to enter rock, paper, or scissors
2. Ask Player 2 to enter rock, paper, or scissors
3. If both choices are the same:
   - Print "Tie"
4. If Player 1 chooses rock:
   - If Player 2 chooses scissors:
        Print "Player 1 wins"
   - If Player 2 chooses paper:
        Print "Player 2 wins"
5. If Player 1 chooses paper:
   - If Player 2 chooses rock:
        Print "Player 1 wins"
   - If Player 2 chooses scissors:
        Print "Player 2 wins"
6. If Player 1 chooses scissors:
   - If Player 2 chooses paper:
        Print "Player 1 wins"
   - If Player 2 chooses rock:
        Print "Player 2 wins"
"""

player1 = input("Player 1 - Enter rock, paper, or scissors: ").lower()
player2 = input("Player 2 - Enter rock, paper, or scissors: ").lower()

if player1 == player2:
    print("Tie")
else:
    if player1 == "rock":
        if player2 == "scissors":
            print("Player 1 wins")
        else:
            print("Player 2 wins")
    elif player1 == "paper":
        if player2 == "rock":
            print("Player 1 wins")
        else:
            print("Player 2 wins")
    elif player1 == "scissors":
        if player2 == "paper":
            print("Player 1 wins")
        else:
            print("Player 2 wins")
    else:
        print("Invalid input! Please use rock, paper, or scissors")
