package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Board(Character[][] matrix) {
    }

    public Boolean isInFavorOfX() {return getWinner().equalsIgnoreCase("X");}

    public Boolean isInFavorOfO() {
        return getWinner().equalsIgnoreCase("O");
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}
