package game;

import GameUtils.Position;
import interfaces.Disc;
import interfaces.PlayableLogic;
import players.Player;
import discs.
import java.util.List;

public class  GameLogic implements PlayableLogic {

    /**
     * Attempt to locate a disc on the game board.
     *
     * @param a    The position for locating a new disc on the board.
     * @param disc
     * @return true if the move is valid and successful, false otherwise.
     */
    @Override
    public boolean locate_disc(Position a, Disc disc) {
        return false;
    }

    /**
     * Get the disc located at a given position on the game board.
     *
     * @param position The position for which to retrieve the disc.
     * @return The piece at the specified position, or null if no disc is present.
     */
    @Override
    public Disc getDiscAtPosition(Position position) {
        return null;
    }

    /**
     * Get the size of the game board.
     *
     * @return The size of the game board, typically as the number of rows or columns.
     */
    @Override
    public int getBoardSize() {
        return 0;
    }

    /**
     * Get a list of valid positions for the current player.
     *
     * @return A list of valid positions where the current player can place a disc.
     */
    @Override
    public List<Position> ValidMoves() {
        return List.of();
    }

    /**
     * The number of discs that will be flipped
     *
     * @param a
     * @return The number of discs that will be flipped if a disc will be placed in the 'a'.
     */
    @Override
    public int countFlips(Position a) {
        return 0;
    }

    /**
     * Get the first player.
     *
     * @return The first player.
     */
    @Override
    public Player getFirstPlayer() {
        return null;
    }

    /**
     * Get the second player.
     *
     * @return The second player.
     */
    @Override
    public Player getSecondPlayer() {
        return null;
    }

    /**
     * Set both players for the game.
     *
     * @param player1 The first player.
     * @param player2 The second player.
     */
    @Override
    public void setPlayers(Player player1, Player player2) {

    }

    /**
     * Check if it is currently the first player's turn.
     *
     * @return true if it's the first player's turn, false if it's the second player's turn.
     */
    @Override
    public boolean isFirstPlayerTurn() {
        return false;
    }

    /**
     * Check if the game has finished, indicating whether a player has won or if it's a draw.
     *
     * @return true if the game has finished, false otherwise.
     */
    @Override
    public boolean isGameFinished() {
        return false;
    }

    /**
     * Reset the game to its initial state, clearing the board and player information.
     */
    @Override
    public void reset() {

    }

    /**
     * Undo the last move made in the game, reverting the board state and turn order.
     * Works only with 2 Human Players, and does not work when AIPlayer is playing.
     */
    @Override
    public void undoLastMove() {

    }
}
