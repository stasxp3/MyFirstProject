import java.util.Random;

public class StartNewGame {
    final int MIN_SIZE = 3;
    final int MAX_SIZE = 50;
    final int DEFAULT_SIZE = 10;
    Cell[][] field;

    public StartNewGame(){
        makeEmpty(DEFAULT_SIZE);
        System.out.println(toString());
    }
    public StartNewGame(int a){
        if(a < MIN_SIZE || a > MAX_SIZE) {
            a = DEFAULT_SIZE;
        }
        makeEmpty(a);
        createMaze(a-1);
        System.out.println(toString());
    }
    private void makeEmpty(int a){
        field = new Cell[a][a];
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < a; j++)
            {
                    field[i][j] = new Cell(i,j);
                    if(field[i][j].getCol() == 0 || field[i][j].getCol() == (a-1) || field[i][j].getRow() == 0 || field[i][j].getRow() == (a-1)) {
                    field[i][j].setValue(" * ");
                }
            }

        }
    }

    @Override
    public String toString() {
        String ret = "";
        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field[i].length; j++)
            {
                ret = ret + field[i][j].toString();
            }
            ret = ret + "\n";
        }
        return ret;
    }
    public void createMaze (int a) {
        int rCol = randomStartCell(a);
        int rRow = randomStartCell(a);
        field[rCol][rRow].setValue(" * ");
    }
    private int randomStartCell(int a) {
        Random r = new Random();
        return r.nextInt(a-1)+1;
    }
}

