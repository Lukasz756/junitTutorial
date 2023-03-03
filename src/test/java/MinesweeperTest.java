import Minesweeper.Board;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinesweeperTest {
    @Test
    public void testCreate(){
        int width = 5;
        int height = 5;
        Board board = new Board(width, height);
        board.setMine(1,0);
        Assertions.assertNotNull(board);
        Assertions.assertEquals('*',board.getValue(1,0));
        Assertions.assertEquals('.',board.getValue(0,0));

    }
}
