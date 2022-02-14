import java.sql.SQLOutput;

public class CommandCreat extends CommandChecker {
    public CommandCreat(){
        super();
    }

    @Override
    public boolean checking(Command command){
        boolean fag = false;
        String[] commandArr = super.format(command);

        if (commandArr.length == 3 && commandArr[0].equals("C")) {
            if (super.isNumber(commandArr[1]) && super.isNumber(commandArr[2])) {
                fag = true;
            } else
                System.out.println("The argument dose not match!!!");
        }
        return fag;
    }

    @Override
    public boolean checkingArgument(Canvas canvas, Command command){
        boolean fag = false;
        String[] commandArr = super.format(command);
        int height = Integer.parseInt(commandArr[1]);
        int width = Integer.parseInt(commandArr[2]);
        if(height > 0 && width > 0){
            fag = true;
        }else
            System.out.println("Please check the argument!!! ");
        return fag;
    }
}
