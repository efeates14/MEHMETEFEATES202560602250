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
        status = "not started";

    }
public boolean startGame(int numRows, int numCols) {
    if (numRows < 5 || numRows > 12 || numCols < 5 || numCols > 12) {
        return false;

    }
    map = new char[numRows][numCols];
    for(int r = 0 ;r< numRows ; r++){
        for (int c = 0 ;c <numCols;c++){
            map[r][c]='.';

        }
    }
}
