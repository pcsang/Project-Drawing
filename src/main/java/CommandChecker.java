import java.util.ArrayList;
import java.util.List;

public abstract class CommandChecker {

    public abstract boolean checking(Command command);

    public abstract boolean checkingArgument(Canvas canvas, Command command);

    public  String[] format(Command command){
        String commandfirst = command.getCommand().trim();
        String[] arrcommand = commandfirst.split(" ");
        List<String> list = new ArrayList<>();

        for (int i=0; i<arrcommand.length; i++){
            String t =  arrcommand[i].trim();
            if(t.isEmpty())
                continue;
            list.add(arrcommand[i]);
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
