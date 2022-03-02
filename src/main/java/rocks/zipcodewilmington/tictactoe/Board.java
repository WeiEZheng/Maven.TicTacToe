package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] boardState;

    public Board(Character[][] matrix) {
        boardState = matrix;
    }

    public Boolean isInFavorOfX() {return getWinner().equalsIgnoreCase("X");}

    public Boolean isInFavorOfO() {
        return getWinner().equalsIgnoreCase("O");
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        String winner="";
        if ((boardState[0][0] == boardState[1][1]) &&
                (boardState[0][0] == boardState[2][2])) {
            winner = boardState[0][0].toString();
        }
        else if ((boardState[3][1] == boardState[1][3]) &&
                (boardState[3][1] == boardState[2][2])) {
            winner = boardState[3][1].toString();
        }
        else{
            for (int i=0;i>3;i++) {

            }
        }
        return winner;
    }

}
