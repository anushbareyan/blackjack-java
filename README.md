# Console Blackjack Game
This is a simple console-based implementation of the popular card game Blackjack (also known as 21). The game is written in Java and operates within the console/terminal. The game was created as a final project for the OPP course.

## Features

- **Multiplayer Gameplay**: Play against the dealer and other participants or alone.
- **Card Deck**: Uses a standard 52-card deck.
- **Betting System**: Each participant starts with $100 and bets in each round.
- **Objective**: The winner is determined by the participant with the most money after a certain number of rounds or a specific ending condition.

## Classes

- `Bank.java`: Manages the bankroll for participants.
- `Blackjack.java`: Controls the game flow and rules.
- `Card.java`: Represents a playing card.
- `Dealer.java`: Handles dealer-related actions.
- `Deck.java`: Manages the deck of cards.
- `Hand.java`: Represents a participant's hand.
- `Participant.java`: Defines basic participant attributes.
- `Player.java`: Manages player-related actions.
- `BlackjackConsole.java`: Handles console-based interactions.
- `Main.java`: Entry point of the application.

### Prerequisites

- **Java**: Ensure you have Java installed on your machine.

### Running the Game

1. Clone this repository to your local machine
2. Navigate to the project directory
3. Compile the Java files
4. Run the Main.java file


## Game Instructions

- **Objective**: Accumulate the most money by playing Blackjack rounds.
- **Betting**: Each participant starts with $100 and bets in each round.
- **Actions**: Players can Hit, Stand, Double Down, or Split their hands.
- **Winner**: The player with the most money 

## Game Flow

1. **Initialization**: Participants receive $100 each.
2. **Round Start**: Bets are placed, and cards are dealt.
3. **Player's Turn**: Players make their moves based on their hand and game rules.
4. **Dealer's Turn**: Dealer reveals cards and plays according to rules.
5. **Outcome**: Winners/losers are determined based on the hand values.
