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

    public Boolean isTie() {return getWinner()=="";}

    public String getWinner() {
        String winner="";
        if ((boardState[0][0] == boardState[1][1]) &&
                (boardState[0][0] == boardState[2][2])) {
            winner = boardState[0][0].toString();
        }
        else if ((boardState[2][0] == boardState[0][2]) &&
                (boardState[2][0] == boardState[1][1])) {
            winner = boardState[1][1].toString();
        }
        else{
            for (int i=0;i<3;i++) {
                if ((boardState[i][0] == boardState[i][1]) &&
                        (boardState[i][0] == boardState[i][2])){
                    winner = boardState[i][0].toString();
                    break;
                }
                else if ((boardState[0][i] == boardState[1][i]) &&
                        (boardState[0][i] == boardState[2][i])){
                    winner = boardState[0][i].toString();
                    break;
                }
            }
        }
        return winner;
    }

}
