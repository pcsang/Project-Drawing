import org.junit.Assert;
import org.junit.Test;

public class CommandLineTest {
    CommandChecker line = new CommandLine();
    Command command = new Command("L   1  2    6  2");
    Canvas canvas = new Canvas(4, 20);
    @Test
    public void checkingTest(){
        final boolean checker = true;
        final boolean result = line.checking(command);
        Assert.assertTrue(String.valueOf(checker), result);
    }

    @Test
    public void checkingTestFalse(){
        final String checker = "false";
        Command commandFalse = new Command("L   12 3 4 a  ");
        final boolean result = line.checking(commandFalse);
        Assert.assertFalse(checker, result);
    }

    @Test
    public void checkingTestLength(){
        final String checker = "false";
        Command commandFalse = new Command("L   12 3 4 a a 1 2 ");
        final boolean result = line.checking(commandFalse);
        Assert.assertFalse(checker, result);
    }

    @Test
    public void checkingArgumentTest(){
        final String checker = "true";
        final boolean result = line.checkingArgument(canvas, command);
        Assert.assertTrue(checker, result);
    }

    @Test
    public void checkingArgumentTestFalse(){
        final String checker = "false";
        Command commandFalse = new Command("L 1  2 5 25");
        final boolean result = line.checkingArgument(canvas, commandFalse);
        Assert.assertFalse(checker, result);
    }
}
