import Minesweeper.Board;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinesweeperTest {
    @Test
    public void testCreate(){
        int width = 5;
        int height = 5;
        Board board = new Board(width, height);
        Assertions.assertNotNull(board);
        Assertions.assertEquals(0,board.getValue(1,0));

    }
}
