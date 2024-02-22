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
        System.out.println(toString());
    }
    private void makeEmpty(int a){
        field = new Cell[a][a];
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < a; j++)
            {
                field[i][j] = new Cell();
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
}

