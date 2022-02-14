import org.junit.Assert;
import org.junit.Test;

public class CommandSquaresTest {
    Command comamd = new Command();
    Canvas canvas = new Canvas(4,20);
    CommandChecker square = new CommandSquares();
    final String checkerTrue = "true";
    final String checkerFalse = "false";

    @Test
    public void checkingArgumentTest(){
        comamd.setCommand("R 14 1 20 3");
        final boolean result = square.checkingArgument(canvas, comamd);
        Assert.assertTrue(checkerTrue, result);
    }

    @Test
    public void checkingArgumentTestOut(){
        comamd.setCommand("R 14 1 21 3");
        final boolean result = square.checkingArgument(canvas,comamd);
        Assert.assertFalse(checkerFalse, result);
    }

    @Test
    public void checkingTest(){
        comamd.setCommand("R 14 1 18 3");
        final boolean result = square.checking(comamd);
        Assert.assertTrue(checkerTrue, result);
    }

    @Test
    public void checkingTestKey(){
        comamd.setCommand("L 14 1 18 2");
        final boolean result = square.checking(comamd);
        Assert.assertFalse(checkerFalse, result);
    }

    @Test
    public void checkingTestLength(){
        comamd.setCommand("R 14 1 18 2 10");
        final boolean result = square.checking(comamd);
        Assert.assertFalse(checkerFalse, result);
    }
}
