public class Cell {
    private int col;
    private int row;
    private String s;
    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
        s = " . ";
    }


    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public  void setValue(String t) {
        s = t;
    }

    public  int getCol() {
        return col;
    }

    public  int getRow() {
        return row;
    }

    @Override
    public String toString() {
        return s;
    }
}
