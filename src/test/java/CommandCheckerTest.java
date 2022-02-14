import org.junit.Assert;
import org.junit.Test;
public class CommandCheckerTest {
    CommandChecker commandChecker = new CommandLine();
    @Test
    public void isNumberTest(){
        final boolean checker = false;

        final boolean result = commandChecker.isNumber("d");
        Assert.assertFalse(String.valueOf(checker), result);
    }

    @Test
    public void formatTest(){
        final String[] arr = {"L","1","2","6","2"};
        Command command = new Command("   L  1   2  6  2    ");
        final String[] arrCommand = commandChecker.format(command);
        Assert.assertArrayEquals(arr, arrCommand);
    }
}

