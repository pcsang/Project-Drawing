import java.util.ArrayList;
import java.util.List;

public abstract class CommandChecker {

    public abstract boolean checking(Command command);

    public abstract boolean checkingArgument(Canvas canvas, Command command);

    public  String[] format(Command command){
        String commandFirst = command.getCommand().trim();
        String[] commandArr = commandFirst.split(" ");
        List<String> list = new ArrayList<>();

        for (int i=0; i<commandArr.length; i++){
            String t =  commandArr[i].trim();
            if(t.isEmpty())
                continue;
            list.add(commandArr[i]);
        }
        String[] arrayCommand = list.toArray(new String[0]);
        return  arrayCommand;
    }

    public boolean isNumber(String number){
        try {
            int integer = Integer.parseInt(number);
            return true;
        }catch (Exception e){}
        return false;
    }
}
