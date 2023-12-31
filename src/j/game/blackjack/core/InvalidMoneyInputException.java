package j.game.blackjack.core;

public class InvalidMoneyInputException extends Exception {
    public InvalidMoneyInputException() {
        super("You entered invalid number! Try again.");
    }
}
