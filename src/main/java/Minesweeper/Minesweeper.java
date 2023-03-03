package Minesweeper;

public class Minesweeper {


    public static void main(String[] args) {
        Board board = new Board(4,4);
        board.printMap();
        board.setMine(1,1);
        board.setMine(3,1);
        board.setMine(2,1);
        board.setMine(1,2);
        board.solveMap();


    }


}
