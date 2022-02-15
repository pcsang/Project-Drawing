import org.junit.Assert;
import org.junit.Test;

public class CommandColorTest {
    Command command = new Command();
    CommandChecker colorCommand = new CommandColor();
    Canvas canvas =  new Canvas(4, 20);
    final String checkerFalse = "false";
    final String checkerTrue = "true";

    @Test
    public void isCharTest(){
        String color = "c";
        CommandColor command = new CommandColor();
        final boolean result = command.isChar(color);
        Assert.assertTrue(checkerTrue, result);
    }

    @Test
    public void isCharTestNotChar(){
        String color = "ca";
        CommandColor command = new CommandColor();
        final boolean result = command.isChar(color);
        Assert.assertFalse(checkerFalse, result);
    }

    @Test
    public void checkingTest(){
        command.setCommand("B 10 3 c");
        final boolean result = colorCommand.checking(command);
        Assert.assertTrue(checkerTrue, result);
    }

    @Test
    public void checkingTestKey(){
        command.setCommand("A 10 3 c");
        final boolean result = colorCommand.checking(command);
        Assert.assertFalse(checkerFalse, result);
    }

    @Test
    public void checkingTestLength(){
        command.setCommand("B 10 3 c 1");
        final boolean result = colorCommand.checking(command);
        Assert.assertFalse(checkerFalse, result);
    }

    @Test
    public void checkingTestNotInteger(){
        command.setCommand("B 10 a c");
        final boolean result = colorCommand.checking(command);
        Assert.assertFalse(checkerFalse, result);
    }

    @Test
    public void checkingArgumentTest(){
        command.setCommand("B 20 4  c");
        final boolean result = colorCommand.checkingArgument(canvas, command);
        Assert.assertTrue(checkerTrue, result);
    }

    @Test
    public void checkingArgumentTestOut(){
        command.setCommand("B 20 5 c");
        final boolean result = colorCommand.checkingArgument(canvas, command);
        Assert.assertFalse(checkerFalse, result);
    }
}
