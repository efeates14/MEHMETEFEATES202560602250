public class Expedition {

    private char[][] map;
    private int rows;
    private int cols;
    private int row;
    private int column;
    private int energy;
    private int maxEnergy;
    private int collectedRelics;
    private int requiredRelics;
    private int moves;
    private String status;


    public Expedition(){
        map new char[0][0];
        rows = 0;
        cols = 0;
        row = -1;
        column = -1;
        energy = 0;
        maxEnergy = 0;
        collectedRelics = 0;
        requiredRelics = 0;
        moves = 0;
        status = "NOT_STARTED";

    }
public boolean startNewGame(int numRows, int numCols) {
    if (numRows < 5 || numRows > 12 || numCols < 5 || numCols > 12) {
        return false;

    }
    map = new char[numRows][numCols];
    for(int r = 0 ;r< numRows ; r++){
        for (int c = 0 ;c <numCols;c++){
            map[r][c]='.';

        }
    }
    map[0][0] = 'S';

    rows = numRows;
    cols = numCols;
    row = 0;
    column = 0;
    maxEnergy = 4 * numRows * numCols;
    energy = maxEnergy;
    collectedRelics = 0;
    requiredRelics = 3;
    moves = 0;
    status = "ACTIVE";
    return true;
}

    public char[][] getMap() {
        char[][] copy = new char[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                copy[r][c] = map[r][c];
            }
        }
        return copy;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public int getCollectedRelics() {
        return collectedRelics;
    }

    public int getRequiredRelics() {
        return requiredRelics;
    }

    public int getMoves() {
        return moves;
    }

    public String getStatus() {
        return status;
    }

    public int getScore() {
        // Before a game starts, relics and energy are both 0, so the score is 0.
        return 100 * collectedRelics + 5 * energy;
    }

    public String move(String direction) {
        return "NOT_ACTIVE";
    }

    public String execute(String command) {
        return "INVALID_COMMAND";
    }

    public String renderMap() {
        return "";
    }
}
